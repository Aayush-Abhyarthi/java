class mythread extends Thread{

    public int counter;
    public int threadno;
    mythread(int counter, int threadno){
        this.counter = counter;
        this.threadno = threadno;
    }
    public void run(){
        for(int i=0;i<this.counter;i++){
            System.out.println("Inside thread number " + this.threadno + " " + (i+1));
        }
    }
}

public class concurrency {
    public static void main(String[] args){
        mythread t1 = new mythread(5,1);
        mythread t2 = new mythread(6,2);
        t1.start();
        t2.start();

        System.out.println("Both the threads completed and ending the main code.");
    }
}
