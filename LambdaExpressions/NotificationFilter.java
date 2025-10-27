import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Heart rate abnormal"),
            new Alert("Info", "Appointment reminder"),
            new Alert("Warning", "Low battery on device")
        );

        Predicate<Alert> criticalOnly = alert -> alert.type.equals("Critical");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);
    }
}
