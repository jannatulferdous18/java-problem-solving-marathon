public class CheckSign {

    // check a number whether it's positive, negative or zero
    public static void checkNumber(int number){
        System.out.println(number > 0 ? "positive" : (number < 0) ? "negative" : "zero");
    }

    public static void main(String[] args) {
        checkNumber(5);
    }
}
