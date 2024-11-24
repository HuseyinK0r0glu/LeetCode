class Solution {
    public static List<String> removeAnagrams(String[] words) {

        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for(String word : words) {
            if(stack.isEmpty()) {
                stack.push(word);
            }else {
                Map<Character,Integer> map1 = new HashMap<>();
                Map<Character,Integer> map2 = new HashMap<>();

                for(char c : word.toCharArray()) {
                    map1.put(c, map1.getOrDefault(c, 0) + 1);
                }

                for(char c : stack.peek().toCharArray()) {
                    map2.put(c, map2.getOrDefault(c, 0) + 1);
                }

                if(!map1.equals(map2)) {
                    stack.push(word);
                }

            }
        }

        while(!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list.reversed();
    }
}