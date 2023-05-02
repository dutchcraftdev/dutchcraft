package net.dutch.dutchcraft.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.dutch.dutchcraft.DutchcraftModElements;

import java.lang.reflect.Method;

@DutchcraftModElements.ModElement.Tag
public class DoSlendermanJumpscaresGameRule extends DutchcraftModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("doSlendermanJumpscares", GameRules.Category.PLAYER,
			create(true));

	public DoSlendermanJumpscaresGameRule(DutchcraftModElements instance) {
		super(instance, 178);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
