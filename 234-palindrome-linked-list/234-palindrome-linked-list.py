# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        ll = []
        while(head != None):
            ll.append(head.val)
            head = head.next
        return ll == ll[::-1]
            
        