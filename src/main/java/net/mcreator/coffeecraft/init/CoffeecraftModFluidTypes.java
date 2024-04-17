
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.coffeecraft.fluid.types.CoffeeFluidFluidType;
import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CoffeecraftMod.MODID);
	public static final RegistryObject<FluidType> COFFEE_FLUID_TYPE = REGISTRY.register("coffee_fluid", () -> new CoffeeFluidFluidType());
}
