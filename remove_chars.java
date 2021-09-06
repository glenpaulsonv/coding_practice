static String removeChars(String string1, String string2){
        // code here
        HashSet<Character> set1 = new HashSet<>();
        String res="";
        for(char c:string2.toCharArray())
        {
            set1.add(c);
        }
        for(int i=0;i<string1.length();i++)
        {
            char d = string1.charAt(i);
            if(!set1.contains(d))
                res+=d;
        }
        return res;
    }