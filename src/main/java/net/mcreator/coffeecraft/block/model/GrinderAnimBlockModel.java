package net.mcreator.coffeecraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.coffeecraft.block.entity.GrinderAnimTileEntity;

public class GrinderAnimBlockModel extends GeoModel<GrinderAnimTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrinderAnimTileEntity animatable) {
		return new ResourceLocation("coffeecraft", "animations/grinder_geckolib.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrinderAnimTileEntity animatable) {
		return new ResourceLocation("coffeecraft", "geo/grinder_geckolib.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrinderAnimTileEntity entity) {
		return new ResourceLocation("coffeecraft", "textures/block/texture_grinder.png");
	}
}
