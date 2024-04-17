package net.mcreator.coffeecraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.coffeecraft.block.display.RoasterAnimatedDisplayItem;

public class RoasterAnimatedDisplayModel extends GeoModel<RoasterAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RoasterAnimatedDisplayItem animatable) {
		return new ResourceLocation("coffeecraft", "animations/roaster_geckolib.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoasterAnimatedDisplayItem animatable) {
		return new ResourceLocation("coffeecraft", "geo/roaster_geckolib.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoasterAnimatedDisplayItem entity) {
		return new ResourceLocation("coffeecraft", "textures/block/texture_roaster_geckolib.png");
	}
}
