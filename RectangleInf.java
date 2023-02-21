import java.util.*;
interface RectangleInf
{
    public void Area();
    public void Perimeter();
}
class AreaOfRectangle implements RectangleInf
{
    public void Area()
    {
        System.out.println("Area Of Rectangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length Of Rectangle:");
        int l=sc.nextInt();
        System.out.println("Enter Breadth Of Rectangle:");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area Of Rectangle Is: "+area);
    }
    public void Perimeter()
    {
        System.out.println("Perimeter Of Rectangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length Of Rectangle:");
        int l=sc.nextInt();
        System.out.println("Enter Breadth Of Rectangle:");
        int b=sc.nextInt();
        int p=2*(l+b);
        System.out.println("Perimeter Of Rectangle Is: "+p);
    }
    public static void main(String[] args)
    {
        RectangleInf obj=new AreaOfRectangle();
        obj.Area();
        obj.Perimeter();
    }
}