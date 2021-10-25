package adbistju.system.models;

public abstract class Animal {
    protected boolean isSleep = false;
    protected boolean isEat = false;
    protected boolean isRun = false;

    public abstract String voice();

    public void toSleep(){
        if(isEat){toEat();}
        if(isSleep){
            isSleep = false;
            System.out.println("wake up");
        }else{
            isEat = false;
            isSleep = true;
            System.out.println("to Sleep");
        }
    }

    public void toEat(){
        if(isSleep){toSleep();}
        if (isEat){
            isEat = false;
            System.out.println("end eating");
        }else{
            isEat = true;
            System.out.println("to eat");
        }
    }

    public void run(){
        if(!isRun){
            stop();
            isRun = true;
            System.out.println("run");
        }else{
            isRun = false;
            System.out.println("stop");
        }
    }

    public void stop(){
        isEat = false;
        isRun = false;
        isSleep = false;
    }


}
