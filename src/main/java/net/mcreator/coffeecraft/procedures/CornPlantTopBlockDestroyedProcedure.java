package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CornPlantTopBlockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("coffee:corn_bottom")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y - 0.5, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
