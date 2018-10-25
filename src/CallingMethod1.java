public class CallingMethod1
{
    public int aMethod()
    {
        static int i = 0;
        i++;
        return i;
    }
    public static void main(String args[])
    {
    	CallingMethod1 test = new CallingMethod1();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}