package net.dutch.dutchcraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.dutch.dutchcraft.entity.LucasOReileyCloneEntity;
import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class LucasOReileyStatueUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency world for procedure LucasOReileyStatueUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency x for procedure LucasOReileyStatueUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency y for procedure LucasOReileyStatueUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency z for procedure LucasOReileyStatueUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double x_selected = 0;
		double y_selected = 0;
		double z_selected = 0;
		if (world.getWorldInfo().getDayTime() > 13000) {
			for (int index0 = 0; index0 < (int) (15); index0++) {
				x_selected = (x + MathHelper.nextInt(new Random(), -50, 50));
				y_selected = (y + MathHelper.nextInt(new Random(), -20, 20));
				z_selected = (z + MathHelper.nextInt(new Random(), -50, 50));
				if ((world.getBlockState(new BlockPos(x_selected, y_selected + 1, z_selected))).getBlock() == Blocks.AIR
						&& (world.getBlockState(new BlockPos(x_selected, y_selected, z_selected))).getBlock() == Blocks.AIR
						&& !((world.getBlockState(new BlockPos(x_selected, y_selected - 1, z_selected))).getBlock() == Blocks.AIR)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new LucasOReileyCloneEntity.CustomEntity(LucasOReileyCloneEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x_selected, y_selected, z_selected, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
