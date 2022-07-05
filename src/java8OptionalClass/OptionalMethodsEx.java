package java8OptionalClass;

import java.util.Optional;

public class OptionalMethodsEx {
    public static void main(String[] args) {
        String[] arr=new String[4];
        arr[1]="Hi Yogesh How are You";
        Optional<String> str=Optional.of(arr[1]);
        System.out.println(str);
        System.out.println("geting value "+str.get());
        System.out.println("checking value is present "+str.isPresent());
        //check whether the value is equal to specified value if equal then return Optional of value else return empty Optional
        System.out.println("filtered value "+str.filter(s -> s.equals("ABC")));
        System.out.println("filtered value "+str.filter(s -> s.equals("Hi Yogesh How are You")));
        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional: "+Optional.ofNullable(arr[1]));
        System.out.println(str.hashCode());
        System.out.println(str.orElse("or else :"+"value is not present"));
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty.orElse("or else :"+"value is not present"));

    }
}
