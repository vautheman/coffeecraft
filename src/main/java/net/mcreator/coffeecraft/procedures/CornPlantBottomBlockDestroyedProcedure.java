package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CornPlantBottomBlockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("coffee:corn_top")))) {
			world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
		}
	}
}
