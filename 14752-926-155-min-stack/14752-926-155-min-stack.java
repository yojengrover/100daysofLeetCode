

class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = 0;
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } else {
            if (val >= min) {
                st.push((long) val);
            } else {
                st.push(2L * val - min);  // Encoded value
                min = val;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long top = st.pop();
        if (top < min) { // Encoded value detected
            min = 2 * min - top;
        }

        if (st.isEmpty()) {
            min = 0; // Reset when empty
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long top = st.peek();
        return (top < min) ? (int) min : (int) top;
    }

    public int getMin() {
        if (st.isEmpty()) return Integer.MAX_VALUE;
        return (int) min;
    }
}



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */