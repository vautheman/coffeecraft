package net.mcreator.coffeecraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.coffeecraft.world.inventory.RoasterGUIMenu;
import net.mcreator.coffeecraft.procedures.RoueDisplay2Procedure;
import net.mcreator.coffeecraft.procedures.RoueDisplay1Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay9Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay8Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay7Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay6Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay5Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay4Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay3Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay2Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay1Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay10Procedure;
import net.mcreator.coffeecraft.procedures.FeuDisplay5Procedure;
import net.mcreator.coffeecraft.procedures.FeuDisplay4Procedure;
import net.mcreator.coffeecraft.procedures.FeuDisplay3Procedure;
import net.mcreator.coffeecraft.procedures.FeuDisplay2Procedure;
import net.mcreator.coffeecraft.procedures.FeuDisplay1Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RoasterGUIScreen extends AbstractContainerScreen<RoasterGUIMenu> {
	private final static HashMap<String, Object> guistate = RoasterGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RoasterGUIScreen(RoasterGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/roastergui.png"), this.leftPos + 0, this.topPos + -31, 0, 0, 176, 229, 176, 229);

		if (FeuDisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/feu1.png"), this.leftPos + 49, this.topPos + 44, 0, 0, 13, 2, 13, 2);
		}
		if (FeuDisplay2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/feu2.png"), this.leftPos + 49, this.topPos + 42, 0, 0, 13, 4, 13, 4);
		}
		if (FeuDisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/feu3.png"), this.leftPos + 49, this.topPos + 40, 0, 0, 13, 6, 13, 6);
		}
		if (FeuDisplay4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/feu4.png"), this.leftPos + 49, this.topPos + 38, 0, 0, 13, 8, 13, 8);
		}
		if (FeuDisplay5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/feu5.png"), this.leftPos + 49, this.topPos + 35, 0, 0, 13, 11, 13, 11);
		}
		if (RoueDisplay1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/roue1.png"), this.leftPos + 81, this.topPos + 52, 0, 0, 14, 14, 14, 14);
		}
		if (RoueDisplay2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/roue2.png"), this.leftPos + 83, this.topPos + 54, 0, 0, 10, 10, 10, 10);
		}
		if (FlecheDisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche1.png"), this.leftPos + 77, this.topPos + 38, 0, 0, 2, 4, 2, 4);
		}
		if (FlecheDisplay2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche2.png"), this.leftPos + 77, this.topPos + 38, 0, 0, 4, 4, 4, 4);
		}
		if (FlecheDisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche3.png"), this.leftPos + 77, this.topPos + 38, 0, 0, 6, 4, 6, 4);
		}
		if (FlecheDisplay4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche4.png"), this.leftPos + 77, this.topPos + 38, 0, 0, 8, 4, 8, 4);
		}
		if (FlecheDisplay5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche5.png"), this.leftPos + 77, this.topPos + 38, 0, 0, 10, 4, 10, 4);
		}
		if (FlecheDisplay6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche6.png"), this.leftPos + 77, this.topPos + 38, 0, 0, 12, 4, 12, 4);
		}
		if (FlecheDisplay7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche7.png"), this.leftPos + 77, this.topPos + 38, 0, 0, 14, 4, 14, 4);
		}
		if (FlecheDisplay8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche8.png"), this.leftPos + 77, this.topPos + 35, 0, 0, 16, 10, 16, 10);
		}
		if (FlecheDisplay9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche9.png"), this.leftPos + 77, this.topPos + 35, 0, 0, 18, 10, 18, 10);
		}
		if (FlecheDisplay10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche10.png"), this.leftPos + 77, this.topPos + 35, 0, 0, 20, 10, 20, 10);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
