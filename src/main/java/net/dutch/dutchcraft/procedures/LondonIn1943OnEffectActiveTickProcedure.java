package net.dutch.dutchcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.MathHelper;

import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class LondonIn1943OnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency world for procedure LondonIn1943OnEffectActiveTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency x for procedure LondonIn1943OnEffectActiveTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency y for procedure LondonIn1943OnEffectActiveTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency z for procedure LondonIn1943OnEffectActiveTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double x1 = 0;
		double y1 = 0;
		if (MathHelper.nextInt(new Random(), 1, 30) == 3) {
			x1 = (MathHelper.nextInt(new Random(), 1, 50));
			y1 = (MathHelper.nextInt(new Random(), 1, 50));
			if (Math.sqrt((x1 - x) * (x1 - x) + (y1 - z) * (y1 - z)) > 20) {
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x1, (int) y, (int) y1, (float) (MathHelper.nextInt(new Random(), 1, 6)),
							Explosion.Mode.BREAK);
				}
			}
		}
	}
}
