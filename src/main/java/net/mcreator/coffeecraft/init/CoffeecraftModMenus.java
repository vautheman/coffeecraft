
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.coffeecraft.world.inventory.RoasterGUIMenu;
import net.mcreator.coffeecraft.world.inventory.GrinderGUIMenu;
import net.mcreator.coffeecraft.world.inventory.CoffeeMakerGUIMenu;
import net.mcreator.coffeecraft.world.inventory.CoffeeCoffreGUIMenu;
import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CoffeecraftMod.MODID);
	public static final RegistryObject<MenuType<CoffeeMakerGUIMenu>> COFFEE_MAKER_GUI = REGISTRY.register("coffee_maker_gui", () -> IForgeMenuType.create(CoffeeMakerGUIMenu::new));
	public static final RegistryObject<MenuType<RoasterGUIMenu>> ROASTER_GUI = REGISTRY.register("roaster_gui", () -> IForgeMenuType.create(RoasterGUIMenu::new));
	public static final RegistryObject<MenuType<GrinderGUIMenu>> GRINDER_GUI = REGISTRY.register("grinder_gui", () -> IForgeMenuType.create(GrinderGUIMenu::new));
	public static final RegistryObject<MenuType<CoffeeCoffreGUIMenu>> COFFEE_COFFRE_GUI = REGISTRY.register("coffee_coffre_gui", () -> IForgeMenuType.create(CoffeeCoffreGUIMenu::new));
}
