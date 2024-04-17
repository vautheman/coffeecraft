package net.mcreator.coffeecraft.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.coffeecraft.block.model.GrinderAnimBlockModel;
import net.mcreator.coffeecraft.block.entity.GrinderAnimTileEntity;

public class GrinderAnimTileRenderer extends GeoBlockRenderer<GrinderAnimTileEntity> {
	public GrinderAnimTileRenderer() {
		super(new GrinderAnimBlockModel());
	}

	@Override
	public RenderType getRenderType(GrinderAnimTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
