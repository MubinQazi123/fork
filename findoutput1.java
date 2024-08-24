class a1{
    public int i;
    private int j;

}
class b2 extends a1{
    void dispalay()
    {
        super.j=super.i+1;
        System.out.println(super.i+""+super.j);
    }
}
public class findoutput1 {
    public static void main(String args[])
    {
        b2 obj=new b2();
        obj.i=1;
        obj.j=2;
        obj.dispalay();
    }
    
}
