abstract class Animal {
    public abstract void makesound();

    public void sleep()
    {
        System.out.println("dcswqcd ");
    }

}
class Mydogs extends Animal{
    public void makesound(){
    System.out.println("dcs");
    }
}
public class tcs4{
public static void main(String[] args)
{
    Mydogs dog=new Mydogs();
    dog.makesound();
    dog.sleep();
}
}       
