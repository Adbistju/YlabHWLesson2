package adbistju.system.models;

public class Mouse extends Animal{
    @Override
    public String voice() {
        if(!isSleep){
            return "Пи-пи";
        }else{
            return "";
        }
    }
}
