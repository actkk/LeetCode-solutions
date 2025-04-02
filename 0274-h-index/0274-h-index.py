class Solution(object):
    def hIndex(self, citations):
        sort = sorted(citations, reverse=True)           
        a = 1  
        for i in sort:  
            if i >= a:  
                a += 1
            else:
                break    
        return a - 1 

