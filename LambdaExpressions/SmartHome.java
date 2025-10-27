interface LightBehavior {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        LightBehavior motionTrigger = () -> System.out.println("Lights ON due to motion");
        LightBehavior timeTrigger = () -> System.out.println("Lights ON at sunset");
        LightBehavior voiceTrigger = () -> System.out.println("Lights ON via voice command");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
