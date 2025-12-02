use std::collections::HashSet;
impl Solution {
    pub fn find_missing_elements(nums: Vec<i32>) -> Vec<i32> {
        
        let mut min : i32 = i32::MAX;
        let mut max : i32 = i32::MIN;

        let mut set : HashSet<i32> = HashSet::new();

        for num in nums {
            if num > max {
                max = num
            }
            if num < min {
                min = num
            }
            set.insert(num);
        }

        let mut result : Vec<i32> = Vec::new();

        for i in min..max {
            let mut isIn : bool = false;
            for num in &set {
                if *num == i {
                    isIn = true;
                    break;
                }
            }

            if !isIn {
                result.push(i)
            }

        }       
        return result;
    }
}