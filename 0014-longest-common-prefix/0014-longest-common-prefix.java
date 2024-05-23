class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 1){
            return strs[0];
        }
        
        int least = strs[0].length();
        String common = "";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length() < least){
                least = strs[i].length();
            }
        }

        for(int j=0;j<least;j++){
            boolean isCommon = false;
            String commonPrefix = "";
            for(int i=0;i<strs.length;i++){
                if(i < strs.length-1){
                    if(strs[i].charAt(j) == strs[i+1].charAt(j)){
                        if(!isCommon){
                            commonPrefix = commonPrefix + strs[i].charAt(j);
                        }
                    isCommon = true;
                    
                    }else {
                    isCommon = false;
                        if(common != ""){
                            return common;
                        }
                    return "";
                }
            }
                
        }
            if(isCommon){
                common = common + commonPrefix;
            }
    }
        
    return common;

        
    }
}