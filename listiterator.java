import java.util.*;
public class Main {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<String>();
    names.add("siri");
    names.add("mani");
   // names.push("john");
    //names.pop();
   // for(String a:names)
    Iterator<String> it=names.iterator();
    while(it.hasNext())
    {
    System.out.println(it.next());
  }
}
}
