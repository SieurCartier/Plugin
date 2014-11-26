package Files;

import java.io.*;
import java.util.*;

import Events.*;
import Events.PluginListener;

public class PluginFinder {

	private File rep;
	private FilenameFilter filter;
	private List<PluginListener> pluginListeners = new ArrayList<PluginListener>();

	public PluginFinder(String pathname, FilenameFilter f) {
		rep = new File(pathname);
		filter = f;
	}

	public HashSet<String> getContent() {
		return new HashSet<String>(Arrays.asList(this.rep.list(filter)));
	}

	public synchronized void addPluginListener(PluginListener p) {
		if (!pluginListeners.contains(p)) {
			pluginListeners.add(p);
		}
	}

	public synchronized void removePluginListener(PluginListener p) {
		pluginListeners.remove(p);
	}

	
	private void fireNewPlugin() {
		ArrayList<PluginListener> pl = new ArrayList<PluginListener>(
				pluginListeners);
		if (pl.size() != 0) {
			PluginEvent event = new PluginEvent(this);
			for (PluginListener listener : pl) {
				listener.newPlugin(event);
			}
		}
	}

	private void fireRemovedPlugin() {
		ArrayList<PluginListener> pl = new ArrayList<PluginListener>(
				pluginListeners);
		if (pl.size() != 0) {
			PluginEvent event = new PluginEvent(this);
			for (PluginListener listener : pl) {
				listener.removedPlugin(event);
			}
		}
	}
	
	public void newPlugin() { 
		fireNewPlugin(); 
	} 

	public void removedPlugin() { 
		fireRemovedPlugin(); 
	}
	
}
