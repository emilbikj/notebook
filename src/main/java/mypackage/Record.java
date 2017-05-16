package mypackage;

/**
 * Created by emilbikj on 09.05.2017.
 */
abstract class Record {

    private static int recordcount = -1;
    private int id;

    Record() {
        recordcount++;
        id = recordcount;
    }

    int getId() {
        return id;
    }


}
