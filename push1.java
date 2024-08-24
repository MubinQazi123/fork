import java.util.Stack;
public class push1 {

    public static void main(String[] args) {
        Stack<String>animals=new Stack<>();
        animals.push("dog");
        animals.push("horse");
        animals.push("cat");
        System.out.println("Stack:"+animals);

        String ele = animals.pop();
        System.out.println("removed element "+ele);
        
    }

    

}