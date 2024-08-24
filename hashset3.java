import java.util.*;
import java.util.ListIterator;


class hashset3{

    public static void main(String[] args)
    {

        LinkedList li=new LinkedList();
        li.add(50);
        li.add(90);
        li.add(40);
        li.add(80);


        System.out.println(li);

        ListIterator it=li.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.println(it.previous());
}
}
}