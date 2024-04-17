package net.mcreator.coffeecraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.coffeecraft.block.display.GrinderAnimDisplayItem;

public class GrinderAnimDisplayModel extends GeoModel<GrinderAnimDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GrinderAnimDisplayItem animatable) {
		return new ResourceLocation("coffeecraft", "animations/grinder_geckolib.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrinderAnimDisplayItem animatable) {
		return new ResourceLocation("coffeecraft", "geo/grinder_geckolib.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrinderAnimDisplayItem entity) {
		return new ResourceLocation("coffeecraft", "textures/block/texture_grinder.png");
	}
}
