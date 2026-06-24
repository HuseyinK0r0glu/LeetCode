class Solution {
    public int[][] imageSmoother(int[][] img) {

        int[][] res = new int[img.length][img[0].length];

        for(int i = 0; i < img.length; i++){
            for (int j = 0 ; j < img[0].length; j++){
                int sum = img[i][j];
                int count = 1;
                if(i != 0){
                    sum += img[i-1][j];
                    count++;
                }
                if(j != 0){
                    sum += img[i][j-1];
                    count++;
                }
                if(i != img.length-1){
                    sum += img[i+1][j];
                    count++;
                }
                if(j != img[0].length-1){
                    sum += img[i][j+1];
                    count++;
                }
                if(i != 0 && j!= 0){
                    sum += img[i-1][j-1];
                    count++;
                }
                if(i != 0 && j!= img[0].length-1){
                    sum += img[i-1][j+1];
                    count++;
                }
                if(i != img.length-1 && j!= 0){
                    sum += img[i+1][j-1];
                    count++;
                }
                if(i != img.length-1 && j!= img[0].length-1){
                    sum += img[i+1][j+1];
                    count++;
                }
                res[i][j] = (int) Math.floor((double) sum /count);
            }
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna