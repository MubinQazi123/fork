import java.util.Scanner;

class A {
    
    int no1,no2;
    void meth()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Value A");
    no1=sc.nextInt();
    System.out.println("Enter Value b");
    no2=sc.nextInt();
    }
}
/**
 * B extends mul
 */
public class B extends A {
    int a;
    void add()
    {
       a=no1+no2;
       System.out.println("Addition is "+a);
    }   
}
 /**
  * C extends B
  */
 public class C extends A {
    int s;
    void sub()
    {
        s=no1-no2;
        System.out.println("substraction is"+s);
    }
 
    
 }
 public class mul
 {
    public static void main(String[] args) {
        B obj1=new B();

        obj1.add();
        C obj2=new C();
        
        obj2.sub();
    }
 }

