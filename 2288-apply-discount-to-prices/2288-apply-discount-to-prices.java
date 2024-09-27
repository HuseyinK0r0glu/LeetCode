class Solution {
    public String discountPrices(String sentence, int discount) {
        
        String[] arr = sentence.split(" ");
        
        String finalSentence = "";
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i].split("")[0].equals("$") && check(arr[i])){
                
                double result = Double.parseDouble(arr[i].replace("$",""));
                Double finalR = result - (result * (discount) /100);
                arr[i] = "$" + String.format("%.2f", finalR);
            }
            
        }
        

        for(int k = 0;k<arr.length;k++){
            
            if(k == arr.length -1){
                finalSentence += arr[k];
            }else {
                finalSentence = finalSentence + arr[k] + " ";
            }
            
        }
    
        return finalSentence;
    }
    
    
    public boolean check(String s){
        
        String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
        
        String[] a = s.split("");
        
        boolean isNumber = true;
        
        if(a.length == 1){
            return false;
        }
        
        for(int i = 1;i<a.length;i++){
            
            
            for(int j= 0;j<numbers.length;j++){
                
                if(numbers[j].equals(a[i])){
                    break;
                }
            
                if(j == numbers.length-1){
                    return false;
                }
            }
            
            
        }
        
        return isNumber;
        
    }
}