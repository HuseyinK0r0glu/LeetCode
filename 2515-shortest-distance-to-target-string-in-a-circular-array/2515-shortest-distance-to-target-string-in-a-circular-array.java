class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {

        int closest = Integer.MAX_VALUE;

        for(int i = startIndex; i < words.length; i++) {
            if(words[i].equals(target)) {
                closest = Math.min(Math.abs(i - startIndex), closest);
                closest = Math.min(words.length - Math.abs(i - startIndex), closest);
            }
        }

        for(int i = startIndex; i>=0; i--) {
            if(words[i].equals(target)) {
                closest = Math.min(Math.abs(i - startIndex), closest);
                closest = Math.min(words.length - Math.abs(i - startIndex), closest);
            }
        }

        if(closest == Integer.MAX_VALUE) return -1;
        return closest;
    }
}