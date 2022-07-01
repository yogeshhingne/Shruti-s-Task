package singletoneClass;

public class Ram {
    private static Ram single_instance=null;

    private Ram() {
    }
    public static Ram getInstance(){
        if(single_instance==null){
            single_instance=new Ram();
        }
        return single_instance;
    }

    public static void main(String[] args) {
    }
}
