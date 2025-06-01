package s1_06_generics_lvl2;

public class GenericMethods {
    public static <T, U> void printArguments(T arg1, U arg2, Person person1) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(person1);
    }
}
