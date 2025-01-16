class Solution {
        public int countKeyChanges(String s) {

        int change = 0;
        String newString = s.toLowerCase();

        for(int i = 0; i < newString.length()-1; i++) {
            if(newString.charAt(i) != newString.charAt(i+1)) {
                change++;
            }
        }

        return change;
    }
    /*
    public int countKeyChanges(String s) {

        int change = 0;

        for(int i = 0; i < s.length()-1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);

            if(Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                change++;
            }
        }

        return change;
    }
    */
    
}