/*Run this Java program and see how it works and what else you can make it do. Determine the difference between System.out.println and System.out.print.

When you're ready, change it so there are three print statements, each printing "Hello World!" in a  language other than English. 
Include a comment (a line that starts with two slashes "//") stating the language above each print line.
*/

class Main {
  public static void main(String[] args) {
    //Language: English
    System.out.println("Hello world!"); // ln starts a new line so without it, the printing is all in one line
    // Language: greek
    System.out.println("Γειά σου Κόσμε");
     int x = 10;
    // Language: Korean 
    System.out.println("안녕하세요 세상");
    //: Language: Tagalog
    System.out.println("kumusta mundo");
    // Language: Binary
    System.out.println("01101000 01100101 01101100 01101100 01101111 00100000 01110111 01101111 01110010 01101100 01100100");
    System.out.println(x);
  }
}