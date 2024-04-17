
package net.mcreator.coffeecraft.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import net.mcreator.coffeecraft.procedures.CoffeeSmokeDefaultProcedure;
import net.mcreator.coffeecraft.procedures.CoffeeFluidHitProcedure;
import net.mcreator.coffeecraft.init.CoffeecraftModFluids;

public class CoffeeFluidBlock extends LiquidBlock {
	public CoffeeFluidBlock() {
		super(() -> CoffeecraftModFluids.COFFEE_FLUID.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		CoffeeFluidHitProcedure.execute(world, entity);
	}

	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		CoffeeSmokeDefaultProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
