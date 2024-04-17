package net.mcreator.coffeecraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.coffeecraft.block.entity.RoasterAnimatedTileEntity;

public class RoasterAnimatedBlockModel extends GeoModel<RoasterAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoasterAnimatedTileEntity animatable) {
		return new ResourceLocation("coffeecraft", "animations/roaster_geckolib.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoasterAnimatedTileEntity animatable) {
		return new ResourceLocation("coffeecraft", "geo/roaster_geckolib.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoasterAnimatedTileEntity entity) {
		return new ResourceLocation("coffeecraft", "textures/block/texture_roaster_geckolib.png");
	}
}
