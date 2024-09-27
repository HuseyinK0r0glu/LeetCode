class Solution {
    public double average(int[] salary) {
        
        int N = salary.length;
        
        int max = salary[0];
        int min = salary[0];
        double average = 0;
        
        for(int i : salary){
            
            average += i;
            
            if(i < min){
                min = i;
            }
            
            if(i>max){
                max = i;
            }
            
        }
        
        Double result = (average-min-max)/(N-2);
        
        return result;
        
        
        // second way
        /*)
        int N = salary.length;
        
        for(int i=0;i<N;i++){
            
            int min = i;
            
            for(int j = i+1;j<N;j++){
                
                if(salary[j] < salary[min]){
                    min = j;
                }
                
            }
            
            int temp = salary[i];
            salary[i] = salary[min];
            salary[min] = temp;
            
        }
        
        
        int average = 0;
        
        for(int i = 1;i<N-1;i++){
            
            average += salary[i];
            
        }
        
        return average/(N-2);*/
        
    }
}