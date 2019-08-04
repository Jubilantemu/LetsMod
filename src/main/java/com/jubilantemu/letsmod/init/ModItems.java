package com.jubilantemu.letsmod.init;

import com.jubilantemu.letsmod.item.ItemLM;
import com.jubilantemu.letsmod.item.ItemMapleLeaf;
import com.jubilantemu.letsmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemLM mapleLeaf = new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
