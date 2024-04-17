package net.mcreator.coffeecraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbarista<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("coffeecraft", "modelbarista"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public Modelbarista(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tabliertop = Body.addOrReplaceChild("tabliertop",
				CubeListBuilder.create().texOffs(0, 21).addBox(0.5F, 1.0F, -12.75F, 8.0F, 10.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(0.0F, 9.0F, -8.25F, 9.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-0.05F, 9.0F, -12.75F, 0.5F, 2.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(8.5F, 9.0F, -12.75F, 0.5F, 2.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(1.5F, -1.0F, -12.75F, 1.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(1.5F, -1.5F, -12.75F, 1.0F, 0.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(6.5F, -1.5F, -12.75F, 1.0F, 0.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(6.5F, -1.0F, -12.75F, 1.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(5.5F, 3.25F, -13.0F, 2.0F, 2.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(6.5F, -1.0F, -8.25F, 1.0F, 10.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(1.5F, -1.0F, -8.25F, 1.0F, 10.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 1.0F, 10.25F));
		PartDefinition tablierbottom = Body.addOrReplaceChild("tablierbottom",
				CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -12.0F, -2.75F, 6.0F, 3.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-4.0F, -12.0F, -2.5F, 8.0F, 8.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
