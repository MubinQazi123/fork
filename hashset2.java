import java.util.HashSet;
import java.util.Iterator;
public class hashset2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(30);
        hs.add(10);
        hs.add(20);
        hs.add(40);

        System.out.println(hs);

        Iterator itr =hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        
    }
    
}
