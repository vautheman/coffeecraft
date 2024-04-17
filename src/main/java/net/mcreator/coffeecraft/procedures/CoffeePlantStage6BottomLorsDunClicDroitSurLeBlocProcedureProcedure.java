package net.mcreator.coffeecraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.coffeecraft.init.CoffeecraftModItems;
import net.mcreator.coffeecraft.init.CoffeecraftModBlocks;

public class CoffeePlantStage6BottomLorsDunClicDroitSurLeBlocProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Math.random();
		if (random >= 0.8) {
			for (int index0 = 0; index0 < 3; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CoffeecraftModItems.COFFEE_CHERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_BOTTOM.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_TOP.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (random >= 0.5) {
			for (int index1 = 0; index1 < 2; index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CoffeecraftModItems.COFFEE_CHERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_BOTTOM.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_TOP.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CoffeecraftModItems.COFFEE_CHERRY.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(BlockPos.containing(x, y, z), CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_BOTTOM.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_TOP.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
