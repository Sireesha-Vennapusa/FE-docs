class Child {
  public void ChildSound() {
    System.out.println("A Child makes a sound");
  }
}

class people extends Child {
  public void ChildSound() {
    super.ChildSound(); 
    System.out.println("The peple says: cyar cyar");
  }
}

public class Main {
   public static void main(String[] args) {
      Child mypeople = new people(); 
      mypeople.ChildSound();
   }
}
