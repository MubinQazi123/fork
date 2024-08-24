public class eny {
   
        public enum Week{
            SUN(1),MON(2),TUE(3);
            private int value;
            private Week(int value){
                this.value=value;
            }
        }
        public static void main(String[] args) {
            for(Week m:Week.values())
            System.out.println(m+" "+m.value);
        }
        
    }
    
    

