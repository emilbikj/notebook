package mypackage;

import asg.cliche.Command;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by emilbikj on 09.05.2017.
 */
public class Notebook {

    private ArrayList<Record> records = new ArrayList<>();

    @Command
    public ArrayList<Record> list() {
        return records;
    }

    @Command
    public Record create(String firstName, String lastName, String email, String address, String... phones) {
        Person result = new Person();
        result.setFirstName(firstName);
        result.setLastName(lastName);
        result.setPhone(phones);
        result.setEmail(email);
        result.setAddress(address);
        records.add(result);
        return result;
    }

    @Command
    public void remove(int id) {
        for (int e = 0; e < records.size(); e++) {
            if (id == records.get(e).getId()) {
                records.remove(e);
                break;
            }
        }
    }

    @Command
    public Note createNote(String... note) {
        Note noteOb = new Note();
        noteOb.setNote(note);
        records.add(noteOb);
        return noteOb;
    }

    @Command
    public Reminder createReminder(String date, String... note) throws ParseException {
        try {
            Reminder reminder = new Reminder();
            reminder.setNote(note);
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss", Locale.ENGLISH);
            reminder.setTime(format.parse(date));
            records.add(reminder);
            return reminder;
        } catch (ParseException e) {
            System.out.println("Please use correct date format dd-MM-yyyy'T'HH:mm:ss, for example 11-05-2017T17:00:00");
            return null;
        }
    }

}
