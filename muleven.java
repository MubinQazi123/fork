

class threadi extends Thread{
    public void run(){
        for(int i = 1; i<30; i++){
            System.out.println("i value is "+i);
        }
    }
}

class threadj extends Thread{
    public void run(){
        for(int j = 1; j<40; j++){
            if(j%2 == 0)//even print huta ye conditon se 
            {
                System.out.println("j even value is "+j);
            }
        }
    }
}

class threadk extends Thread{
    public void run(){
        for(int k = 1; k<50; k++){
            if(k%2 != 0) //odd print huta ye condition se 
            {
                System.out.println("k odd value is "+k);
            }
        }
    }
}

class muleven {
    public static void main(String[] args){
        threadi valuei = new threadi();
        threadj valuej = new threadj();
        threadk valuek = new threadk();
        valuei.start();
        valuej.start();
        valuek.start();
    }
}