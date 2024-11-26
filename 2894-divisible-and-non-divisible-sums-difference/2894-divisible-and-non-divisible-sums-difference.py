class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:

        sumDiv = 0
        sumNotDiv = 0

        for x in range(1,n+1):
            if(x % m == 0):
                sumDiv += x
            else:
                sumNotDiv += x

        return sumNotDiv - sumDiv
        