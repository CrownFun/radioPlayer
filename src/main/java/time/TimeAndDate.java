package time;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TimeAndDate {

    public static void showTime(JLabel label) {

        Thread clock;
        clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int second = cal.get(Calendar.SECOND);
                    String sec;
                    if (second < 10) {
                        sec = "0" + second;
                    } else {
                        sec = "" + second;
                    }
                    int minute = cal.get(Calendar.MINUTE);
                    String min;
                    if (minute < 10) {
                        min = "0" + minute;
                    } else {
                        min = "" + minute;
                    }
                    int hour = cal.get(Calendar.HOUR);
                    int h = cal.get(Calendar.AM_PM);

                    if (h == 0) {
                        hour = hour;
                    } else {
                        hour = hour + 12;
                    }
                    label.setText((hour) + ":" + min + ":" + sec);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e);

                    }
                }
            }
        };
        clock.start();
    }

    public static void showData(JLabel labelData, JLabel labelDay) {
        Calendar calendar = Calendar.getInstance();    
        labelData.setText((new SimpleDateFormat("dd MMMMMMMMMMMM YYYY").format(calendar.getTime())));
        labelDay.setText(new SimpleDateFormat("EEEEEEEE").format(calendar.getTime()));
    }

}
