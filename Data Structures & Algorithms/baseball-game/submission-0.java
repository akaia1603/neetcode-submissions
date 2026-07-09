class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String x : operations){
            if(x.equals("+")){
                int top = stack.pop();
                int newTop = stack.peek() + top;
                stack.push(top);
                stack.push(newTop);
            }else if(x.equals("C")){
                stack.pop();
            }else if(x.equals("D")){
                stack.push(stack.peek() * 2);
            } else stack.push(Integer.parseInt(x));
        }
        int total = 0;
        while(!stack.isEmpty()){
            total += stack.pop();
        }
        return total;
    }
}