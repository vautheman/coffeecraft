
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.coffeecraft.item.ShortMugItem;
import net.mcreator.coffeecraft.item.LongMugItem;
import net.mcreator.coffeecraft.item.EndCoffeeItem;
import net.mcreator.coffeecraft.item.CroissantItem;
import net.mcreator.coffeecraft.item.CoffeeSweetLungoItem;
import net.mcreator.coffeecraft.item.CoffeeSweetExpressoItem;
import net.mcreator.coffeecraft.item.CoffeePowderItem;
import net.mcreator.coffeecraft.item.CoffeeNetherItem;
import net.mcreator.coffeecraft.item.CoffeeMochaItem;
import net.mcreator.coffeecraft.item.CoffeeIcedItem;
import net.mcreator.coffeecraft.item.CoffeeHoneyItem;
import net.mcreator.coffeecraft.item.CoffeeFluidItem;
import net.mcreator.coffeecraft.item.CoffeeEggItem;
import net.mcreator.coffeecraft.item.CoffeeCherryItem;
import net.mcreator.coffeecraft.item.CoffeeCarrotItem;
import net.mcreator.coffeecraft.item.CoffeeCappuccinoItem;
import net.mcreator.coffeecraft.item.CoffeeBeanRoastedItem;
import net.mcreator.coffeecraft.item.CoffeeBeanItem;
import net.mcreator.coffeecraft.item.BaristaSmallItem;
import net.mcreator.coffeecraft.item.BaristaItem;
import net.mcreator.coffeecraft.block.display.RoasterAnimatedDisplayItem;
import net.mcreator.coffeecraft.block.display.GrinderAnimDisplayItem;
import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoffeecraftMod.MODID);
	public static final RegistryObject<Item> COFFEE_CHERRY = REGISTRY.register("coffee_cherry", () -> new CoffeeCherryItem());
	public static final RegistryObject<Item> COFFEE_BEAN = REGISTRY.register("coffee_bean", () -> new CoffeeBeanItem());
	public static final RegistryObject<Item> COFFEE_BEAN_ROASTED = REGISTRY.register("coffee_bean_roasted", () -> new CoffeeBeanRoastedItem());
	public static final RegistryObject<Item> COFFEE_POWDER = REGISTRY.register("coffee_powder", () -> new CoffeePowderItem());
	public static final RegistryObject<Item> COFFEE_MAKER_BLACK_EMPTY = block(CoffeecraftModBlocks.COFFEE_MAKER_BLACK_EMPTY);
	public static final RegistryObject<Item> COFFEE_MAKER_WHITE_EMPTY = block(CoffeecraftModBlocks.COFFEE_MAKER_WHITE_EMPTY);
	public static final RegistryObject<Item> GRINDER_ANIM = REGISTRY.register(CoffeecraftModBlocks.GRINDER_ANIM.getId().getPath(), () -> new GrinderAnimDisplayItem(CoffeecraftModBlocks.GRINDER_ANIM.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROASTER_ANIMATED = REGISTRY.register(CoffeecraftModBlocks.ROASTER_ANIMATED.getId().getPath(), () -> new RoasterAnimatedDisplayItem(CoffeecraftModBlocks.ROASTER_ANIMATED.get(), new Item.Properties()));
	public static final RegistryObject<Item> SHORT_MUG = REGISTRY.register("short_mug", () -> new ShortMugItem());
	public static final RegistryObject<Item> LONG_MUG = REGISTRY.register("long_mug", () -> new LongMugItem());
	public static final RegistryObject<Item> COFFEE_SWEET_EXPRESSO = REGISTRY.register("coffee_sweet_expresso", () -> new CoffeeSweetExpressoItem());
	public static final RegistryObject<Item> COFFEE_SWEET_LUNGO = REGISTRY.register("coffee_sweet_lungo", () -> new CoffeeSweetLungoItem());
	public static final RegistryObject<Item> COFFEE_CAPPUCCINO = REGISTRY.register("coffee_cappuccino", () -> new CoffeeCappuccinoItem());
	public static final RegistryObject<Item> COFFEE_MOCHA = REGISTRY.register("coffee_mocha", () -> new CoffeeMochaItem());
	public static final RegistryObject<Item> COFFEE_EGG = REGISTRY.register("coffee_egg", () -> new CoffeeEggItem());
	public static final RegistryObject<Item> COFFEE_ICED = REGISTRY.register("coffee_iced", () -> new CoffeeIcedItem());
	public static final RegistryObject<Item> COFFEE_CARROT = REGISTRY.register("coffee_carrot", () -> new CoffeeCarrotItem());
	public static final RegistryObject<Item> COFFEE_HONEY = REGISTRY.register("coffee_honey", () -> new CoffeeHoneyItem());
	public static final RegistryObject<Item> COFFEE_NETHER = REGISTRY.register("coffee_nether", () -> new CoffeeNetherItem());
	public static final RegistryObject<Item> END_COFFEE = REGISTRY.register("end_coffee", () -> new EndCoffeeItem());
	public static final RegistryObject<Item> CROISSANT = REGISTRY.register("croissant", () -> new CroissantItem());
	public static final RegistryObject<Item> COFFEE_PANCARTE = block(CoffeecraftModBlocks.COFFEE_PANCARTE);
	public static final RegistryObject<Item> BAG_COFFEE_ROASTED = block(CoffeecraftModBlocks.BAG_COFFEE_ROASTED);
	public static final RegistryObject<Item> BAG_COFFEE_BEAN = block(CoffeecraftModBlocks.BAG_COFFEE_BEAN);
	public static final RegistryObject<Item> BAG_COFFEE_POWDER = block(CoffeecraftModBlocks.BAG_COFFEE_POWDER);
	public static final RegistryObject<Item> BARISTA_CHESTPLATE = REGISTRY.register("barista_chestplate", () -> new BaristaItem.Chestplate());
	public static final RegistryObject<Item> BARISTA_SMALL_CHESTPLATE = REGISTRY.register("barista_small_chestplate", () -> new BaristaSmallItem.Chestplate());
	public static final RegistryObject<Item> COFFEE_FLUID_BUCKET = REGISTRY.register("coffee_fluid_bucket", () -> new CoffeeFluidItem());
	public static final RegistryObject<Item> TERRACOTTA_MUG = block(CoffeecraftModBlocks.TERRACOTTA_MUG);
	public static final RegistryObject<Item> WHITE_MUG = block(CoffeecraftModBlocks.WHITE_MUG);
	public static final RegistryObject<Item> BLACK_MUG = block(CoffeecraftModBlocks.BLACK_MUG);
	public static final RegistryObject<Item> BLUE_MUG = block(CoffeecraftModBlocks.BLUE_MUG);
	public static final RegistryObject<Item> BROWN_MUG = block(CoffeecraftModBlocks.BROWN_MUG);
	public static final RegistryObject<Item> CYAN_MUG = block(CoffeecraftModBlocks.CYAN_MUG);
	public static final RegistryObject<Item> GRAY_MUG = block(CoffeecraftModBlocks.GRAY_MUG);
	public static final RegistryObject<Item> GREEN_MUG = block(CoffeecraftModBlocks.GREEN_MUG);
	public static final RegistryObject<Item> LIGHT_BLUE_MUG = block(CoffeecraftModBlocks.LIGHT_BLUE_MUG);
	public static final RegistryObject<Item> LIGHT_GRAY_MUG = block(CoffeecraftModBlocks.LIGHT_GRAY_MUG);
	public static final RegistryObject<Item> LIME_MUG = block(CoffeecraftModBlocks.LIME_MUG);
	public static final RegistryObject<Item> MAGENTA_MUG = block(CoffeecraftModBlocks.MAGENTA_MUG);
	public static final RegistryObject<Item> ORANGE_MUG = block(CoffeecraftModBlocks.ORANGE_MUG);
	public static final RegistryObject<Item> PINK_MUG = block(CoffeecraftModBlocks.PINK_MUG);
	public static final RegistryObject<Item> PURPLE_MUG = block(CoffeecraftModBlocks.PURPLE_MUG);
	public static final RegistryObject<Item> RED_MUG = block(CoffeecraftModBlocks.RED_MUG);
	public static final RegistryObject<Item> YELLOW_MUG = block(CoffeecraftModBlocks.YELLOW_MUG);
	public static final RegistryObject<Item> COFFEE_BOX_BLOC = block(CoffeecraftModBlocks.COFFEE_BOX_BLOC);
	public static final RegistryObject<Item> GRINDER = block(CoffeecraftModBlocks.GRINDER);
	public static final RegistryObject<Item> ROASTER = block(CoffeecraftModBlocks.ROASTER);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_0 = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_0);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_1 = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_1);
	public static final RegistryObject<Item> TERRACOTTA_MUG_2 = block(CoffeecraftModBlocks.TERRACOTTA_MUG_2);
	public static final RegistryObject<Item> TERRACOTTA_MUG_3 = block(CoffeecraftModBlocks.TERRACOTTA_MUG_3);
	public static final RegistryObject<Item> WHITE_MUG_2 = block(CoffeecraftModBlocks.WHITE_MUG_2);
	public static final RegistryObject<Item> WHITE_MUG_3 = block(CoffeecraftModBlocks.WHITE_MUG_3);
	public static final RegistryObject<Item> BLACK_MUG_2 = block(CoffeecraftModBlocks.BLACK_MUG_2);
	public static final RegistryObject<Item> BLACK_MUG_3 = block(CoffeecraftModBlocks.BLACK_MUG_3);
	public static final RegistryObject<Item> BLUE_MUG_2 = block(CoffeecraftModBlocks.BLUE_MUG_2);
	public static final RegistryObject<Item> BLUE_MUG_3 = block(CoffeecraftModBlocks.BLUE_MUG_3);
	public static final RegistryObject<Item> BROWN_MUG_2 = block(CoffeecraftModBlocks.BROWN_MUG_2);
	public static final RegistryObject<Item> BROWN_MUG_3 = block(CoffeecraftModBlocks.BROWN_MUG_3);
	public static final RegistryObject<Item> CYAN_MUG_2 = block(CoffeecraftModBlocks.CYAN_MUG_2);
	public static final RegistryObject<Item> CYAN_MUG_3 = block(CoffeecraftModBlocks.CYAN_MUG_3);
	public static final RegistryObject<Item> GRAY_MUG_2 = block(CoffeecraftModBlocks.GRAY_MUG_2);
	public static final RegistryObject<Item> GRAY_MUG_3 = block(CoffeecraftModBlocks.GRAY_MUG_3);
	public static final RegistryObject<Item> GREEN_MUG_2 = block(CoffeecraftModBlocks.GREEN_MUG_2);
	public static final RegistryObject<Item> GREEN_MUG_3 = block(CoffeecraftModBlocks.GREEN_MUG_3);
	public static final RegistryObject<Item> LIGHT_BLUE_MUG_2 = block(CoffeecraftModBlocks.LIGHT_BLUE_MUG_2);
	public static final RegistryObject<Item> LIGHT_BLUE_MUG_3 = block(CoffeecraftModBlocks.LIGHT_BLUE_MUG_3);
	public static final RegistryObject<Item> LIGHT_GRAY_MUG_2 = block(CoffeecraftModBlocks.LIGHT_GRAY_MUG_2);
	public static final RegistryObject<Item> LIGHT_GRAY_MUG_3 = block(CoffeecraftModBlocks.LIGHT_GRAY_MUG_3);
	public static final RegistryObject<Item> LIME_MUG_2 = block(CoffeecraftModBlocks.LIME_MUG_2);
	public static final RegistryObject<Item> LIME_MUG_3 = block(CoffeecraftModBlocks.LIME_MUG_3);
	public static final RegistryObject<Item> MAGENTA_MUG_2 = block(CoffeecraftModBlocks.MAGENTA_MUG_2);
	public static final RegistryObject<Item> MAGENTA_MUG_3 = block(CoffeecraftModBlocks.MAGENTA_MUG_3);
	public static final RegistryObject<Item> ORANGE_MUG_2 = block(CoffeecraftModBlocks.ORANGE_MUG_2);
	public static final RegistryObject<Item> ORANGE_MUG_3 = block(CoffeecraftModBlocks.ORANGE_MUG_3);
	public static final RegistryObject<Item> PINK_MUG_2 = block(CoffeecraftModBlocks.PINK_MUG_2);
	public static final RegistryObject<Item> PINK_MUG_3 = block(CoffeecraftModBlocks.PINK_MUG_3);
	public static final RegistryObject<Item> PURPLE_MUG_2 = block(CoffeecraftModBlocks.PURPLE_MUG_2);
	public static final RegistryObject<Item> PURPLE_MUG_3 = block(CoffeecraftModBlocks.PURPLE_MUG_3);
	public static final RegistryObject<Item> RED_MUG_2 = block(CoffeecraftModBlocks.RED_MUG_2);
	public static final RegistryObject<Item> RED_MUG_3 = block(CoffeecraftModBlocks.RED_MUG_3);
	public static final RegistryObject<Item> YELLOW_MUG_2 = block(CoffeecraftModBlocks.YELLOW_MUG_2);
	public static final RegistryObject<Item> YELLOW_MUG_3 = block(CoffeecraftModBlocks.YELLOW_MUG_3);
	public static final RegistryObject<Item> COFFEE_MAKER_BLACK = block(CoffeecraftModBlocks.COFFEE_MAKER_BLACK);
	public static final RegistryObject<Item> COFFEE_MAKER_WHITE = block(CoffeecraftModBlocks.COFFEE_MAKER_WHITE);
	public static final RegistryObject<Item> COFFE_PLANT_STAGE_3_BOTTOM = block(CoffeecraftModBlocks.COFFE_PLANT_STAGE_3_BOTTOM);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_3_TOP = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_3_TOP);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_4_BOTTOM = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_BOTTOM);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_4_TOP = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_TOP);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_5_BOTTOM = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_5_BOTTOM);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_5_TOP = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_5_TOP);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_6_BOTTOM = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_6_BOTTOM);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_6_TOP = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_6_TOP);
	public static final RegistryObject<Item> COFFEE_PLANT = doubleBlock(CoffeecraftModBlocks.COFFEE_PLANT);
	public static final RegistryObject<Item> COFFEE_PLANT_STAGE_2 = block(CoffeecraftModBlocks.COFFEE_PLANT_STAGE_2);
	public static final RegistryObject<Item> COFFEE_CARROT_BLOC = block(CoffeecraftModBlocks.COFFEE_CARROT_BLOC);
	public static final RegistryObject<Item> EXPRESSO_BLOC = block(CoffeecraftModBlocks.EXPRESSO_BLOC);
	public static final RegistryObject<Item> LUNGO_BLOC = block(CoffeecraftModBlocks.LUNGO_BLOC);
	public static final RegistryObject<Item> END_COFFEE_BLOC = block(CoffeecraftModBlocks.END_COFFEE_BLOC);
	public static final RegistryObject<Item> COFFEE_EGG_BLOC = block(CoffeecraftModBlocks.COFFEE_EGG_BLOC);
	public static final RegistryObject<Item> COFFEE_ICED_BLOC = block(CoffeecraftModBlocks.COFFEE_ICED_BLOC);
	public static final RegistryObject<Item> COFFEE_NETHER_BLOC = block(CoffeecraftModBlocks.COFFEE_NETHER_BLOC);
	public static final RegistryObject<Item> COFFEE_HONEY_BLOC = block(CoffeecraftModBlocks.COFFEE_HONEY_BLOC);
	public static final RegistryObject<Item> COFFEE_MOCHA_BLOC = block(CoffeecraftModBlocks.COFFEE_MOCHA_BLOC);
	public static final RegistryObject<Item> COFFEE_CAPPUCCINO_BLOC = block(CoffeecraftModBlocks.COFFEE_CAPPUCCINO_BLOC);
	public static final RegistryObject<Item> CROISSANT_BLOC = block(CoffeecraftModBlocks.CROISSANT_BLOC);
	public static final RegistryObject<Item> COFFEE_SWEET_LUNGO_BLOC = block(CoffeecraftModBlocks.COFFEE_SWEET_LUNGO_BLOC);
	public static final RegistryObject<Item> COFFEE_SWEET_EXPRESSO_BLOC = block(CoffeecraftModBlocks.COFFEE_SWEET_EXPRESSO_BLOC);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
