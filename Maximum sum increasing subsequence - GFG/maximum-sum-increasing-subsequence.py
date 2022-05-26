#User function Template for python3
class Solution:
	def maxSumIS(self, Arr, n):
		# code here
		maxval = Arr.copy()
		for i in range(n-1,-1,-1):
		    for j in range(i+1,n):
		        if Arr[i] < Arr[j] : #and maxval[i] > Arr[i] + maxval[j]:
		          #  maxval[i] += Arr[i] + maxval[j]
		          maxval[i] = max(maxval[i],Arr[i]+maxval[j])
		return max(maxval)
		        
		    

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n = int(input())
		Arr = [int(x) for x in input().split()]
		ob = Solution()
		ans = ob.maxSumIS(Arr,n)
		print(ans)

# } Driver Code Ends