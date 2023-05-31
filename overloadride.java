class A{
    public void add(int s,int c){
        System.out.println(s+c);
    }
}
class B extends A{
    int d=5; 
    public void add(int s,int c,int d){
        System.out.println(s+c+d);
    }
}
public class inh extends B{
    public  static void main(String [] args){
    inh obj=new inh();
    obj.add(20,15,2);
     }
}