class Solution(object):
    def countCommas(self, n):
     digit = len(str(n))

     if(digit<4):
        return 0
     else:
        return n-999
        