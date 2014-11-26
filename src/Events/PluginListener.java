package Events;

import java.util.*;

public interface PluginListener extends EventListener {

	public void newPlugin(PluginEvent event) ;
	public void removedPlugin(PluginEvent event) ;
	
	
}
