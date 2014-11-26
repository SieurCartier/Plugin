package Events;

public class PrintPlugins implements PluginListener {

	@Override
	public void newPlugin(PluginEvent event) {
		System.out.println("Plugin : " + event.getName() + " added") ;
	}

	@Override
	public void removedPlugin(PluginEvent event) {
		System.out.println("Plugin : " + event.getName() + " removed") ;
	}

}
