package Timer;

import java.awt.event.*;
import java.util.HashSet;

import Files.*;

public class PluginTimer implements ActionListener {

	HashSet<String> currentPlugins;
	String pluginPathname;
	PluginFinder pf;

	public PluginTimer(String path) {
		pluginPathname = path;
		pf = new PluginFinder(pluginPathname, new PluginFilter());
		currentPlugins = pf.getContent();
		/*
		 * ajout des différents menus
		 */
	}

	public void actionPerformed(ActionEvent event) {
		
		
		
		
		
		
		System.out.println("Nom du nouveau plugin ajouté");

	}

}
