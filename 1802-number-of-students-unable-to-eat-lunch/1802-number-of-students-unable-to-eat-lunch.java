import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new ArrayDeque<>();

        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }

        for (int student : students) {
            q.offer(student);
        }

        int canEat = 0;
        int loop = q.size();
        int studentsGoingBack = 0;

        while(!q.isEmpty()){
            int studentWish =  q.poll();
            int theSandwich = st.peek();
            if(studentWish == theSandwich){
                canEat++;
                st.pop();
                loop =  q.size();
                studentsGoingBack = 0;
            }else{
                if(loop == studentsGoingBack) return students.length - canEat;
                q.offer(studentWish);
                studentsGoingBack++;
            }
        }

        return students.length - canEat;
    }
}