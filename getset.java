import java.util.ArrayList;
public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> names = new ArrayList<String>();
    names.add("siri");
    names.add("mani");
    names.set(1,"dolly");
    System.out.println(names.get(1));
  } 
}