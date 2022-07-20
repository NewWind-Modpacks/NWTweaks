package com.newwind.nwtweaks.item;

import com.newwind.nwtweaks.registry.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class CraftedCommandBlock extends BlockItemWDescription {

	public CraftedCommandBlock(Block p_i48527_1_, Properties p_i48527_2_) {
		super(p_i48527_1_, p_i48527_2_);
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
		EnderDragonEntity dragon = world.getNearestLoadedEntity(
			EnderDragonEntity.class,
			EntityPredicate.DEFAULT.range(14.0D),
			player,
			player.getX(),
			player.getY(),
			player.getZ(),
			new AxisAlignedBB(player.blockPosition()).inflate(14.0D)
		);
		
		if (dragon == null) return ActionResult.fail(player.getItemInHand(hand));
		else {
			dragon.kill();
			ItemStack itemStack = Items.ENDER_COMMAND_BLOCK.get().getDefaultInstance();
			player.setItemInHand(hand, itemStack);
			return ActionResult.sidedSuccess(itemStack, world.isClientSide());
		}
	}

}
