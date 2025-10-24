package main

func runningSum(nums []int) []int {
	for i := 0; i < len(nums); i++ {
		nums[i] += nums[i-1]
	}
	return nums
}
