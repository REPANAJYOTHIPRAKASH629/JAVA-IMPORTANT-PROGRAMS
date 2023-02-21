class UncheckedExceptions {
    public static void main(String args[])
    {
        try 
        {
            int a = 25,b = 0, c = 0;
            c = a/b;
            System.out.println("The division is : "+c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("the exception is : "+ae);
        }
        try
        {
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException npe)
        {
            System.out.println("the exception is : "+npe);
        }
    }    
}