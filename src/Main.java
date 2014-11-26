import javax.swing.Timer;

import Timer.PluginTimer;

public class Main {

	private static final int FREC = 1000;

	public static void main(String[] args) {
		new Timer(FREC, new PluginTimer("bin")).start();
		while (true);
	}
}
