class Solution {
    public int[] twoSum(int[] nums, int target) {


        //key = number at I, val = index
        HashMap<Integer, Integer> containsTarget = new HashMap<>();
        int answer[] = new int[2];
         
        for(int i = 0; i < nums.length; i++){
            int targetNumber = target - nums[i];
            if(containsTarget.containsKey(targetNumber)){
                answer[0] = containsTarget.get(targetNumber);
                answer[1] = i;
                return answer;
            } else {
                containsTarget.put(nums[i],i);
            }


        }

        return answer;
        
    }
}
