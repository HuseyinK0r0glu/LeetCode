impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {

        let mut index1 : usize = 0;
        let len = nums.len();

        while index1 < len {
            let mut index2 = index1 + 1;
            while index2 < len {
                if nums[index1] + nums[index2] == target {
                    return vec![index1 as i32, index2 as i32];
                }
                index2 += 1;
            }
            index1 += 1;
        }

        return vec![0,0]
    }
}