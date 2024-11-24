    class CustomStack {

        int[] array;
        int top;
        int size = 0;

        public CustomStack(int maxSize) {
            size = maxSize;
            array = new int[size];
            top = -1;
        }

        public void push(int x) {

            if(top != size-1) {
                array[++top] = x;
            }

        }

        public int pop() {
            if(top == -1) {
                return -1;
            }
            return array[top--];
        }

        public void increment(int k, int val) {
            if(top < k) {
                for(int i = 0;i<top+1;i++) {
                    array[i] = array[i] + val;
                }
            }else {
                for(int i = 0;i<k;i++) {
                    array[i] = array[i] + val;
                }
            }
        }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */