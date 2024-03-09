public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
       return (long) (kilometersPerHour < 0 ? -1 : Math.round((kilometersPerHour / 1.609)));
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(milesPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    // covert kilometer/hr to miles/hr
    public static void main(String[] args) {
        //printConversion(toMilesPerHour(25.42));
        printConversion(toMilesPerHour(-5.6));
    }
}
