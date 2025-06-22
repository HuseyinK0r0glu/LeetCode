class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        res = 0
        for i in range(0,len(accounts)):
            temp = 0
            for j in range(0,len(accounts[i])):
                temp += accounts[i][j]
            res = max(res,temp)
        return res
