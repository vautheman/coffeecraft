package net.mcreator.coffeecraft.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.coffeecraft.block.model.RoasterAnimatedDisplayModel;
import net.mcreator.coffeecraft.block.display.RoasterAnimatedDisplayItem;

public class RoasterAnimatedDisplayItemRenderer extends GeoItemRenderer<RoasterAnimatedDisplayItem> {
	public RoasterAnimatedDisplayItemRenderer() {
		super(new RoasterAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(RoasterAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
