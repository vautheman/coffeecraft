package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.coffeecraft.init.CoffeecraftModBlocks;

public class CoffeePlantStage0MiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage3Top = Blocks.AIR.defaultBlockState();
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		BlockState stage4 = Blocks.AIR.defaultBlockState();
		BlockState stage5 = Blocks.AIR.defaultBlockState();
		BlockState stage6 = Blocks.AIR.defaultBlockState();
		BlockState stage4Top = Blocks.AIR.defaultBlockState();
		BlockState stage5Top = Blocks.AIR.defaultBlockState();
		BlockState stage6Top = Blocks.AIR.defaultBlockState();
		String TopTag = "";
		stage0 = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_0.get().defaultBlockState();
		stage1 = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_1.get().defaultBlockState();
		stage2 = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_2.get().defaultBlockState();
		stage3 = CoffeecraftModBlocks.COFFE_PLANT_STAGE_3_BOTTOM.get().defaultBlockState();
		stage3Top = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_3_TOP.get().defaultBlockState();
		stage4 = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_BOTTOM.get().defaultBlockState();
		stage4Top = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_TOP.get().defaultBlockState();
		stage5 = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_5_BOTTOM.get().defaultBlockState();
		stage5Top = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_5_TOP.get().defaultBlockState();
		stage6 = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_6_BOTTOM.get().defaultBlockState();
		stage6Top = CoffeecraftModBlocks.COFFEE_PLANT_STAGE_6_TOP.get().defaultBlockState();
		TopTag = "coffee:corn_top";
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "GrowthTime") <= 0) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage0.getBlock() && stage1.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage1, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage1.getBlock() && stage2.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage2, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage2.getBlock() && stage3.canSurvive(world, BlockPos.containing(x, y, z)) && stage3Top.canSurvive(world, BlockPos.containing(x, y + 1, z))
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y, z), stage3, 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), stage3Top, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage3.getBlock() && stage4.canSurvive(world, BlockPos.containing(x, y, z)) && stage4Top.canSurvive(world, BlockPos.containing(x, y + 1, z))
					&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation((TopTag).toLowerCase(java.util.Locale.ENGLISH)))))) {
				world.setBlock(BlockPos.containing(x, y, z), stage4, 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), stage4Top, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage4.getBlock() && stage5.canSurvive(world, BlockPos.containing(x, y, z)) && stage5Top.canSurvive(world, BlockPos.containing(x, y + 1, z))
					&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation((TopTag).toLowerCase(java.util.Locale.ENGLISH)))))) {
				world.setBlock(BlockPos.containing(x, y, z), stage5, 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), stage5Top, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == stage5.getBlock() && stage6.canSurvive(world, BlockPos.containing(x, y, z)) && stage6Top.canSurvive(world, BlockPos.containing(x, y + 1, z))
					&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation((TopTag).toLowerCase(java.util.Locale.ENGLISH)))))) {
				world.setBlock(BlockPos.containing(x, y, z), stage6, 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), stage6Top, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("GrowthTime", 4);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("GrowthTime", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "GrowthTime")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
