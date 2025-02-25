//TC: O(n)
//SC: O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); //basecase
        int count = 0;
        int rSum = 0;
       
        
        for(int i=0; i<nums.length;i++){
            rSum += nums[i];  
            
            if(!map.containsKey(rSum)){
                 map.put(rSum,0);
            }
            if(map.containsKey(rSum-k)){
                count = count + map.get(rSum-k);      
            }
            map.put(rSum, map.get(rSum) + 1);
        }
        return count;
    }
    
}
