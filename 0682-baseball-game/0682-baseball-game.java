class Solution {
    public int calPoints(String[] operations) {
         int[] arr = new int[operations.length];
        int j = 0;

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("C")) {
                if (j > 0) {
                    j--; // son skoru geçersiz say
                    arr[j] = 0;
                }
            } else if (op.equals("D")) {
                if (j > 0) {
                    arr[j] = arr[j - 1] * 2;
                    j++;
                }
            } else if (op.equals("+")) {
                if (j >= 2) {
                    arr[j] = arr[j - 1] + arr[j - 2];
                } else if (j == 1) {
                    arr[j] = arr[j - 1];
                } else {
                    arr[j] = 0;
                }
                j++;
            } else {
                arr[j] = Integer.parseInt(op);
                j++;
            }
        }

        int sum = 0;
        for (int k = 0; k < j; k++) {
            sum += arr[k];
        }

        return sum;
    }
}