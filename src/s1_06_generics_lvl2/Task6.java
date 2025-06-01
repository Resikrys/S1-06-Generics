package s1_06_generics_lvl2;

public class Task6 {
    public static void main(String[] args) {
        //Exercise 1
        Person person1 = new Person("Liam", "Vittori", 11);
        String text = "Hello Universe";
        double pi = 3.14;

        //Exercise 2
        String message = "Varargs!";
        boolean status = true;

        //Exercise 1
        GenericMethods.printArguments(text, pi, person1);

        //Exercise 2
        GenericMethodsVarArgs.printArgumentsUndefinedVariable(person1, message, status, 213);
    }
}
