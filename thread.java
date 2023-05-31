class Main
{
    public static void main(String[]args)
    {
        System.out.println("Student Assessment started");
        for(int i=0;i<5;i++)
        {
            System.out.println("SRIT");
        
            try{
            Thread.sleep(2000);
           }
            catch(Exception e)
            {
                System.out.println("InterruptedException");
            }
         }
        System.out.println("printed ended");
        System.out.println("multiplication started");
        for(int i=1;i<5;i++)
        {
            System.out.println(i+"*"+i+" "+i*i);
        
            try{
            Thread.sleep(2000);
            }
    
        catch(Exception e)
        {
            System.out.println("InterruptedException");
        }
    }
        System.out.println("multiplication ended");
    }
}





