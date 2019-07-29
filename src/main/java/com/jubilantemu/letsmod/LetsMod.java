package com.jubilantemu.letsmod;

import com.jubilantemu.letsmod.configuration.ConfigurationHandler;
import com.jubilantemu.letsmod.proxy.IProxy;
import com.jubilantemu.letsmod.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class LetsMod
{
	
	@Instance(Reference.MOD_ID)
	public static LetsMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_SIDE_CLASS, serverSide = Reference.SERVER_SIDE_CLASS)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}	
}
