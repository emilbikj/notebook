package mypackage;

/**
 * Created by emilbikj on 11.05.2017.
 */
public class Note extends Record {

    private String[] note;

    public String getNote() {
        String str = "<";
        for (int i = 0; i < note.length; i++) {
            str = str + note[i] + " ";
        }

        return str + ">";
    }

    public void setNote(String... note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{id: " + getId() +
                ", note= " + getNote() +
                '}';
    }
}
