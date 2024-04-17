
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.coffeecraft.client.model.Modelbaristasmall;
import net.mcreator.coffeecraft.client.model.Modelbarista;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CoffeecraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbaristasmall.LAYER_LOCATION, Modelbaristasmall::createBodyLayer);
		event.registerLayerDefinition(Modelbarista.LAYER_LOCATION, Modelbarista::createBodyLayer);
	}
}
