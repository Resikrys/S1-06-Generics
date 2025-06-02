package s1_06_generics_lvl1_ex1;

public class Task6 {
    public static void main(String[] args) {
        String obj1 = "obj1";
        String obj2 = "obj2";
        String obj3 = "obj3";

        NoGenericMethods example = new NoGenericMethods(obj1, obj2, obj3);
        example.show();

        NoGenericMethods newExample = new NoGenericMethods(obj2, obj3, obj1);
        newExample.show();

    }
}
