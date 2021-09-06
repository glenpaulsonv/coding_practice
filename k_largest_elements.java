public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> list1 = new ArrayList<>();
        Arrays.sort(arr);
        int i=n-1;
        while(k-->0 && i>=0)
        {
            list1.add(arr[i]);
            i--;
        }
        
        return list1;
        
        
    }