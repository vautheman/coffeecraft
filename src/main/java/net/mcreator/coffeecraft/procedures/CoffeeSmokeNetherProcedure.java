package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class CoffeeSmokeNetherProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.8) {
			world.addParticle(ParticleTypes.PORTAL, (x + 0.5), (y + 0.5), (z + 0.5), 0, 0.01, 0);
		}
	}
}
