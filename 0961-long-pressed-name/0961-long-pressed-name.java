class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int nameIndex = 0;
        int typedIndex = 0;

        while (nameIndex < name.length() && typedIndex < typed.length()) {
            char nameChar = name.charAt(nameIndex);
            int nameSameChar = 0;
            while(nameIndex < name.length() && nameChar == name.charAt(nameIndex)) {
                nameSameChar++;
                nameIndex++;
            }
            char typedChar = typed.charAt(typedIndex);
            int typedSameChar = 0;
            while(typedIndex < typed.length() && typedChar == typed.charAt(typedIndex)) {
                typedSameChar++;
                typedIndex++;
            }
            if(nameChar != typedChar) {
                return false;
            }
            if(nameSameChar > typedSameChar) {
                return false;
            }
        }

        return nameIndex == name.length() && typedIndex == typed.length();
    }
}