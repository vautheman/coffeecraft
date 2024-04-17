package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CoffeeMakerSmokeProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double posY = 0;
		posY = y + 1;
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "coffeeMake?")) == true) {
			if (world.isClientSide() == true) {
				if (Math.random() > 0.5) {
					world.addParticle(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z + 0.5), 0, 0.1, 0);
				}
			}
			posY = posY + 1;
		}
	}
}
