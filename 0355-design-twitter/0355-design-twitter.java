import java.util.*;

class Twitter {

    Map<Integer,List<Integer>> followMap;
    Map<Integer, PriorityQueue<int[]>> tweets;
    int index;

    public Twitter() {
        followMap = new HashMap<>();
        tweets = new HashMap<>();
        index = 0;
    }

    public void postTweet(int userId, int tweetId) {

        if(tweets.containsKey(userId)){
            int[] currentTweet = new int[2];
            // 0 index is the index of the tweet
            currentTweet[0] = index++;
            currentTweet[1] = tweetId;
            tweets.get(userId).add(currentTweet);
        }else {
            int[] currentTweet = new int[2];
            // 0 index is the index of the tweet
            currentTweet[0] = index++;
            currentTweet[1] = tweetId;
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> Integer.compare(b[0], a[0])
            );
            pq.offer(currentTweet);
            tweets.put(userId, pq);
        }

    }

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> feeds = new ArrayList<>();
        feeds.add(userId);
        feeds.addAll(followMap.getOrDefault(userId, new ArrayList<>()));

        List<Integer> feedTweets = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[0], a[0])
        );

        Set<Integer> visited = new HashSet<>();
        
        for (int user : feeds) {
            if (tweets.containsKey(user)) {
                pq.addAll(tweets.get(user));
            }
        }

        int count = 0;
        while (count < 10 && !pq.isEmpty()) {
            int value = (pq.poll()[1]);
            if(!visited.contains(value)) {
                feedTweets.add(value);
            }
            visited.add(value);
            count++;
        }

        return feedTweets;
    }

    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId, new ArrayList<>());
        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(Integer.valueOf(followeeId));
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */