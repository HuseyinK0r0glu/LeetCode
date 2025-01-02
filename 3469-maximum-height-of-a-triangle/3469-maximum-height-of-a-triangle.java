class Solution {
        public int maxHeightOfTriangle(int red, int blue) {
    
            int tempRed = red;
            int tempBlue = blue;
    
            int num = 1;
            int redTriangle = 0;
            int blueTriangle = 0;
    
            while(true){
                if(num % 2 == 1){
                    if(tempRed >= num){
                        tempRed -= num;
                        num++;
                        redTriangle++;
                    }else {
                        break;  
                    }
                }else {
                    if(tempBlue >= num){
                        tempBlue -= num;
                        num++;
                        redTriangle++;
                    }else {
                        break;
                    }
                }
            }
    
            num = 1;
            
            while(true){
                if(num % 2 == 0){
                    if(red >= num){
                        red -= num;
                        num++;
                        blueTriangle++;
                    }else {
                        break;  
                    }
                }else {
                    if(blue >= num){
                        blue -= num;
                        num++;
                        blueTriangle++;
                    }else{
                        break;
                    }
                }
            }
            return Math.max(redTriangle, blueTriangle);
        }
}