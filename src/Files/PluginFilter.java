package Files;

import java.io.*;

public class PluginFilter implements FilenameFilter {

	@Override
	public boolean accept(File f, String name) {
		return name.endsWith(".class");
	}

}
