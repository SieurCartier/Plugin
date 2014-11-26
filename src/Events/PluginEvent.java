package Events;

import java.util.EventObject;
import Files.PluginFinder;

public class PluginEvent extends EventObject {

	private static final long serialVersionUID = 8140520286138009174L;

	String pluginName ;
	
	public PluginEvent(PluginFinder source) {
		super(source);
	}
	
	public void setName(String name) {
		pluginName = name ;
	}
	
	public String getName() {
		return pluginName ;
	}
	
}
