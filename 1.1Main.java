class Main {
  public static void main(String[] args) {
  /*int x; // you cannot declare a variable multiple times but you can assign it different values as many times as you want.
  boolean y;
  double z;
  x = 8;
  y = true;
  z = 1.17;
  System.out.println(x);
  System.out.println(y);
  System.out.println(z);
  char w = '3';
  System.out.println(w);

  x = 10;
  y = false;
  z = 9.74;
  System.out.println(x);
  System.out.println(y);
  System.out.println(z);
  w = '6';
  System.out.println(w);
     
  int n = 1;
  int j = 0;
  // if and while statements are cool. Also use continue to end that specific loop and break to fully end the loop
    while (j < 500) {
      j = n * n;
      n += 1;
      if (j == 25) {
        //System.out.print(j);  
        System.out.println(" WOW!!");
        continue;
        }   
      if (j < 500){
        System.out.println(j);
      }
    }
    // use if else statements instead of continue to get the loop to occasionally spit out a unique output also declaration can take place in the for loop conditions
  for (int nwjn = 1; nwjn < 20; nwjn+=2) {
      System.out.println(nwjn);
    }
    int[] testArray = {1, 2, 3, 5, 7, 11, 13, 17, 19};
    for (int i: testArray) {
      if (i > 7){
        System.out.println(i + " I get it, they're all primes!");
      } else {
        System.out.println(i + "o");
      }
    }

    int y = 1;
    for (int dm = 9; dm > 0; dm --) {
      y *= dm; 
    }
    System.out.println(y); */
    
  /*int dani = 1;
  int haer = 1;
  int danihaer = 0;
  int minji = 0;
  while (minji < 500) {
    if (danihaer == 0){
      System.out.println(dani);
      System.out.println(haer);
      danihaer = dani + haer;
      System.out.println(danihaer);
    }  
    else {
      minji = dani + danihaer;
    }
    System.out.println(minji);
    dani = danihaer;
    danihaer = minji;
    }*/
  int [] basearray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    for (int eta: basearray) {
      if (eta == 18){
        System.out.println(eta + "legally an adult now");
      }
      if (eta == 1){
        System.out.println (eta + "look at the widdle baby");
      }
      else {
           System.out.println(eta);
      }  
    } 
  }
}  