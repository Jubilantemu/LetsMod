package com.jubilantemu.letsmod;

import com.jubilantemu.letsmod.handler.ConfigurationHandler;
import com.jubilantemu.letsmod.proxy.IProxy;
import com.jubilantemu.letsmod.reference.Reference;
import com.jubilantemu.letsmod.utility.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
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
		LogHelper.info("Pre Initialization Complete!");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		LogHelper.info("Initialization Complete!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete!");
	}	
}
