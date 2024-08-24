import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class Serialization{
    public static void main(String args []){
        Student s1=new Student();
        s1.stuRollNo=5;
        s1.stuName="Mubin";

        String fileName="D:\\java program\\NEWFILE.txt";
        try
        {
            FileOutputStream fos =new FileOutputStream(fileName);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeobject(s1);
            oos.close();
            fos.close();
            System.out.println("Object saved in file.");

        }
        catch(FileNotFoundException e)
        {
            e.printStacktrack();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}