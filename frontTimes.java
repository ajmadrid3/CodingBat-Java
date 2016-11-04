
/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3.
Return n copies of the fron
*/
public class frontTimes {
    public String frontTimes(String str, int n) {
        String front = "";
        if(str.length() == 0 || n == 0) 
        {
            return front;
        }
        else if(str.length() > 0 && str.length() < 4) 
        {
            front = str;
            for(int i = 1; i < n; i++)
            {
                front = front + str;
            }
            return front;
        }
        else 
        {
            front = str.substring(0, 3);
            for(int i = 1; i < n; i++)
            {
                front = front + str.substring(0, 3);
            }
            return front;
        }
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Ab", 4));
        System.out.println(stringTimes("", 4));
    }
}