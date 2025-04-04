class Solution {
    public String maximumTime(String time) {

        String[] times = time.split(":");

        String hour = times[0];
        String minute = times[1];

        StringBuilder result = new StringBuilder();

        if(hour.charAt(0) == '?'){
            char second = hour.charAt(1);
            if(second == '?'){
                result.append("2");
            }else {
                if(second == '0' || second == '1' || second == '2' || second == '3'){
                    result.append('2');
                }else {
                    result.append('1');
                }
            }
        }else {
            result.append(hour.charAt(0));
        }

        if(hour.charAt(1) == '?'){
            char first = hour.charAt(0);
            if(first == '?'){
                result.append('3');
            }else {
                if(first == '2'){
                    result.append('3');
                }else {
                    result.append('9');
                }
            }
        }else {
            result.append(hour.charAt(1));
        }

        result.append(':');

        if(minute.charAt(0) == '?'){
            result.append('5');
        }else {
            result.append(minute.charAt(0));
        }

        if(minute.charAt(1) == '?'){
            result.append('9');
        }else {
            result.append(minute.charAt(1));
        }
        return result.toString();
    }
}