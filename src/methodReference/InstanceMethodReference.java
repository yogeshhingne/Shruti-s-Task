package methodReference;

public class InstanceMethodReference {
    public void doWork(){
        System.out.println("do something");
    }

    public static void main(String[] args) {
        InstanceMethodReference obj=new InstanceMethodReference();
        Workable ref1=obj::doWork;
        ref1.work();
        Workable ref2=new InstanceMethodReference()::doWork;
        ref2.work();
        Sayable ref=new InstanceMethodReference()::doWork;
        ref.say();
    }
}
