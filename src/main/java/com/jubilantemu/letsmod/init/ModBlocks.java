package com.jubilantemu.letsmod.init;

import com.jubilantemu.letsmod.block.AmFlagBlue;
import com.jubilantemu.letsmod.block.AmFlagRed;
import com.jubilantemu.letsmod.block.AmFlagStar;
import com.jubilantemu.letsmod.block.AmFlagWhite;
import com.jubilantemu.letsmod.block.BlockFlag;
import com.jubilantemu.letsmod.block.BlockLM;
import com.jubilantemu.letsmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockLM flag = new BlockFlag();
	public static final BlockLM amFlagStar = new AmFlagStar();
	public static final BlockLM amFlagWhite = new AmFlagWhite();
	public static final BlockLM amFlagBlue = new AmFlagBlue();
	public static final BlockLM amFlagRed = new AmFlagRed();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
		GameRegistry.registerBlock(amFlagStar, "amFlagStar");
		GameRegistry.registerBlock(amFlagWhite, "amFlagWhite");
		GameRegistry.registerBlock(amFlagBlue, "amFlagBlue");
		GameRegistry.registerBlock(amFlagRed, "amFlagRed");
	}

}

