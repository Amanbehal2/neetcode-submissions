class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: Frequency map
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Bucket sort based on frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // Step 3: Traverse buckets from high freq to low
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }

        // Step 4: Convert List<Integer> to int[]
        int[] topKArray = new int[k];
        for (int i = 0; i < k; i++) {
            topKArray[i] = result.get(i);
        }

        return topKArray;
    }
}
