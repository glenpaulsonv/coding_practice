//find the missing number in an array
class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        HashSet<Integer> set = new HashSet<>();
        for(int i:array)
        {
            set.add(i);
        }
        for(int j=1;j<=n;j++)
        {
            if(!(set.contains(j)))
                return j;
        }
        return -1;
    }
}