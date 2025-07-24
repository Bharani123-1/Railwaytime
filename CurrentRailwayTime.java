import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentRailwayTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Railway Time: " + currentTime.format(formatter));
    }
}
