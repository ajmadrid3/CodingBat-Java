public class makes10 {
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10)
            return true;
        else
            if (a + b == 10)
                return true;
            else
                return false;
    }

    public staic void main(String[] args) {
        System.out.println(makes10(1, 9));
        System.out.println(makes10(9, 9));
    }
}