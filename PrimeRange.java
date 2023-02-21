import java.util.Scanner;
class PrimeRange
{
    public static void main(String args[])
    {
        int i=1, c=0, j=1;
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++)   
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c=c+1;
                }
            }
            if(c==2)
            {
                System.out.println(i);
            }
        }
    }
}