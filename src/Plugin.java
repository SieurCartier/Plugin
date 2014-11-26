import java.io.File;

public class Plugin {

	File fichier;
	String name;

	public Plugin(String pluginName) {
		name = pluginName;
		fichier = new File(pluginName);
	}

	public String getName() {
		return name;
	}

	public File getFile() {
		return fichier;
	}

}
