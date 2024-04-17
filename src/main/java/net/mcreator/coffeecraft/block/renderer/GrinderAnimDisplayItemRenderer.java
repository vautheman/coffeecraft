package net.mcreator.coffeecraft.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.coffeecraft.block.model.GrinderAnimDisplayModel;
import net.mcreator.coffeecraft.block.display.GrinderAnimDisplayItem;

public class GrinderAnimDisplayItemRenderer extends GeoItemRenderer<GrinderAnimDisplayItem> {
	public GrinderAnimDisplayItemRenderer() {
		super(new GrinderAnimDisplayModel());
	}

	@Override
	public RenderType getRenderType(GrinderAnimDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
