class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String[] textArr = text.split(" ");

        List<String> list = new ArrayList<>();

        for(int i = 0; i < textArr.length-2; i++){
            if(textArr[i].equals(first) && textArr[i+1].equals(second)){
                list.add(textArr[i+2]);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}