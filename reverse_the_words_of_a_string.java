public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String[] s = s.nextLine().split(" ");
    String ans="";
    for(int i=s.length-1;i>=0;i--)
    {
        ans+=s[i]+" ";
    }
    System.out.println(s.substring(0,ans.length()-1));
}