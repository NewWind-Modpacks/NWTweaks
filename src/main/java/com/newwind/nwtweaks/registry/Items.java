package com.newwind.nwtweaks.registry;

import java.util.HashMap;

import com.newwind.nwtweaks.NWTweaks;
import com.newwind.nwtweaks.item.BlockItemWDescription;
import com.newwind.nwtweaks.item.CraftedCommandBlock;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

	public static final HashMap<RegistryObject<Block>, RegistryObject<Item>> BLOCK_ITEMS = new HashMap<>();

	private static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS,
			NWTweaks.modid);

	public static final RegistryObject<BlockItem> FAKE_COMMAND_BLOCK = ITEM_REGISTRY.register(
			"fake_command_block",
			() -> new BlockItem(Blocks.FAKE_COMMAND_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

	public static final RegistryObject<BlockItem> CRAFTED_COMMAND_BLOCK = ITEM_REGISTRY.register(
			"crafted_command_block", () -> new CraftedCommandBlock(Blocks.CRAFTED_COMMAND_BLOCK.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC).rarity(Rarity.RARE)));

	public static final RegistryObject<BlockItem> ENDER_COMMAND_BLOCK = ITEM_REGISTRY.register(
			"ender_command_block", () -> new BlockItemWDescription(Blocks.ENDER_COMMAND_BLOCK.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC).rarity(Rarity.EPIC)));

	public static void register() {
		ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
