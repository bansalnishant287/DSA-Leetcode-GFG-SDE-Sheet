/*
Link: "https://practice.geeksforgeeks.org/problems/party-in-town3951/1"
Party in Town
Medium

Geek town has N Houses numbered from 1 to N. They are connected with each other via N-1 bidirectional roads and an adjacency list adj is used to represent the connections. To host the optimal party, you need to identify the house from which the distance to the farthest house is minimum. Find this distance.

Example 1:

Input: 
N = 4
adj = {{2},{1,3,4},{2},{2}} 
Output: 1
Explaination: 

Party should take place at house number 2. 
Maximum distance from house number 2 is 1.
*/

class Solution{
    
    static int dfs(ArrayList<ArrayList<Integer>> adj, int start, int[]visited){
        
        
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int level = 0;
        
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            while(size-->0){
                
                int val = q.remove();
                visited[val] = level;
            
                
                for(int i : adj.get(val)){
                    
                    if(visited[i]==-1){
                        q.add(i);
                    }
                }
            }
            
            level++;
        }
        
        return level-1;
            
    }
    
    static int partyHouse(int N, ArrayList<ArrayList<Integer>> adj)
    {
        int ans = Integer.MAX_VALUE;
        
        for(int i=1; i<=N;i++){
            int[]visited = new int[N+1];
            Arrays.fill(visited,-1);
            ans = Math.min(ans, dfs(adj, i,visited));    
        }
        
        return ans;
    }
}
