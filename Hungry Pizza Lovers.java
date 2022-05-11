/*
Hungry pizza lovers
Easy

Dominos Pizza has hungry customers waiting in the queue. Each unique order is placed by a customer at time x[i], and the order takes y[i] units of time to complete.
You have information on all n orders, Find the order in which all customers will receive their pizza and return it. If two or more orders are completed at the same time then sort them by non-decreasing order number.

Example 1:

Input : arr[ ] = {{4,1}, {6,2}, {7,6}, 
                       {8,1}, {1,3}}
Output : 5 1 2 4 3
Explanation:
Here an array can be transform to 
{5, 8, 13, 9, 4}. Here 5th index order 
received first then 1st order, 2nd order...
return {5, 1, 2, 4, 3}
*/

class Complete{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> permute (int arr[][], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            arr[i][0] = arr[i][0] + arr[i][1];
            arr[i][1] = i+1;
        }
        
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        
        for(int i=0;i<n;i++){
            list.add(arr[i][1]);
        }
        
        return list;
        
    }
}

/*Better Approach O(N) time complexity*/

class Complete{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> permute (int arr[][], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
           int sum = arr[i][0] + arr[i][1];
           map.putIfAbsent(sum, new TreeSet<>());
           map.get(sum).add(i);
        }
      
       // traversing entries in map
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
           Map.Entry pair = (Map.Entry) it.next();
           Set set = (TreeSet) pair.getValue();
           Iterator<Integer> h = set.iterator();
           while (h.hasNext()) {
               int i = (int) h.next();
               res.add(i+1);
           }
        }
       return res;
    }
}
