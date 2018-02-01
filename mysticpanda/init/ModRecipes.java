package com.friendlypandaguy.mysticpanda.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.REEDS, new ItemStack(ModItems.BAMBOO), 0.4f);
	}
}
