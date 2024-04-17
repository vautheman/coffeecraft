package net.mcreator.coffeecraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.coffeecraft.world.inventory.CoffeeMakerGUIMenu;
import net.mcreator.coffeecraft.procedures.ShortDisplayProcedure;
import net.mcreator.coffeecraft.procedures.ProgressBarDisplay4Procedure;
import net.mcreator.coffeecraft.procedures.ProgressBarDisplay3Procedure;
import net.mcreator.coffeecraft.procedures.ProgressBarDisplay2Procedure;
import net.mcreator.coffeecraft.procedures.ProgressBarDisplay1Procedure;
import net.mcreator.coffeecraft.procedures.ProgressBarDisplay0Procedure;
import net.mcreator.coffeecraft.procedures.LongDisplayProcedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay9Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay7Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay5Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay3Procedure;
import net.mcreator.coffeecraft.procedures.FlecheDisplay10Procedure;
import net.mcreator.coffeecraft.procedures.FeuDisplay1Procedure;
import net.mcreator.coffeecraft.network.CoffeeMakerGUIButtonMessage;
import net.mcreator.coffeecraft.CoffeecraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CoffeeMakerGUIScreen extends AbstractContainerScreen<CoffeeMakerGUIMenu> {
	private final static HashMap<String, Object> guistate = CoffeeMakerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_guicoffeemakerbutton1;
	ImageButton imagebutton_guicoffeemakerbutton2;

	public CoffeeMakerGUIScreen(CoffeeMakerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 164;
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

		guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/coffeemakerguiv2.png"), this.leftPos + 0, this.topPos + -34, 0, 0, 176, 229, 176, 229);

		if (ProgressBarDisplay0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/water0.png"), this.leftPos + 25, this.topPos + 19, 0, 0, 9, 54, 9, 54);
		}
		if (ProgressBarDisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/water1.png"), this.leftPos + 25, this.topPos + 19, 0, 0, 9, 54, 9, 54);
		}
		if (ProgressBarDisplay2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/water2.png"), this.leftPos + 25, this.topPos + 19, 0, 0, 9, 54, 9, 54);
		}
		if (ProgressBarDisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/water3.png"), this.leftPos + 25, this.topPos + 19, 0, 0, 9, 54, 9, 54);
		}
		if (ProgressBarDisplay4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/water4.png"), this.leftPos + 25, this.topPos + 19, 0, 0, 9, 54, 9, 54);
		}
		if (FeuDisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/bean0.png"), this.leftPos + 124, this.topPos + 34, 0, 0, 7, 2, 7, 2);
		}
		if (FlecheDisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/bean1.png"), this.leftPos + 122, this.topPos + 32, 0, 0, 11, 4, 11, 4);
		}
		if (FlecheDisplay5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/bean2.png"), this.leftPos + 122, this.topPos + 30, 0, 0, 12, 6, 12, 6);
		}
		if (FlecheDisplay7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/bean3.png"), this.leftPos + 122, this.topPos + 28, 0, 0, 12, 8, 12, 8);
		}
		if (FlecheDisplay9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/bean4.png"), this.leftPos + 122, this.topPos + 26, 0, 0, 12, 10, 12, 10);
		}
		if (FlecheDisplay10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/bean5.png"), this.leftPos + 122, this.topPos + 24, 0, 0, 12, 12, 12, 12);
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
		imagebutton_guicoffeemakerbutton1 = new ImageButton(this.leftPos + 109, this.topPos + 2, 17, 17, 0, 0, 17, new ResourceLocation("coffeecraft:textures/screens/atlas/imagebutton_guicoffeemakerbutton1.png"), 17, 34, e -> {
			if (ShortDisplayProcedure.execute(world, x, y, z, entity)) {
				CoffeecraftMod.PACKET_HANDLER.sendToServer(new CoffeeMakerGUIButtonMessage(0, x, y, z));
				CoffeeMakerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ShortDisplayProcedure.execute(world, x, y, z, entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_guicoffeemakerbutton1", imagebutton_guicoffeemakerbutton1);
		this.addRenderableWidget(imagebutton_guicoffeemakerbutton1);
		imagebutton_guicoffeemakerbutton2 = new ImageButton(this.leftPos + 131, this.topPos + 2, 17, 17, 0, 0, 17, new ResourceLocation("coffeecraft:textures/screens/atlas/imagebutton_guicoffeemakerbutton2.png"), 17, 34, e -> {
			if (LongDisplayProcedure.execute(world, x, y, z, entity)) {
				CoffeecraftMod.PACKET_HANDLER.sendToServer(new CoffeeMakerGUIButtonMessage(1, x, y, z));
				CoffeeMakerGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (LongDisplayProcedure.execute(world, x, y, z, entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_guicoffeemakerbutton2", imagebutton_guicoffeemakerbutton2);
		this.addRenderableWidget(imagebutton_guicoffeemakerbutton2);
	}
}
