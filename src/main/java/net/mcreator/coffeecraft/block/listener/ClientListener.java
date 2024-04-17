package net.mcreator.coffeecraft.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.coffeecraft.init.CoffeecraftModBlockEntities;
import net.mcreator.coffeecraft.block.renderer.RoasterAnimatedTileRenderer;
import net.mcreator.coffeecraft.block.renderer.GrinderAnimTileRenderer;
import net.mcreator.coffeecraft.CoffeecraftMod;

@Mod.EventBusSubscriber(modid = CoffeecraftMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CoffeecraftModBlockEntities.GRINDER_ANIM.get(), context -> new GrinderAnimTileRenderer());
		event.registerBlockEntityRenderer(CoffeecraftModBlockEntities.ROASTER_ANIMATED.get(), context -> new RoasterAnimatedTileRenderer());
	}
}
