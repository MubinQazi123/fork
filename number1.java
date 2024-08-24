import java.util.*;

class number1
{
    int no1;
    void meth1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1:-");
        no1=sc.nextInt();
        
    }
}

class number2 extends number1
{
    int no2;
    void meth2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no2:-");
        no2=sc.nextInt();
        
    }
}

class number3 extends number2
{
    int no3,s=0;
    void meth3()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no3:-");
        no3=sc.nextInt();
        System.out.println("No1:-"+no1);
        System.out.println("No2:-"+no2);
        System.out.println("No3:-"+no3);
        s=no1+no2+no3;
        System.out.println("Sum of three numbers are "+s);
        sc.close();
    }

}

class java
{
    public static void main(String[] args) {
        System.out.println("Here we perform single inheritance");
        number3 obj=new number3();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}