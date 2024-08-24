public class first3{
    int i=10;

    public first3(int j)
    {
      System.out.println(i);
      this.i=j*10;

    }
    class Second extends first3
    {
        public Second(int j)    
        {
            super(j);
            System.out.println(i);
            this.i=j*20;

        }
    }
    public class test1
    {
        public static void main(String[]args)
        {
            Second n=new Second(20);
            System.out.println(n.i);
        }
    }


    
}
