package chapter18.test1;

public class InterruptedTest implements Runnable {
    private boolean isContinue = false;

    public void run(){
        while (true){
            //
            if (isContinue)
                break;
        }
    }

    public void setContinue(){
        this.isContinue=true;
    }
}
