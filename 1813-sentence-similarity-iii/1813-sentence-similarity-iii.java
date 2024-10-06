class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String[] array1 = sentence1.split(" ");
        String[] array2 = sentence2.split(" ");
        
        if(array1.length > array2.length){
            return areSentencesSimilar(sentence2,sentence1);
        }
        
        int smaller = array1.length;
        
        int con = 0;
        
        int left = 0;
        int right = smaller;
        int last = array2.length-1;
        
        while(left < right){
            if(array1[left].equals(array2[left])){
                con++;
                left++;
            }else if(array1[right-1].equals(array2[last--])){
                con++;
                right--;
            }else {
                break;
            }
            
        }
        
        return smaller == con;
        
    }
}