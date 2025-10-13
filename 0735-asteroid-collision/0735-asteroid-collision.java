class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                boolean exploded = false;
                while (!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.peek() < -a) {
                        stack.pop(); 
                    } else if (stack.peek() == -a) {
                        stack.pop(); 
                        exploded = true;
                        break;
                    } else {
                        exploded = true;
                        break;
                    }
                }
                if (!exploded) {
                    stack.push(a);
                }
            }
        }
        
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}