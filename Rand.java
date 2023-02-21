import java.util.*;
class Rand
{
	public static void main(String args[])
	{
		int d=0;
		for(int i=0;i<=10000;i++)
		{
			Random r=new Random();
			int d1=r.nextInt(6)+1;
			int d2=r.nextInt(6)+1;
			if(d1==d2)
			  d++;
		}
		System.out.println("The number of times the two dice have same number is  "+d);
	}
}
