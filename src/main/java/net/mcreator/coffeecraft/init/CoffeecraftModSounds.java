
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CoffeecraftMod.MODID);
	public static final RegistryObject<SoundEvent> DRINK_COFFEE = REGISTRY.register("drink_coffee", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("coffeecraft", "drink_coffee")));
	public static final RegistryObject<SoundEvent> ROASTER = REGISTRY.register("roaster", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("coffeecraft", "roaster")));
	public static final RegistryObject<SoundEvent> COFFEE_SOUND_EFFECT = REGISTRY.register("coffee_sound_effect", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("coffeecraft", "coffee_sound_effect")));
	public static final RegistryObject<SoundEvent> GRINDER = REGISTRY.register("grinder", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("coffeecraft", "grinder")));
	public static final RegistryObject<SoundEvent> COFFEE_COFFRE_OPEN = REGISTRY.register("coffee_coffre_open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("coffeecraft", "coffee_coffre_open")));
	public static final RegistryObject<SoundEvent> COFFEE_BAG = REGISTRY.register("coffee_bag", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("coffeecraft", "coffee_bag")));
}
