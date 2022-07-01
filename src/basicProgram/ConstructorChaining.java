package basicProgram;

public class ConstructorChaining {
    ConstructorChaining(){
        System.out.println("No arg cunstructor");
    }
    ConstructorChaining(int a){
        this();
        System.out.println("int arg constructor");
    }
}
