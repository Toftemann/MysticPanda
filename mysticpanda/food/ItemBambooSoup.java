package com.friendlypandaguy.mysticpanda.food;

import com.friendlypandaguy.mysticpanda.Main;
import com.friendlypandaguy.mysticpanda.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBambooSoup extends ItemFood {

	public ItemBambooSoup(String name, int amout, float sturation, boolean isWolfFood) {
		super(3, 3.0f, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
		
	}
	
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "bamboo_soup");
		
	}
	
	public void initOreDict() {
		OreDictionary.registerOre("bamboo_soup", this);
		
	}
}
