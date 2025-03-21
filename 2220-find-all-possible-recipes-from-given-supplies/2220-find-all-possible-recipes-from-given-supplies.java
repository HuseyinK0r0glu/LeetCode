class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        Map<String,List<String>> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(supplies));
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        for(int i = 0;i < recipes.length;i++) {
            map.put(recipes[i],ingredients.get(i));
            if(set.containsAll(ingredients.get(i))) {
                queue.add(recipes[i]);
            }
        }

        while(!queue.isEmpty()) {
            String s = queue.poll();

            if(set.contains(s)) {
                continue;
            }

            set.add(s);
            result.add(s);

            for(int j = 0;j < recipes.length;j++) {
                if(ingredients.get(j).contains(s)) {
                    if(set.containsAll(map.get(recipes[j]))) {
                        queue.add(recipes[j]);
                    }
                }
            }

        }

        return result;
    }
}