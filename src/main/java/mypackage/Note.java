package mypackage;

/**
 * Created by emilbikj on 11.05.2017.
 */
public class Note extends Record {

    private String[] note;

    String getNote() {
        StringBuilder str = new StringBuilder("<");
        for (String aNote : note) {
            str.append(aNote).append(" ");
        }

        return str + ">";
    }

    void setNote(String... note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{id: " + getId() +
                ", note= " + getNote() +
                '}';
    }
}
