
public class sol1 {

    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    } 
   
}
 
//took the help of geeksforgeeks solution
