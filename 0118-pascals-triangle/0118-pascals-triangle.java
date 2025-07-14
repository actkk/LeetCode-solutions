class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> PascalTriangle = new ArrayList<>();
    List<Integer> old = new ArrayList<>();
    old.add(1);
    PascalTriangle.add(old);
      for(int i = 1 ; i < numRows;i++){
        List<Integer> newlist = new ArrayList<>();
        newlist.add(old.get(0));
        for(int j =1; j<old.size(); j++)
        {
        newlist.add(old.get(j-1)+old.get(j));
            
        }
        newlist.add(old.get(0));
        PascalTriangle.add(newlist);
        old = newlist;

      }
      return PascalTriangle;
    }
}