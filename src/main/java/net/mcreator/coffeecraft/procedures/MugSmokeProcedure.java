package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class MugSmokeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 0.5, 0);
	}
}
