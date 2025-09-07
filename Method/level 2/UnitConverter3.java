public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        double pounds2kg = 0.453592;
        return pounds * pounds2kg;
    }

    public static double convertKgToPounds(double kg) {
        double kg2pounds = 2.20462;
        return kg * kg2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("100 F = " + convertFahrenheitToCelsius(100) + " C");
        System.out.println("0 C = " + convertCelsiusToFahrenheit(0) + " F");
        System.out.println("150 pounds = " + convertPoundsToKg(150) + " kg");
        System.out.println("70 kg = " + convertKgToPounds(70) + " pounds");
        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
        System.out.println("10 liters = " + convertLitersToGallons(10) + " gallons");
    }
}
