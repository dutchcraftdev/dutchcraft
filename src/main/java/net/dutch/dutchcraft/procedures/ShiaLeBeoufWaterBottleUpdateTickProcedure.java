package net.dutch.dutchcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.dutch.dutchcraft.item.OrangeItem;
import net.dutch.dutchcraft.item.OrangeBrickItem;
import net.dutch.dutchcraft.item.LegoIndianaJonesXbox360Item;
import net.dutch.dutchcraft.item.HomelessTearItem;
import net.dutch.dutchcraft.block.StickyKeysBlockBlock;
import net.dutch.dutchcraft.block.LouisianaJonesBlockBlock;
import net.dutch.dutchcraft.block.DontClickOnThisBlockBlock;
import net.dutch.dutchcraft.block.AldoMoroBoykisserCubeBlock;
import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class ShiaLeBeoufWaterBottleUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency world for procedure ShiaLeBeoufWaterBottleUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency x for procedure ShiaLeBeoufWaterBottleUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency y for procedure ShiaLeBeoufWaterBottleUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency z for procedure ShiaLeBeoufWaterBottleUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double drop_number = 0;
		double RemainingVomits = 0;
		if (MathHelper.nextInt(new Random(), 1, 200) == 5) {
			RemainingVomits = (RemainingVomits - 1);
			for (int index0 = 0; index0 < (int) (MathHelper.nextInt(new Random(), 1, 3)); index0++) {
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos(x, y, z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("dutchcraft:blocks.shia.vomit")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("dutchcraft:blocks.shia.vomit")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				drop_number = (MathHelper.nextInt(new Random(), 0, 10));
				if (drop_number == 0) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(HomelessTearItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 1) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(OrangeBrickItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 2) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(StickyKeysBlockBlock.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 3) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(LegoIndianaJonesXbox360Item.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 4) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(Blocks.CLAY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 5) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(Blocks.GOLD_BLOCK));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 6) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(OrangeItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 7) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(LouisianaJonesBlockBlock.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 8) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(DontClickOnThisBlockBlock.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
				if (drop_number == 9) {
					for (int index1 = 0; index1 < (int) (10); index1++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(Blocks.SPONGE));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if (drop_number == 10) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(AldoMoroBoykisserCubeBlock.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
