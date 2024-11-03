class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        backtrack(tiles,set,0,"");
        return set.size();
    }
    
    public void backtrack(String tiles,Set<String> set,int index,String current){

        for(int i = index;i<tiles.length();i++){
            String temp = current;
            current += tiles.charAt(i);
            permute(current,set,0,current.length()-1);
            backtrack(tiles,set,i+1,current);
            current = temp;
        }
        
    }
    
    public void permute(String current,Set<String> set,int left,int right){
        
        if(left == right){
            set.add(current);
        }
        
        else {
            for(int i = left;i<=right;i++){
                current = swap(current,left,i);
                permute(current,set,left+1,right);
                current = swap(current,left,i);
            }
        }
        
    }
    
    public String swap(String str,int i,int j){

        char[] charArray = str.toCharArray();

        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }
    
}