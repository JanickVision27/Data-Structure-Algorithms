public int longestSubarrayWithSumk(int[] arr, int k){
	int total_sum = 0;
	int max_index = 0;
	
	HashMap<Integer, Integer> countMap = new HashMap<>();
	
	for(int i = 0; i < arr.length; i++){
		total_sum += nums[i];
		
		
		if(countMap.containsKey(total_sum)){
			int old_index = countMap.get(total_sum);
			int current_index = current_index - i;
			
			if (current_index > max_index){
				max_index = current_index;
			}
			
		}else{
			countMap.put(total_sum, i);
		}
	}
	
	System.out.println("Longest Subarray Sum K " + max_index);
	return max_index;
}
		