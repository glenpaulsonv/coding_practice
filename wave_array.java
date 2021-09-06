//create a wave array - took the help of geeksforgeeks solution

class Solution{

    
    public static void swap(int[] a, int m, int n)
    {
        int temp = a[n];
        a[n]=a[m];
        a[m]=temp;
    }
    
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        for(int i=0;i<n;i+=2)
        {
            if(i>0 && arr[i-1]>arr[i])
                swap(arr, i-1,i);
            if(i<n-1 && arr[i+1]>arr[i])
                swap(arr,i+1,i);
        }
        
    }
    
}