public class Main {
  public static void main(String[] args) {
    System.out.println(Math.sqrt(7*5));
    System.out.println(Math.abs(7-5));
    System.out.println(Math.pow(7,5));
    System.out.println(Math.exp(7));
    System.out.println(Math.cbrt(7));
    
    if (7>5){
      System.out.println("7 is greater than 5");
  }
    else{
      System.out.println("5 is greater than 7");
    }
    
    //Ternary
    
    double m0 =7;
    double m1 =5;
    String smaller = m1==m0 ? "3 is equal t0 7" : "3 is not equal t0 7";
    System.out.println(smaller);

    smaller = m1>m0 ? "3 is greater than 7" : "3 is not greater than 7";
    System.out.println(smaller);

    smaller = m1<m0 ? "3 is less than 7" : "3 is not less than t0 7";
    System.out.println(smaller);
    
    //Boolean
    int x = 7;
    int y = 5;
    
    System.out.println(x>y);
    System.out.println(x<y);
    System.out.println(x==y);
    
    System.out.println(x>y&&x<y);
    System.out.println(x>y||x<y);
    System.out.println(!(x>y&&x<y));
    
    
    
    int day = 6;
  switch (day){
   case 1 : 
  System.out.println("monday");   
  break;
  
   case 2 : 
  System.out.println("tuesday");   
  break;
  
   case 3 : 
  System.out.println("wednesday");   
  break;
 
   case 4 : 
  System.out.println("thursday");   
  break;
 
   case 5 : 
  System.out.println("friday");   
  break;
  
   case 6 : 
  System.out.println("saturday");   
  break;
   case 7 : 
  System.out.println("sunday");   
  break;
  
  }
  
  
  }}
