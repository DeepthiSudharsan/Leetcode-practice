class Solution:
    def rankTeams(self, votes: List[str]) -> str:
        dct=collections.defaultdict(list)
        for vote in votes:
            for i,char in enumerate(vote):
                if char not in dct: dct[char]=[0]*len(vote)
                dct[char][i]+=1
        return ''.join(sorted(list(dct.keys()),key=lambda x: (dct[x],-ord(x))))[::-1]
    
        # teams = sorted(list(votes[0]))
        # ranks = {}
        # for t in teams:
        #     ind = [0] * len(teams)
        #     for v in votes:
        #         ind[v.index(t)] = ind[v.index(t)] + 1
        #     ranks[t] = ind.index(max(ind))
        # ranks = dict(sorted(ranks.items(), key = lambda item: item[1]))
        # return "".join(list(ranks.keys())) 
                
                
            