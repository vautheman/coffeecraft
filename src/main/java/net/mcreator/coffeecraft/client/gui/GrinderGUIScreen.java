package net.mcreator.coffeecraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.coffeecraft.world.inventory.GrinderGUIMenu;
import net.mcreator.coffeecraft.procedures.GrinderDisplay4Procedure;
import net.mcreator.coffeecraft.procedures.GrinderDisplay3Procedure;
import net.mcreator.coffeecraft.procedures.GrinderDisplay2Procedure;
import net.mcreator.coffeecraft.procedures.GrinderDisplay1Procedure;
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
import net.mcreator.coffeecraft.procedures.CoffeePowderRecipeProcedure;
import net.mcreator.coffeecraft.network.GrinderGUIButtonMessage;
import net.mcreator.coffeecraft.CoffeecraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GrinderGUIScreen extends AbstractContainerScreen<GrinderGUIMenu> {
	private final static HashMap<String, Object> guistate = GrinderGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_grindbtn;

	public GrinderGUIScreen(GrinderGUIMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/grindergui.png"), this.leftPos + 0, this.topPos + -32, 0, 0, 176, 229, 176, 229);

		if (FlecheDisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche1.png"), this.leftPos + 90, this.topPos + 39, 0, 0, 2, 4, 2, 4);
		}
		if (FlecheDisplay2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche2.png"), this.leftPos + 90, this.topPos + 39, 0, 0, 4, 4, 4, 4);
		}
		if (FlecheDisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche3.png"), this.leftPos + 90, this.topPos + 39, 0, 0, 6, 4, 6, 4);
		}
		if (FlecheDisplay4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche4.png"), this.leftPos + 90, this.topPos + 39, 0, 0, 8, 4, 8, 4);
		}
		if (FlecheDisplay5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche5.png"), this.leftPos + 90, this.topPos + 39, 0, 0, 10, 4, 10, 4);
		}
		if (FlecheDisplay6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche6.png"), this.leftPos + 90, this.topPos + 39, 0, 0, 12, 4, 12, 4);
		}
		if (FlecheDisplay7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche7.png"), this.leftPos + 90, this.topPos + 39, 0, 0, 14, 4, 14, 4);
		}
		if (FlecheDisplay8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche8.png"), this.leftPos + 90, this.topPos + 36, 0, 0, 16, 10, 16, 10);
		}
		if (FlecheDisplay9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche9.png"), this.leftPos + 90, this.topPos + 36, 0, 0, 18, 10, 18, 10);
		}
		if (FlecheDisplay10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/fleche10.png"), this.leftPos + 90, this.topPos + 36, 0, 0, 20, 10, 20, 10);
		}
		if (GrinderDisplay1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/grinder1.png"), this.leftPos + 93, this.topPos + 52, 0, 0, 14, 16, 14, 16);
		}
		if (GrinderDisplay2Procedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/grinder2.png"), this.leftPos + 93, this.topPos + 52, 0, 0, 15, 16, 15, 16);
		}
		if (GrinderDisplay3Procedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/grinder3.png"), this.leftPos + 93, this.topPos + 52, 0, 0, 15, 16, 15, 16);
		}
		if (GrinderDisplay4Procedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(new ResourceLocation("coffeecraft:textures/screens/grinder4.png"), this.leftPos + 93, this.topPos + 52, 0, 0, 15, 16, 15, 16);
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
		imagebutton_grindbtn = new ImageButton(this.leftPos + 120, this.topPos + 15, 28, 10, 0, 0, 10, new ResourceLocation("coffeecraft:textures/screens/atlas/imagebutton_grindbtn.png"), 28, 20, e -> {
			if (CoffeePowderRecipeProcedure.execute(world, x, y, z, entity)) {
				CoffeecraftMod.PACKET_HANDLER.sendToServer(new GrinderGUIButtonMessage(0, x, y, z));
				GrinderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CoffeePowderRecipeProcedure.execute(world, x, y, z, entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_grindbtn", imagebutton_grindbtn);
		this.addRenderableWidget(imagebutton_grindbtn);
	}
}
