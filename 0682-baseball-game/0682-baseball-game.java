class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (op.equals("D")) {
                if (!stack.isEmpty()) {
                    stack.push(stack.peek() * 2);
                }
            } else if (op.equals("+")) {
                int last = stack.pop();
                int newTop = last + stack.peek();
                stack.push(last);
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}