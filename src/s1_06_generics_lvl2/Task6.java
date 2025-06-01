package s1_06_generics_lvl2;

import s1_06_generics_lvl1_ex2.GenericMethods;
import s1_06_generics_lvl1_ex2.Person;

public class Task6 {
    public static void main(String[] args) {
        s1_06_generics_lvl1_ex2.Person person1 = new Person("Liam", "Vittori", 11);
        String text = "Hello Universe";
        int num = 42;

        s1_06_generics_lvl1_ex2.GenericMethods.printArguments(person1, text, num);
        s1_06_generics_lvl1_ex2.GenericMethods.printArguments(num, person1, text);
        GenericMethods.printArguments(text, num, person1);
    }
}
