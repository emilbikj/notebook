package mypackage;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by emilbikj on 09.05.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Notebook commands = new Notebook();

        Shell shell = ShellFactory.createConsoleShell(
                "notebook",
                "Format for date dd-MM-yyyy'T'HH:mm:ss",
                commands);
        shell.commandLoop();
    }
}
