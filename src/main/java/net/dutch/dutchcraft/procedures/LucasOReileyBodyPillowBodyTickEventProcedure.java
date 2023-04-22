package net.dutch.dutchcraft.procedures;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class LucasOReileyBodyPillowBodyTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency entity for procedure LucasOReileyBodyPillowBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (MathHelper.nextInt(new Random(), 1, 1000) == 3) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).attackEntityFrom(new DamageSource("bodypillow").setDamageBypassesArmor(), (float) 2);
			}
		}
	}
}
