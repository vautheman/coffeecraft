package net.mcreator.coffeecraft.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.coffeecraft.block.model.RoasterAnimatedBlockModel;
import net.mcreator.coffeecraft.block.entity.RoasterAnimatedTileEntity;

public class RoasterAnimatedTileRenderer extends GeoBlockRenderer<RoasterAnimatedTileEntity> {
	public RoasterAnimatedTileRenderer() {
		super(new RoasterAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(RoasterAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
