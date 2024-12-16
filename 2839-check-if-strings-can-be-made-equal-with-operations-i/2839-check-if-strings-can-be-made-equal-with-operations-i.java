class Solution {
    public static boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        char[] charArray1 = s1.toCharArray();

        char[] tempArray = charArray1.clone();
        char temp = tempArray[0];
        tempArray[0] = tempArray[2];
        tempArray[2] = temp;

        if (new String(tempArray).equals(s2)) return true;

        tempArray = charArray1.clone();
        temp = tempArray[1];
        tempArray[1] = tempArray[3];
        tempArray[3] = temp;

        if (new String(tempArray).equals(s2)) return true;

        tempArray = charArray1.clone();
        temp = tempArray[0];
        tempArray[0] = tempArray[2];
        tempArray[2] = temp;

        temp = tempArray[1];
        tempArray[1] = tempArray[3];
        tempArray[3] = temp;

        return new String(tempArray).equals(s2);
    }
}