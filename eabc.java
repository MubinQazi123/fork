public class eabc {
    public enum Month{
        JAN(1),FEB(2),MAR(3);
        private int value;
        private Month(int value){
            this.value=value;
        }
    }
    public static void main(String[] args) {
        for(Month m:Month.values())
        System.out.println(m+""+m.value);
    }
    
}
