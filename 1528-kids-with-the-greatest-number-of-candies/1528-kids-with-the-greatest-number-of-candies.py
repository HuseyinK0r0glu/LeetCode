class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxCandie = max(candies)
        res = []
        for i in candies:
            if(i + extraCandies >= maxCandie):
                res.append(True)
            else:
                res.append(False)
        return res