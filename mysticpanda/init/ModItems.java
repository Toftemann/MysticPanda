package com.friendlypandaguy.mysticpanda.init;

import java.util.ArrayList;
import java.util.List;

import com.friendlypandaguy.mysticpanda.armor.ArmorBase;
import com.friendlypandaguy.mysticpanda.food.ItemBambooSoup;
import com.friendlypandaguy.mysticpanda.items.ItemBase;
import com.friendlypandaguy.mysticpanda.tools.ToolAxe;
import com.friendlypandaguy.mysticpanda.tools.ToolHoe;
import com.friendlypandaguy.mysticpanda.tools.ToolPickaxe;
import com.friendlypandaguy.mysticpanda.tools.ToolShovel;
import com.friendlypandaguy.mysticpanda.tools.ToolSword;
import com.friendlypandaguy.mysticpanda.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//TOOL_MATERIAL
	public static final ToolMaterial TOOL_BAMBOO   = EnumHelper.addToolMaterial("tool_mystic", 1, 162, 4.0F, 1.0F, 5);
	public static final ToolMaterial TOOL_MYSTIC   = EnumHelper.addToolMaterial("tool_mystic", 3, 2018, 8.0f, 4.0f, 10);
	public static final ArmorMaterial ARMOR_MYSTIC = EnumHelper.addArmorMaterial("armor_mystic", Reference.MOD_ID + ":mystic", 48, new int[]{5, 9, 8, 5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
	
	//ARMOR
	public static final Item MYSTIC_HELMET     = new ArmorBase("mystic_helmet", ARMOR_MYSTIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item MYSTIC_CHESTPLATE = new ArmorBase("mystic_chestplate", ARMOR_MYSTIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item MYSTIC_LEGGINS    = new ArmorBase("mystic_leggings", ARMOR_MYSTIC, 2, EntityEquipmentSlot.LEGS);
	public static final Item MYSTIC_BOOTS      = new ArmorBase("mystic_boots", ARMOR_MYSTIC, 1, EntityEquipmentSlot.FEET);
	
	//WEAPONS
	public static final Item BAMBOO_SWORD = new ToolSword("bamboo_sword", TOOL_BAMBOO);
	public static final Item MYSTIC_SWORD = new ToolSword("mystic_sword", TOOL_MYSTIC);
	
	//TOOLS
	public static final Item MYSTIC_PICKAXE = new ToolPickaxe("mystic_pickaxe", TOOL_MYSTIC);
	public static final Item MYSTIC_SHOVEL  = new ToolShovel("mystic_shovel", TOOL_MYSTIC);
	public static final Item MYSTIC_HOE     = new ToolHoe("mystic_hoe", TOOL_MYSTIC);
	public static final Item MYSTIC_AXE     = new ToolAxe("mystic_axe", TOOL_MYSTIC);
	
	//MATERIALS
	public static final Item MYSTIC_CRYSTAL = new ItemBase("mystic_crystal");
	public static final Item FUR            = new ItemBase("fur");
	public static final Item BLACK_FUR      = new ItemBase("black_fur");
	public static final Item HARD_STICK     = new ItemBase("hard_stick");
	public static final Item BAMBOO         = new ItemBase("bamboo");	
	
	//FOOD
	public static final Item BAMBOO_SOUP = new ItemBambooSoup("bamboo_soup", 3, 3.0f, false);
	
}
