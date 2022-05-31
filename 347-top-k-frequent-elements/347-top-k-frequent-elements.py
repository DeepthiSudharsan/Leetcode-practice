class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if len(nums) == 1:
            return [1]
        res = []
        count = defaultdict(list)
        for n in nums:
            if n not in count.keys():
                count[n] = 0
            count[n] += 1
        count = sorted(count.items(), key=lambda x: x[1], reverse=True)
        res = [l[0] for l in count[:k]]
        print(res)
        return res
            