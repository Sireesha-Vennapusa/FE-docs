import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //Stack s=new Stack();
	    
	    ArrayDeque<Integer> s=new ArrayDeque ();
        s.push(6);
        s.push(10);
        s.push(2);
        s.push(15);
        s.pop();
        s.addFirst(10);
        s.addLast(200);
        s.offerFirst(12);
        for(int i:s)
       // System.out.println(s);
       System.out.println(i);
    }
}
	