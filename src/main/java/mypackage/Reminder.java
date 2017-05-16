package mypackage;

import java.util.Date;

/**
 * Created by emilbikj on 11.05.2017.
 */
public class Reminder extends Note {

    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{ id: " + getId() + " note: " + getNote() +
                ", time=" + time +
                '}';
    }
}
