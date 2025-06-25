class Solution:
    def countDigits(self, num: int) -> int:
        originalNum = num
        count = 0
        while num > 0:
            lastDigit = num % 10
            if originalNum % lastDigit == 0:
                count += 1
            num = num // 10
        return count