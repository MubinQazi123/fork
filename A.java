
import java.util.Scanner;

 class A {  
    int no1;
    void meth1()
    {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Value A : ");
    no1=sc.nextInt();
    }
    
}


class B extends A
{
    int no2;
    void meth2()
    {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Value B : ");
    no2=sc.nextInt();
    }
}
class C extends B
{ 
    int no3;
    int s;
    void meth3()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value C:-");
        no3=sc.nextInt();
        System.out.println("A:-"+no1);
        System.out.println("B:-"+no2);
        System.out.println("C:-"+no3);
        s=no1+no2+no3;
        System.out.println("Sum of three numbers are "+s);
        sc.close();
    }
    
}


class Java

{
public static void main(String[] args) {
    C obj=new C();
    obj.meth1();
    obj.meth2();
    obj.meth3();
}
}
