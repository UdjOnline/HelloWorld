package l45_date_time.slides;

import java.time.LocalDateTime;

public class TimeIt {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Step #" + i);
        }
        LocalDateTime finish = LocalDateTime.now();

        float finishNanoSacs = (float) finish.getNano() / 1000000000;
        float finishSecs = finish.getSecond() + finishNanoSacs;
        float startSecs = start.getSecond() + (float) start.getNano() / 1000000000;

        System.out.println("Код выполнится за " + (finishSecs - startSecs) + "секунд");
    }
}
