package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CoffeeFluidMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isClientSide()) {
			for (int index0 = 0; index0 < 10; index0++) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1.5, z))).getBlock() == Blocks.AIR) {
					world.addParticle(ParticleTypes.SMOKE, (x + Mth.nextInt(RandomSource.create(), 0, 1)), (y + 1.5), (z + Mth.nextInt(RandomSource.create(), 0, 1)), 0, 1, 0);
				}
			}
		}
	}
}
