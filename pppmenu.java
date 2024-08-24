import java.util.Stack;
import java.util.Scanner;
public class pppmenu {
    public static void main(String[] args) {
        int ch=0;
        Scanner sc=new Scanner(System.in);
        Stack<String>Animals =new Stack<>();
        System.out.println("\t \t \t \t  Menu  \n1.Push \n2.pop \n3.peep \n4.Display \n5.Search \n6.Exit");
        System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Elements to Push:");
			String a=sc.next();
			if(!Animals.contains(a))
				Animals.push(a);
			System.out.println("Element is entered in stack");
			break;
		case 2:
			System.out.println("Enter Element to pop:");
			//String b=sc.next();
			String b=Animals.pop();
			System.out.println("Element is removed.");
			break;
		case 3:
			System.out.println("Enter element to Peep:");
			//String c= sc.next();
			String c=Animals.peek();
			System.out.println("Element is Peeped.");
			break;

        case 4:
            System.out.println(Animals);
            break;
        case 5:
            System.out.println("Enter element To Search : ");
            String f =sc.next();
            int  d = Animals.search(f);
            break;
        case 6:
            System.out.println("Exit");
            break;
		}

	}
}
