package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent p1=new Parent();
        Parent p=new Child();
        Child c=new Child();
        p1.eat();
        p.eat();
        c.eat();
        c.drink();
    }
}
