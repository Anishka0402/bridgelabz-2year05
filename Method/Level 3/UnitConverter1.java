public class UnitConverter1 {
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double m) { return m * 3.28084; }
    public static double convertFeetToMeters(double f) { return f * 0.3048; }

    public static void main(String[] args) {
        System.out.println("10 km = " + convertKmToMiles(10) + " miles");
        System.out.println("6 miles = " + convertMilesToKm(6) + " km");
        System.out.println("2 m = " + convertMetersToFeet(2) + " feet");
        System.out.println("10 ft = " + convertFeetToMeters(10) + " m");
    }
}
