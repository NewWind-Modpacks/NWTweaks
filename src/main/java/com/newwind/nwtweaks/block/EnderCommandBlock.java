package com.newwind.nwtweaks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnderCommandBlock extends Block {

	public EnderCommandBlock(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}

	@Override
	public void onPlace(BlockState p_220082_1_, World world, BlockPos block_pos, BlockState p_220082_4_,
			boolean p_220082_5_) {
		world.setBlock(block_pos, Blocks.COMMAND_BLOCK.defaultBlockState(), 0);
	}
	
}
