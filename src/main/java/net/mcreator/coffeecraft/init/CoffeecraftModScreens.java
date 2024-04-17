
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.coffeecraft.client.gui.RoasterGUIScreen;
import net.mcreator.coffeecraft.client.gui.GrinderGUIScreen;
import net.mcreator.coffeecraft.client.gui.CoffeeMakerGUIScreen;
import net.mcreator.coffeecraft.client.gui.CoffeeCoffreGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CoffeecraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CoffeecraftModMenus.COFFEE_MAKER_GUI.get(), CoffeeMakerGUIScreen::new);
			MenuScreens.register(CoffeecraftModMenus.ROASTER_GUI.get(), RoasterGUIScreen::new);
			MenuScreens.register(CoffeecraftModMenus.GRINDER_GUI.get(), GrinderGUIScreen::new);
			MenuScreens.register(CoffeecraftModMenus.COFFEE_COFFRE_GUI.get(), CoffeeCoffreGUIScreen::new);
		});
	}
}
