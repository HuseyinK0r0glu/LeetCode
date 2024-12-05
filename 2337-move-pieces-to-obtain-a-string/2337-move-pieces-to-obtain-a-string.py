class Solution:
    def canChange(self, start: str, target: str) -> bool:
        l=0
        r=0

        s1 = ""
        s2 = ""

        for i in range(len(start)):

            if start[i] != "_":
                s1 += start[i]

            if target[i] != "_":
                s2 += target[i]

            if start[i]=="R":
                r+=1
            if target[i]=="L":
                l+=1
            if start[i]=="L":
                l-=1
                if l<0:
                    return False
            if target[i]=="R":
                r-=1
                if r<0:
                    return False    


            if target[i]=="R" and l>0:
                return False

            if start[i]=="L" and r>0:
                return False

        if s1 != s2:
            return False

        if r!=0 or l!=0:
            return False
        return True