class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mappingST = new HashMap<>();
        Map<Character, Character> mappingTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check mapping from s to t.
            if (mappingST.containsKey(c1)) {
                if (mappingST.get(c1) != c2) {
                    return false;
                }
            } else {
                mappingST.put(c1, c2);
            }

            if (mappingTS.containsKey(c2)) {
                if (mappingTS.get(c2) != c1) {
                    return false;
                }
            } else {
                mappingTS.put(c2, c1);
            }
        }
        return true;
    

        
    }
}