
package net.mcreator.coffeecraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.coffeecraft.init.CoffeecraftModItems;
import net.mcreator.coffeecraft.init.CoffeecraftModFluids;
import net.mcreator.coffeecraft.init.CoffeecraftModFluidTypes;
import net.mcreator.coffeecraft.init.CoffeecraftModBlocks;

public abstract class CoffeeFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CoffeecraftModFluidTypes.COFFEE_FLUID_TYPE.get(), () -> CoffeecraftModFluids.COFFEE_FLUID.get(),
			() -> CoffeecraftModFluids.FLOWING_COFFEE_FLUID.get()).explosionResistance(100f).tickRate(10).levelDecreasePerBlock(2).slopeFindDistance(3).bucket(() -> CoffeecraftModItems.COFFEE_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) CoffeecraftModBlocks.COFFEE_FLUID.get());

	private CoffeeFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CoffeeFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CoffeeFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
