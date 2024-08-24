
import java.util.*;

public class p45 {
    int id,quantity;
    String name,author,publisher;
    public p45(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity  = quantity;
    }

public static class Mapexample{
    public static void main(String[] args) {
            Map<Integer,p45> map = new HashMap<Integer,p45>();
            p45 b1 = new p45(101, "Let us C", "Yashwant", "BPB", 8);
            p45 b2 = new p45(102, "Data Communication", "Forouzen", "Mc Hill", 4);
            p45 b3 = new p45(103, "Operating System", "Galvin", "Wiley", 6);
            map.put(1, b1);
            map.put(2, b2);
            map.put(3, b3);

            for(Map.Entry<Integer,p45> entry:map.entrySet()){
                int key = entry.getKey();
                p45 b = entry.getValue();
                System.out.println(key+"Details: ");
                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
            }
        }
    }
}