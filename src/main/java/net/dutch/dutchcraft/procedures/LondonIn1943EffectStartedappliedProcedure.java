package net.dutch.dutchcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;

import net.dutch.dutchcraft.DutchcraftMod;

import java.util.Random;
import java.util.Map;

public class LondonIn1943EffectStartedappliedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency world for procedure LondonIn1943EffectStartedapplied!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency x for procedure LondonIn1943EffectStartedapplied!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency y for procedure LondonIn1943EffectStartedapplied!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DutchcraftMod.LOGGER.warn("Failed to load dependency z for procedure LondonIn1943EffectStartedapplied!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dutchcraft:music.londoninflames")),
					SoundCategory.VOICE, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("dutchcraft:music.londoninflames")),
					SoundCategory.VOICE, (float) 1, (float) 1, false);
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + MathHelper.nextInt(new Random(), 25, 50)), (int) y,
							(int) (z - MathHelper.nextInt(new Random(), 25, 50)), (float) (MathHelper.nextInt(new Random(), 1, 6)),
							Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + MathHelper.nextInt(new Random(), 25, 50)), (int) y,
							(int) (z - MathHelper.nextInt(new Random(), 25, 50)), (float) (MathHelper.nextInt(new Random(), 1, 6)),
							Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + MathHelper.nextInt(new Random(), 25, 50)), (int) y,
							(int) (z - MathHelper.nextInt(new Random(), 25, 50)), (float) (MathHelper.nextInt(new Random(), 1, 6)),
							Explosion.Mode.BREAK);
				}
				for (int index0 = 0; index0 < (int) (30); index0++) {
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (MathHelper.nextInt(new Random(), 1, 5) == 5) {
								if (world instanceof World && !((World) world).isRemote) {
									((World) world).createExplosion(null, (int) (x + MathHelper.nextInt(new Random(), 25, 50)), (int) y,
											(int) (z - MathHelper.nextInt(new Random(), 25, 50)), (float) (MathHelper.nextInt(new Random(), 1, 6)),
											Explosion.Mode.BREAK);
								}
							}
							if (MathHelper.nextInt(new Random(), 1, 5) == 5) {
								if (world instanceof World && !((World) world).isRemote) {
									((World) world).createExplosion(null, (int) (x - MathHelper.nextInt(new Random(), 25, 50)), (int) y,
											(int) (z + MathHelper.nextInt(new Random(), 25, 50)), (float) (MathHelper.nextInt(new Random(), 1, 6)),
											Explosion.Mode.BREAK);
								}
							}
							if (MathHelper.nextInt(new Random(), 1, 5) == 5) {
								if (world instanceof World && !((World) world).isRemote) {
									((World) world).createExplosion(null, (int) (x + MathHelper.nextInt(new Random(), 25, 50)), (int) y,
											(int) (z + MathHelper.nextInt(new Random(), 25, 50)), (float) (MathHelper.nextInt(new Random(), 1, 6)),
											Explosion.Mode.BREAK);
								}
							}
							if (MathHelper.nextInt(new Random(), 1, 5) == 5) {
								if (world instanceof World && !((World) world).isRemote) {
									((World) world).createExplosion(null, (int) (x - MathHelper.nextInt(new Random(), 25, 50)), (int) y,
											(int) (z - MathHelper.nextInt(new Random(), 25, 50)), (float) (MathHelper.nextInt(new Random(), 1, 6)),
											Explosion.Mode.BREAK);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) (MathHelper.nextInt(new Random(), 1, 200)));
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 1303);
	}
}
