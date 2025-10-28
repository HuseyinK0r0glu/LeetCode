import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    Map<Integer,Integer> timeMap;
    Map<Integer,String> stationMap;
    Map<String,Double> averageTimeMap;
    Map<String,Integer> averageTimeCount;

    public UndergroundSystem() {
        timeMap = new HashMap<>();
        stationMap = new HashMap<>();
        averageTimeMap = new HashMap<>();
        averageTimeCount = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        timeMap.put(id,t);
        stationMap.put(id,stationName);
    }

    public void checkOut(int id, String stationName, int t) {
        int startTime =  timeMap.get(id);
        int timeTravel = t - startTime;
        timeMap.remove(id);
        String startingStation = stationMap.get(id);
        stationMap.remove(id);
        String stations = startingStation + " " +  stationName;
        double averageTime = averageTimeMap.getOrDefault(stations,0.0);
        double value = averageTime + timeTravel;
        averageTimeMap.put(stations, value);
        averageTimeCount.put(stations, averageTimeCount.getOrDefault(stations,0) + 1);
    }

    public double getAverageTime(String startStation, String endStation) {
        String stations = startStation +  " " + endStation;
        return averageTimeMap.get(stations) / averageTimeCount.get(stations);
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */