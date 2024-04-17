
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoffeecraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> COFFEE_CRAFT = REGISTRY.register("coffee_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.coffeecraft.coffee_craft")).icon(() -> new ItemStack(CoffeecraftModItems.COFFEE_BEAN_ROASTED.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CoffeecraftModItems.COFFEE_CHERRY.get());
				tabData.accept(CoffeecraftModItems.COFFEE_BEAN.get());
				tabData.accept(CoffeecraftModItems.COFFEE_BEAN_ROASTED.get());
				tabData.accept(CoffeecraftModItems.COFFEE_POWDER.get());
				tabData.accept(CoffeecraftModBlocks.COFFEE_MAKER_BLACK_EMPTY.get().asItem());
				tabData.accept(CoffeecraftModBlocks.COFFEE_MAKER_WHITE_EMPTY.get().asItem());
				tabData.accept(CoffeecraftModBlocks.GRINDER_ANIM.get().asItem());
				tabData.accept(CoffeecraftModBlocks.ROASTER_ANIMATED.get().asItem());
				tabData.accept(CoffeecraftModItems.SHORT_MUG.get());
				tabData.accept(CoffeecraftModItems.LONG_MUG.get());
				tabData.accept(CoffeecraftModItems.COFFEE_SWEET_EXPRESSO.get());
				tabData.accept(CoffeecraftModItems.COFFEE_SWEET_LUNGO.get());
				tabData.accept(CoffeecraftModItems.COFFEE_CAPPUCCINO.get());
				tabData.accept(CoffeecraftModItems.COFFEE_MOCHA.get());
				tabData.accept(CoffeecraftModItems.COFFEE_EGG.get());
				tabData.accept(CoffeecraftModItems.COFFEE_ICED.get());
				tabData.accept(CoffeecraftModItems.COFFEE_CARROT.get());
				tabData.accept(CoffeecraftModItems.COFFEE_HONEY.get());
				tabData.accept(CoffeecraftModItems.COFFEE_NETHER.get());
				tabData.accept(CoffeecraftModItems.END_COFFEE.get());
				tabData.accept(CoffeecraftModItems.CROISSANT.get());
				tabData.accept(CoffeecraftModBlocks.COFFEE_PANCARTE.get().asItem());
				tabData.accept(CoffeecraftModBlocks.BAG_COFFEE_ROASTED.get().asItem());
				tabData.accept(CoffeecraftModBlocks.BAG_COFFEE_BEAN.get().asItem());
				tabData.accept(CoffeecraftModBlocks.BAG_COFFEE_POWDER.get().asItem());
				tabData.accept(CoffeecraftModItems.BARISTA_CHESTPLATE.get());
				tabData.accept(CoffeecraftModItems.BARISTA_SMALL_CHESTPLATE.get());
				tabData.accept(CoffeecraftModItems.COFFEE_FLUID_BUCKET.get());
				tabData.accept(CoffeecraftModBlocks.TERRACOTTA_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.WHITE_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.BLACK_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.BLUE_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.BROWN_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.CYAN_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.GRAY_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.GREEN_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.LIGHT_BLUE_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.LIGHT_GRAY_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.LIME_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.MAGENTA_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.ORANGE_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.PINK_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.PURPLE_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.RED_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.YELLOW_MUG.get().asItem());
				tabData.accept(CoffeecraftModBlocks.COFFEE_BOX_BLOC.get().asItem());
			})

					.build());
}
