package com.newwind.nwtweaks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.newwind.nwtweaks.registry.Blocks;
import com.newwind.nwtweaks.registry.Items;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("nwtweaks")
public class NWTweaks {

	public static final String modid = "nwtweaks";

	public static final Logger LOGGER = LogManager.getLogger();

	public NWTweaks() {
		Blocks.register();
		Items.register();

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

}
