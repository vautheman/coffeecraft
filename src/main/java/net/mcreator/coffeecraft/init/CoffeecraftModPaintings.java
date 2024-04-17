
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, CoffeecraftMod.MODID);
	public static final RegistryObject<PaintingVariant> COFFEE = REGISTRY.register("coffee", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> COFFEE_HOUSE = REGISTRY.register("coffee_house", () -> new PaintingVariant(64, 64));
	public static final RegistryObject<PaintingVariant> INSIDE_COFFEE = REGISTRY.register("inside_coffee", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> COFFEE_NOEL = REGISTRY.register("coffee_noel", () -> new PaintingVariant(32, 16));
	public static final RegistryObject<PaintingVariant> COFFEE_MORNING = REGISTRY.register("coffee_morning", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> COFFEE_CUP_1952 = REGISTRY.register("coffee_cup_1952", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> JUST_COFFEE_PLEASE = REGISTRY.register("just_coffee_please", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> MENU_BREAK_FAST = REGISTRY.register("menu_break_fast", () -> new PaintingVariant(16, 32));
}
