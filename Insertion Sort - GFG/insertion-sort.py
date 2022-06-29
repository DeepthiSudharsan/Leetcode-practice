#Sort the array using insertion sort

class Solution:
    # def insert(self, alist, index, n):
    #     #code here
        
    #Function to sort the list using insertion sort algorithm.    
    def insertionSort(self, alist, n):
        #code here
        for i in range(n-1):
            for j in range(i+1,n):
                if alist[i] > alist[j]:
                    alist[i],alist[j] = alist[j], alist[i]
        return alist

#{ 
#  Driver Code Starts
if __name__=="__main__":
    t=int(input())
    for i in range(t):
        n=int(input())
        arr=list(map(int,input().split()))
    
        Solution().insertionSort(arr,n)
    
        for i in range(n):
            print(arr[i],end=" ")
    
        print()
# } Driver Code Ends