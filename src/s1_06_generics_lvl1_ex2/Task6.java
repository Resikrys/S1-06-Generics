package s1_06_generics_lvl1_ex2;

public class Task6 {
    public static void main(String[] args) {
        Person person1 = new Person("Liam", "Vittori", 11);
        String text = "Hello Universe";
        int num = 42;

        GenericMethods.printArguments(person1, text, num);
        GenericMethods.printArguments(num, person1, text);
        GenericMethods.printArguments(text, num, person1);
    }
}
