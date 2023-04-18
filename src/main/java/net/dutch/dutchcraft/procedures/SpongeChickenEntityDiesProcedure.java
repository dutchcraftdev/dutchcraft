package net.dutch.dutchcraft.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.dutch.dutchcraft.potion.SpongeingPotionEffect;
import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Map;

public class SpongeChickenEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure SpongeChickenEntityDies!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(SpongeingPotionEffect.potion, (int) 1200, (int) 1));
	}
}
