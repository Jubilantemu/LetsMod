package com.jubilantemu.letsmod.block;

import com.jubilantemu.letsmod.creativetab.CreativeTabLM;
import com.jubilantemu.letsmod.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockLM extends Block {

	public BlockLM(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabLM.LM_TAB);
	}
	
	public BlockLM()
	{
		this(Material.rock);
	}
	
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s",Reference.MOD_ID.toLowerCase() + ":", getUnrwrappedUnlocalizedName(super.getUnlocalizedName()));
	}	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnrwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnrwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
}
