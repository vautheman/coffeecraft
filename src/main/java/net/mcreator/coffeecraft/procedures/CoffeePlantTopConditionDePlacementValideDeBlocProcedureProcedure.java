package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CoffeePlantTopConditionDePlacementValideDeBlocProcedureProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("coffee:corn_bottom")))) {
			return true;
		}
		return false;
	}
}
