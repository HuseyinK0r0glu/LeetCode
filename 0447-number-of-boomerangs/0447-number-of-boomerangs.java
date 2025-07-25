import java.util.*;

class Solution {
    public int numberOfBoomerangs(int[][] points) {

        int boomerangs = 0;

        for(int i = 0; i < points.length; i++){
            Map<Double,Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                if(j == i) continue;
                double distance = getDistance(points[i],points[j]);
                map.put(distance,map.getOrDefault(distance,0)+1);
            }
            for(double d : map.keySet()){
//                if(points[i][0] == 1 && points[i][1] == 0) {
//                }
                if(map.get(d) == 2){
                    System.out.println(points[i][0] +  " " + points[i][1]);
                    System.out.println(d);
                }
                boomerangs += map.get(d) * (map.get(d) - 1 );
            }
        }

        return boomerangs;
    }

    public double getDistance(int[]  p1, int[] p2){
        int dx = p2[0] - p1[0];
        int dy = p2[1] - p1[1];
        return Math.sqrt(dx * dx + dy * dy);
    }

}