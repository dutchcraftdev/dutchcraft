package net.dutch.dutchcraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.dutch.dutchcraft.block.SpreadingCrystalStemBlock;
import net.dutch.dutchcraft.block.SpreadingCrystalBlock;
import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class SpreadingCrystalUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency world for procedure SpreadingCrystalUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency x for procedure SpreadingCrystalUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency y for procedure SpreadingCrystalUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency z for procedure SpreadingCrystalUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (MathHelper.nextInt(new Random(), 1, 10) == 3) {
			if (!world.isRemote()) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
					world.setBlockState(new BlockPos(x, y + 1, z), SpreadingCrystalStemBlock.block.getDefaultState(), 3);
				}
			}
		}
		if (MathHelper.nextInt(new Random(), 1, 10) == 3) {
			if (!world.isRemote()) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y + 1, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y - 1, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x + 1, y, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x - 1, y, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y, z - 1), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y, z + 1), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x + 1, y + 1, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x - 1, y + 1, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y + 1, z - 1), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y + 1, z + 1), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x + 1, y - 1, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x - 1, y - 1, z), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y - 1, z - 1), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlockState(new BlockPos(x, y - 1, z + 1), SpreadingCrystalBlock.block.getDefaultState(), 3);
				}
			}
		}
	}
}
