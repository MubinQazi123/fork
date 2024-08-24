
public class first {
    public first(){System.out.println("a");}

}     
    class Second extends first
    {

        public Second(){System.out.println("b");}

    }
    class third extends Second
    {
        public third(){System.out.println("c");}

    }
    public class mubin
    {
        public static void main(String[] args)
         {
            third c =new third();
        }
    }