package s1_06_generics_lvl2;

public class Task6 {
    public static void main(String[] args) {
        Person person1 = new Person("Liam", "Vittori", 11);
        String text = "Hello Universe";
        double pi = 3.14;

        GenericMethods.printArguments(text, pi, person1);
    }
}
