package net.dutch.dutchcraft.procedures;

import net.minecraft.util.math.MathHelper;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.dutch.dutchcraft.potion.LondonIn1943PotionEffect;
import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class ZombieTwoEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ZombieTwoEntityDies!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (MathHelper.nextInt(new Random(), 1, 10) == 4) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(LondonIn1943PotionEffect.potion, (int) 2016, (int) 1, (false), (false)));
		}
	}
}
