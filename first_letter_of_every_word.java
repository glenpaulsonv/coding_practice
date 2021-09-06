class Solution {
    String firstAlphabet(String S) {
        // code here
        String[] arr = S.split(" ");
        String res="";
        
        for(int i=0;i<arr.length;i++)
        {
            res+=(arr[i].charAt(0));
        }
        return res;
    }
};

//String[] s = input.split("(\\s)+"); if there are multiple spaces between words.
 