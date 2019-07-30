package com.jubilantemu.letsmod.handler;

import java.io.File;

import com.jubilantemu.letsmod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	
	public static Configuration configuration;
	public static boolean testValue = false;
	
	public static void init(File configFile)
	{
		// Create configuration object from the given configuration file
		
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}	
	public void loadConfiguration()
	{
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
	

}