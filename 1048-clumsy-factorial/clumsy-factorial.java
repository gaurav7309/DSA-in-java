import java.util.*;

class Solution {
    public int clumsy(int n) {

        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        int i = n;

        while (i >= 1) {

            if (i >= 1) {
                st.push(i--);
                op.push('*');
            }

            if (i >= 1) {
                st.push(i--);
                op.push('/');
            }

            if (i >= 1) {
                st.push(i--);
                op.push('+');
            }

            if (i >= 1) {
                st.push(i--);
                op.push('-');
            }
        }

        op.pop();

        Stack<Integer> st1 = new Stack<>();
        while (!st.isEmpty()) {
            st1.push(st.pop());
        }
        
        Stack<Character> op1 = new Stack<>();

        while (!op.isEmpty()) {
            op1.push(op.pop());
        }

      
        Stack<Integer> nums = new Stack<>();
        Stack<Character> operators = new Stack<>();

        nums.push(st1.pop());
        while (!op1.isEmpty()) {
            char x = op1.pop();
            int y = st1.pop();
            if (x == '*' || x == '/') {
                int a = nums.pop();

                if (x == '*') {
                    nums.push(a * y);
                } else {
                    nums.push(a / y);
                }

            } else {
                nums.push(y);
                operators.push(x);
            }
        }
        Stack<Integer> finalNums = new Stack<>();
        while (!nums.isEmpty()) {
            finalNums.push(nums.pop());
        }

        Stack<Character> finalOperators = new Stack<>();
        while (!operators.isEmpty()) {
            finalOperators.push(operators.pop());
        }

       
        int re = finalNums.pop();

        while (!finalOperators.isEmpty()) {

            char x = finalOperators.pop();
            int y = finalNums.pop();

            if (x == '+') {
                re = re + y;
            } else {
                re = re - y;
            }
        }
      

        return re;
    }
}