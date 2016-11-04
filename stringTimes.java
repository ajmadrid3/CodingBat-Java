/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
*/
public class stringTimes {
    public String stringTimes(String str, int n) {
        if(n == 0)
        {
            String product = "";
            return product;
        }
        else if(n == 1)
        {
            return str;
        }
        else
        {
            String product = str;
            for(int i = 1; i < n; i++)
            {
                product = product + str;
            }
            return product;
        } 
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi, 0"));
        System.out.println(stringTimes("code", 4));
    }
}