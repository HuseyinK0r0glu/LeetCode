class Solution {
    public int kSimilarity(String s1, String s2) {
        
        // if they are already equal
        if(s1.equals(s2)){
            return 0;
        }
        
        int n = s1.length();
        
        // breadth first search 
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        q.offer(s1);
        visited.add(s1);
        int swap = 0;
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i = 0;i<size;i++){
                
                String current = q.poll();
                
                if(current.equals(s2)){
                    return swap;
                }
                
                for(int j = 0;j<n;j++){
                    if(current.charAt(j) == s2.charAt(j)){
                        continue;
                    }
                    
                    for(int k = j+1;k<n;k++){
                        if(current.charAt(k) != s2.charAt(k) && current.charAt(k) == s2.charAt(j)){
                            
                            String swappS = swap(current,j,k);
                            if(!visited.contains(swappS)){
                                
                                visited.add(swappS);
                                q.offer(swappS);
                                
                            }
                        }
                    }
                    break;
                }
                
            }
            
            swap++;
            
        }
        
        return swap;
        
    }
    
    public String swap(String str , int j , int k){
        
        char[] chars = str.toCharArray();
        char temp = chars[j];
        chars[j] = chars[k];
        chars[k] = temp;
        
        return new String(chars);
         
    }
    
}