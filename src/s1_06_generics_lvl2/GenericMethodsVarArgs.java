package s1_06_generics_lvl2;

public class GenericMethodsVarArgs {
    @SafeVarargs
    public static <T> void printArgumentsUndefinedVariable(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
