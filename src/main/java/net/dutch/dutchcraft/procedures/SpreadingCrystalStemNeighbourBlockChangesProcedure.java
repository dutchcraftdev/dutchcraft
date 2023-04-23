package net.dutch.dutchcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.dutch.dutchcraft.item.CrystalFruitItem;
import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class SpreadingCrystalStemNeighbourBlockChangesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency world for procedure SpreadingCrystalStemNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency x for procedure SpreadingCrystalStemNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency y for procedure SpreadingCrystalStemNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency z for procedure SpreadingCrystalStemNeighbourBlockChanges!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			for (int index0 = 0; index0 < (int) (MathHelper.nextInt(new Random(), 1, 4)); index0++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CrystalFruitItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
