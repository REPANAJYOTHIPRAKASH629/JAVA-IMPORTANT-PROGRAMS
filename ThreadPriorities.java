class ThreadPriorities extends Thread
{
    public static void main(String args[])
    {
        ThreadPriorities t = new ThreadPriorities();
        Thread t1 = new Thread(t," thread 1");
        Thread t2 = new Thread(t," thread 2");
        Thread t3 = new Thread(t," thread 3");
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();        
    }
    public void run()
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " running: "+ i);
        }
        
}