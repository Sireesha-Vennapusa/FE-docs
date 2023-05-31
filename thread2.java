class Worker extends Thread{
    public void run(){
    try{
        System.out.println("Worker");
        Thread.sleep(500);
    }
    catch(Exception e)
    {
    System.out.println("Exception is caught");
    }
    }
} 
public class Main extends Thread
{
    public static void main(String[] args) {
        Worker w=new Worker();
        w.start();
        try{
        System.out.println("thread name:"+Thread.currentThread().getName());
        System.out.println("Worker Thread is alive:"+w.isAlive());
        w.join();
        System.out.println("Worker Thread is alive:"+w.isAlive());
    }
    catch(Exception e){
        System.out.println("Exception occured");
    }
    System.out.println("Worker thread is alive after try:"+w.isAlive());
    System.out.println(Thread.currentThread().getName()+"thread is alive:"+Thread.currentThread().isAlive());
    

    }
}
