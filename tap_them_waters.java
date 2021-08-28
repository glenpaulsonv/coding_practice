//tapping rainwater using arrays

private static int rainWaterTapped(int[] arr)
{
    int[] left = new int[arr.length];
    int[] right = new int[arr.length];

    int count=0;

    left[0]=0;
    for(int i=1;i<arr.length;i++)
    {
        left[i]=Math.max(left[i-1],arr[i]);
    }
    
    right[arr.lengt-1]=arr[arr.length-1];

    for(int i=arr.lengt-2;i>=0;i--)
    {
        right[i]=Math.max(right[i+1],arr[i]);
    }

    for(int i=0;i<arr.lengt;i++)
    {
        count+=Math.min(left[i],right[i])-arr[i];
    }
    return count;
}