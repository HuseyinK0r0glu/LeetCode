/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {

        int totalImportance = 0;

        Map<Integer,Employee> map = new HashMap<>();

        for(Employee employee : employees) {
            map.put(employee.id, employee);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.add(id);

        while(!queue.isEmpty()) {
            int employeeId = queue.poll();
            totalImportance += map.get(employeeId).importance;
            List<Integer> list = map.get(employeeId).subordinates;
            for(int i : list) {
                if(!set.contains(i)) {
                    queue.add(i);
                }
            }
        }

        return totalImportance;
    }

}