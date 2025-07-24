import java.util.*;

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {

        Map<String,List<String>> map = new HashMap<>();

        for(String path : paths) {

            String[] values =  path.split(" ");
            String root = values[0];

            for(int i = 1; i < values.length; i++){
                String value =  values[i];
                int index = value.indexOf("(");
                String content = value.substring(index + 1, value.indexOf(")"));
                String filePlace = root + "/" + value.substring(0,index);
                if(map.containsKey(content)){
                    map.get(content).add(filePlace);
                }else {
                    List<String> list = new ArrayList<>();
                    list.add(filePlace);
                    map.put(content,list);
                }
            }
        }

        List<List<String>> result = new ArrayList<>();

        for(String path : map.keySet()){
            if(map.get(path).size()>1){
                result.add(new ArrayList<>(map.get(path)));
            }
        }

        return result;
    }
}