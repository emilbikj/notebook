package mypackage;

/**
 * Created by emilbikj on 09.05.2017.
 */
public abstract class Record {

    private static int recordcount = -1;
    private int id;

    public Record() {
        recordcount++;
        id = recordcount;
    }

    public int getId() {
        return id;
    }


}
