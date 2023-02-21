public class EgThis 
{
    int accountno;
        String name;
        int pin;
        EgThis(int accountno,String name,int pin)
        {
            this.accountno = accountno;
            this.name = name;
            this.pin = pin;
        }
        void display()
        {
            System.out.println(accountno+"\n"+name+"\n"+pin);
        }
    public static void main(String args[])
    {
        EgThis accountholder1 = new EgThis(212323233,"Prakash",2323);
        EgThis accountholder2 = new EgThis(38468574,"Akash",1233);
        accountholder1.display();
        accountholder2.display();
    }    
}