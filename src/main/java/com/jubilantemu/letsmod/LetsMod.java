package com.jubilantemu.letsmod;

import com.jubilantemu.letsmod.proxy.IProxy;
import com.jubilantemu.letsmod.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = "Lets Mod", version = "1.7.10-1.0")
public class LetsMod
{
	
	@Instance("LetsMod")
	public static LetsMod instance;
	
	@SidedProxy(clientSide = "com.jubilantemu.letsmod.proxy.ClientProxy", serverSide = "com.jubilantemu.letsmod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
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
