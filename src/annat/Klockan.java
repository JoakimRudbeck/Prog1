package annat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Klockan {

    public static void main(String[] args) throws InterruptedException {
        klockan();
    }

    private static void klockan() throws InterruptedException {
        while(true){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            Thread.sleep(1000);
        }
    }

}
