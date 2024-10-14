import java.lang.annotation.AnnotationTypeMismatchException;

class Main {
  public static void main(String[] args) {
    char c = 4690;
    int idle = c;
    System.out.println(c);
    
    int x = 5/2;
    double y = 5/2;
    double z = x+y;
    // you can't change doubles into integers but you can change integers into doubles
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    String foo = "Hello ";
    String bar = "world!";
    String flub = foo + "party people!";
    String foobar = foo + bar;
    System.out.println(foo);
    System.out.println(flub);
    System.out.println(foobar);
    // based on the variable name foobar, I assume that the goal is to combine the sub variables foo and bar. This can only be done with adition since strings cannot process any other mathematical equations
    boolean yes = true;
    boolean no = false;
    boolean maybe = (yes == no); 

    String jns = "Hanni";
    System.out.println(jns.length()); // says it does not have a field without parenthesis in the method
    int ive = 123456711;
    System.out.println(ive); // int cannot be dereferenced

    //String boo = "L" + 33 + "t";
    //String far = "haX" + 0 + 'r';
    //System.out.println(boo + far); // variables need to be the same type in order to add between strings and numbers

    int w = 5/2;
    //int w = 3; // error bc it says w is already defined in the method
    System.out.println(w);

    
  }
}