package adbistju.system.models;

public class Dog extends Animal{
    @Override
    public String voice() {
        if(!isSleep){
            return "Гав";
        }else{
            return "";
        }
    }
}
