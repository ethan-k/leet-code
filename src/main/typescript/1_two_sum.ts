function twoSum(nums: number[], target: number): number[] {

	let sum: {
		[key: number] : number;
	}= {};

	for(let i = 0; i < nums.length; i++) {
		if ((target - nums[i]) in sum) {
			return [i, sum[target - nums[i]]];
		} else {
			sum[nums[i]] = i;
		}
	}
	return [-1, -1];
};