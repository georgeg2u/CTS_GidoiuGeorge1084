package teste;

public class MyExc extends IllegalArgumentException{
    private String msg;
    public MyExc(String msg){
        this.msg=msg;
    }
    public String getMesaj(){
        return msg;
    }
}
