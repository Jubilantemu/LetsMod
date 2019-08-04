package com.jubilantemu.letsmod.creativetab;

import com.jubilantemu.letsmod.init.ModBlocks;
import com.jubilantemu.letsmod.init.ModItems;
import com.jubilantemu.letsmod.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLM 
{
	public static final CreativeTabs LM_TAB = new CreativeTabs(Reference.MOD_ID) {

		@Override
		public Item getTabIconItem() {
			
			return ModItems.amFlagStarComponent;
		}
		
		@Override
		public String getTranslatedTabLabel()
		{
			return "Let's Mod";
		}
		
	};
}
