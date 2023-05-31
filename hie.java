class A{
    int s=20,c=15;
    public void mul(){
        System.out.println(s*c);
    }
}
class B extends A{
    int d=5; 
    public void div(){
        System.out.println((s*c)/d);
    }
}
public class inh extends A{
    public  static void main(String [] args){
    inh obj=new inh();
    obj.mul();
     }
}