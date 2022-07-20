package com.newwind.nwtweaks.registry;

import com.newwind.nwtweaks.NWTweaks;
import com.newwind.nwtweaks.block.EnderCommandBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {

	private static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NWTweaks.modid);

	public static final RegistryObject<Block> FAKE_COMMAND_BLOCK = BLOCK_REGISTRY.register(
		"fake_command_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
		.requiresCorrectToolForDrops()
		.strength(1.25F, 4.2F)
	));

	public static final RegistryObject<Block> CRAFTED_COMMAND_BLOCK = BLOCK_REGISTRY.register(
		"crafted_command_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN)
		.requiresCorrectToolForDrops()
		.strength(70.0F, 3600.0F)
	));

	public static final RegistryObject<Block> ENDER_COMMAND_BLOCK = BLOCK_REGISTRY.register(
		"ender_command_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN)
		.requiresCorrectToolForDrops()
		.strength(70.0F, 3600.0F)
	));

	public static void register() {
		BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
