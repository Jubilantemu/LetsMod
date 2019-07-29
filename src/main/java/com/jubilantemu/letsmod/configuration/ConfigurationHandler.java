package com.jubilantemu.letsmod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigurationHandler 
{
	public static void init(File configFile)
	{
		// Create configuration object from the given configuration file
		Configuration configuration = new Configuration(configFile);
		
		boolean configValue = false;
		
		try
		{
			// Load the configuration file
			configuration.load();
			
			// Read in properties from configuration file
			configValue = configuration.get(Configuration.CATEGORY_GENERAL,  "configValue", true, "An example Config Value").getBoolean(true);
			
		}
		catch(Exception e)
		{
			// Log the exception
		}
		finally
		{
			// Save the configuration file
			configuration.save();
		}
		
		System.out.println(configValue);
	}
}
