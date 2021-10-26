package adbistju.system.models;

public class Cat extends Animal{
    @Override
    public String voice() {
        if(!isSleep){
            return "Мяу";
        }else{
            return "";
        }
    }
}
