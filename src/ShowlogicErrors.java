public class ShowlogicErrors {
    public static void main(String[] args)   {
        System.out.print(
                "Celsius 35 is Fahrenheit degree \n");
        System.out.println("Wrong result because of integer division error !!! ie. a logic error");
        System.out.println(
                (9 / 5) * 35 + 32); // Division Error !!! In Java you have to remember the integer roundoff !!!
        System.out.println();

        // Correct expression
        System.out.println("Here we do the calculation correct where the 9 in the expression is typed in as 9.0");
        System.out.println(
                (9.0 / 5) * 35 + 32); // Here we nominate 9.0 so that the system knows that it must treat the number as a double or float

    }
}
