import java.util.*;
public class Main {
  public static void main(String[] args) {
    LinkedList<String> s = new LinkedList<String>();
    s.add("arpita");
    s.add("tejashwini");
    s.add("vinod");
    s.add("kiran");
    s.add("rajeshwari");
    ListIterator<String> it=s.listIterator();
   // names.push("john");
    //names.pop();
   //for(String a:names)
    while(it.hasNext())
    {
        if(it.next()=="vinod")
        it.remove();
    }
   System.out.print(s);
}
}