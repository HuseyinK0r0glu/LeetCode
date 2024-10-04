class Solution {
    public long dividePlayers(int[] skill) {
        
        Arrays.sort(skill);

        int oneTeamSkill = skill[0] + skill[skill.length-1];
        
        int left = 0;
        int right = skill.length-1;
        
        long result = 0;
        
        while(left < right){
            if(skill[left] + skill[right] != oneTeamSkill){
                return -1;
            }else {
                result += skill[left] * skill[right];
            }
            
            left++;
            right--;
        }
        
        
        return result;
    }
}