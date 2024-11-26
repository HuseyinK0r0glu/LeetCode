class Solution {
    public static int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for(String email : emails) {

            String tempString = "";

            int atIndex = email.indexOf('@');
            int plusIndex = email.indexOf('+');

            if(plusIndex >= 0) tempString = email.substring(0, plusIndex);
            else tempString = email.substring(0,atIndex);

            tempString = tempString.replace(".","");
            tempString += tempString + email.substring(atIndex);
            set.add(tempString);
        }
        return set.size();
    }
}