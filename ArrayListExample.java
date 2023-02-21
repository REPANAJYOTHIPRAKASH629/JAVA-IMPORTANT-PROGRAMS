import java.util.*;
class ArrayListExample
{  
  public static void main(String args[])
  {
    ArrayList<String> arrList=new ArrayList<>();
    arrList.add("Cricket"); 
    arrList.add("Hockey"); 
    arrList.add(0, "BasketBall"); 
    System.out.println("ArrayList Elements: ");
    for(String str:arrList)
    {
      System.out.println(str);
    }
  }
}