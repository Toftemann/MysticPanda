package com.friendlypandaguy.mysticpanda.init;

import java.util.ArrayList;
import java.util.List;

import com.friendlypandaguy.mysticpanda.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MYSTIC_CRYSTAL_BLOCK = new BlockBase("mystic_crystal_block", Material.IRON).setHardness(1.5f);
	public static final Block BAMBOO_BLOCK		   = new BlockBase("bamboo_block", Material.LEAVES).setHardness(1f);
 	
}
