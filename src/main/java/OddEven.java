public class OddEven {
    public String OddEven(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else if (number % 2 != 0) {
            return "Odd";
        }
        return "Undefined";


    }
}