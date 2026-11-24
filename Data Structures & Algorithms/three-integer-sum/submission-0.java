
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sorting to apply two-pointer and avoid duplicates

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate 'i' values
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            result.addAll(twoSum(nums, -nums[i], i));
        }

        return result;
    }

    public List<List<Integer>> twoSum(int[] nums, int target, int i) {
        List<List<Integer>> pairs = new ArrayList<>();
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                pairs.add(Arrays.asList(-target, nums[left], nums[right]));

                // Skip duplicates
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return pairs;
    }
}
