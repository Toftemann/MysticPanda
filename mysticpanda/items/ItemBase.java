package com.friendlypandaguy.mysticpanda.items;

import com.friendlypandaguy.mysticpanda.Main;
import com.friendlypandaguy.mysticpanda.init.ModItems;
import com.friendlypandaguy.mysticpanda.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
