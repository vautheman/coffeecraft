
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.coffeecraft.block.YellowMugBlock;
import net.mcreator.coffeecraft.block.YellowMug3Block;
import net.mcreator.coffeecraft.block.YellowMug2Block;
import net.mcreator.coffeecraft.block.WhiteMugBlock;
import net.mcreator.coffeecraft.block.WhiteMug3Block;
import net.mcreator.coffeecraft.block.WhiteMug2Block;
import net.mcreator.coffeecraft.block.TerracottaMugBlock;
import net.mcreator.coffeecraft.block.TerracottaMug3Block;
import net.mcreator.coffeecraft.block.TerracottaMug2Block;
import net.mcreator.coffeecraft.block.RoasterBlock;
import net.mcreator.coffeecraft.block.RoasterAnimatedBlock;
import net.mcreator.coffeecraft.block.RedMugBlock;
import net.mcreator.coffeecraft.block.RedMug3Block;
import net.mcreator.coffeecraft.block.RedMug2Block;
import net.mcreator.coffeecraft.block.PurpleMugBlock;
import net.mcreator.coffeecraft.block.PurpleMug3Block;
import net.mcreator.coffeecraft.block.PurpleMug2Block;
import net.mcreator.coffeecraft.block.PinkMugBlock;
import net.mcreator.coffeecraft.block.PinkMug3Block;
import net.mcreator.coffeecraft.block.PinkMug2Block;
import net.mcreator.coffeecraft.block.OrangeMugBlock;
import net.mcreator.coffeecraft.block.OrangeMug3Block;
import net.mcreator.coffeecraft.block.OrangeMug2Block;
import net.mcreator.coffeecraft.block.MagentaMugBlock;
import net.mcreator.coffeecraft.block.MagentaMug3Block;
import net.mcreator.coffeecraft.block.MagentaMug2Block;
import net.mcreator.coffeecraft.block.LungoBlocBlock;
import net.mcreator.coffeecraft.block.LimeMugBlock;
import net.mcreator.coffeecraft.block.LimeMug3Block;
import net.mcreator.coffeecraft.block.LimeMug2Block;
import net.mcreator.coffeecraft.block.LightGrayMugBlock;
import net.mcreator.coffeecraft.block.LightGrayMug3Block;
import net.mcreator.coffeecraft.block.LightGrayMug2Block;
import net.mcreator.coffeecraft.block.LightBlueMugBlock;
import net.mcreator.coffeecraft.block.LightBlueMug3Block;
import net.mcreator.coffeecraft.block.LightBlueMug2Block;
import net.mcreator.coffeecraft.block.GrinderBlock;
import net.mcreator.coffeecraft.block.GrinderAnimBlock;
import net.mcreator.coffeecraft.block.GreenMugBlock;
import net.mcreator.coffeecraft.block.GreenMug3Block;
import net.mcreator.coffeecraft.block.GreenMug2Block;
import net.mcreator.coffeecraft.block.GrayMugBlock;
import net.mcreator.coffeecraft.block.GrayMug3Block;
import net.mcreator.coffeecraft.block.GrayMug2Block;
import net.mcreator.coffeecraft.block.ExpressoBlocBlock;
import net.mcreator.coffeecraft.block.EndCoffeeBlocBlock;
import net.mcreator.coffeecraft.block.CyanMugBlock;
import net.mcreator.coffeecraft.block.CyanMug3Block;
import net.mcreator.coffeecraft.block.CyanMug2Block;
import net.mcreator.coffeecraft.block.CroissantBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeSweetLungoBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeSweetExpressoBlocBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage6TopBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage6BottomBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage5TopBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage5BottomBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage4TopBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage4BottomBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage3TopBlock;
import net.mcreator.coffeecraft.block.CoffeePlantStage2Block;
import net.mcreator.coffeecraft.block.CoffeePlantStage1Block;
import net.mcreator.coffeecraft.block.CoffeePlantStage0Block;
import net.mcreator.coffeecraft.block.CoffeePlantBlock;
import net.mcreator.coffeecraft.block.CoffeePancarteBlock;
import net.mcreator.coffeecraft.block.CoffeeNetherBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeMochaBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeMakerWhiteEmptyBlock;
import net.mcreator.coffeecraft.block.CoffeeMakerWhiteBlock;
import net.mcreator.coffeecraft.block.CoffeeMakerBlackEmptyBlock;
import net.mcreator.coffeecraft.block.CoffeeMakerBlackBlock;
import net.mcreator.coffeecraft.block.CoffeeIcedBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeHoneyBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeFluidBlock;
import net.mcreator.coffeecraft.block.CoffeeEggBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeCarrotBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeCappuccinoBlocBlock;
import net.mcreator.coffeecraft.block.CoffeeBoxBlocBlock;
import net.mcreator.coffeecraft.block.CoffePlantStage3BottomBlock;
import net.mcreator.coffeecraft.block.BrownMugBlock;
import net.mcreator.coffeecraft.block.BrownMug3Block;
import net.mcreator.coffeecraft.block.BrownMug2Block;
import net.mcreator.coffeecraft.block.BlueMugBlock;
import net.mcreator.coffeecraft.block.BlueMug3Block;
import net.mcreator.coffeecraft.block.BlueMug2Block;
import net.mcreator.coffeecraft.block.BlackMugBlock;
import net.mcreator.coffeecraft.block.BlackMug3Block;
import net.mcreator.coffeecraft.block.BlackMug2Block;
import net.mcreator.coffeecraft.block.BagCoffeeRoastedBlock;
import net.mcreator.coffeecraft.block.BagCoffeePowderBlock;
import net.mcreator.coffeecraft.block.BagCoffeeBeanBlock;
import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoffeecraftMod.MODID);
	public static final RegistryObject<Block> COFFEE_MAKER_BLACK_EMPTY = REGISTRY.register("coffee_maker_black_empty", () -> new CoffeeMakerBlackEmptyBlock());
	public static final RegistryObject<Block> COFFEE_MAKER_WHITE_EMPTY = REGISTRY.register("coffee_maker_white_empty", () -> new CoffeeMakerWhiteEmptyBlock());
	public static final RegistryObject<Block> GRINDER_ANIM = REGISTRY.register("grinder_anim", () -> new GrinderAnimBlock());
	public static final RegistryObject<Block> ROASTER_ANIMATED = REGISTRY.register("roaster_animated", () -> new RoasterAnimatedBlock());
	public static final RegistryObject<Block> COFFEE_PANCARTE = REGISTRY.register("coffee_pancarte", () -> new CoffeePancarteBlock());
	public static final RegistryObject<Block> BAG_COFFEE_ROASTED = REGISTRY.register("bag_coffee_roasted", () -> new BagCoffeeRoastedBlock());
	public static final RegistryObject<Block> BAG_COFFEE_BEAN = REGISTRY.register("bag_coffee_bean", () -> new BagCoffeeBeanBlock());
	public static final RegistryObject<Block> BAG_COFFEE_POWDER = REGISTRY.register("bag_coffee_powder", () -> new BagCoffeePowderBlock());
	public static final RegistryObject<Block> COFFEE_FLUID = REGISTRY.register("coffee_fluid", () -> new CoffeeFluidBlock());
	public static final RegistryObject<Block> TERRACOTTA_MUG = REGISTRY.register("terracotta_mug", () -> new TerracottaMugBlock());
	public static final RegistryObject<Block> WHITE_MUG = REGISTRY.register("white_mug", () -> new WhiteMugBlock());
	public static final RegistryObject<Block> BLACK_MUG = REGISTRY.register("black_mug", () -> new BlackMugBlock());
	public static final RegistryObject<Block> BLUE_MUG = REGISTRY.register("blue_mug", () -> new BlueMugBlock());
	public static final RegistryObject<Block> BROWN_MUG = REGISTRY.register("brown_mug", () -> new BrownMugBlock());
	public static final RegistryObject<Block> CYAN_MUG = REGISTRY.register("cyan_mug", () -> new CyanMugBlock());
	public static final RegistryObject<Block> GRAY_MUG = REGISTRY.register("gray_mug", () -> new GrayMugBlock());
	public static final RegistryObject<Block> GREEN_MUG = REGISTRY.register("green_mug", () -> new GreenMugBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_MUG = REGISTRY.register("light_blue_mug", () -> new LightBlueMugBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_MUG = REGISTRY.register("light_gray_mug", () -> new LightGrayMugBlock());
	public static final RegistryObject<Block> LIME_MUG = REGISTRY.register("lime_mug", () -> new LimeMugBlock());
	public static final RegistryObject<Block> MAGENTA_MUG = REGISTRY.register("magenta_mug", () -> new MagentaMugBlock());
	public static final RegistryObject<Block> ORANGE_MUG = REGISTRY.register("orange_mug", () -> new OrangeMugBlock());
	public static final RegistryObject<Block> PINK_MUG = REGISTRY.register("pink_mug", () -> new PinkMugBlock());
	public static final RegistryObject<Block> PURPLE_MUG = REGISTRY.register("purple_mug", () -> new PurpleMugBlock());
	public static final RegistryObject<Block> RED_MUG = REGISTRY.register("red_mug", () -> new RedMugBlock());
	public static final RegistryObject<Block> YELLOW_MUG = REGISTRY.register("yellow_mug", () -> new YellowMugBlock());
	public static final RegistryObject<Block> COFFEE_BOX_BLOC = REGISTRY.register("coffee_box_bloc", () -> new CoffeeBoxBlocBlock());
	public static final RegistryObject<Block> GRINDER = REGISTRY.register("grinder", () -> new GrinderBlock());
	public static final RegistryObject<Block> ROASTER = REGISTRY.register("roaster", () -> new RoasterBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_0 = REGISTRY.register("coffee_plant_stage_0", () -> new CoffeePlantStage0Block());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_1 = REGISTRY.register("coffee_plant_stage_1", () -> new CoffeePlantStage1Block());
	public static final RegistryObject<Block> TERRACOTTA_MUG_2 = REGISTRY.register("terracotta_mug_2", () -> new TerracottaMug2Block());
	public static final RegistryObject<Block> TERRACOTTA_MUG_3 = REGISTRY.register("terracotta_mug_3", () -> new TerracottaMug3Block());
	public static final RegistryObject<Block> WHITE_MUG_2 = REGISTRY.register("white_mug_2", () -> new WhiteMug2Block());
	public static final RegistryObject<Block> WHITE_MUG_3 = REGISTRY.register("white_mug_3", () -> new WhiteMug3Block());
	public static final RegistryObject<Block> BLACK_MUG_2 = REGISTRY.register("black_mug_2", () -> new BlackMug2Block());
	public static final RegistryObject<Block> BLACK_MUG_3 = REGISTRY.register("black_mug_3", () -> new BlackMug3Block());
	public static final RegistryObject<Block> BLUE_MUG_2 = REGISTRY.register("blue_mug_2", () -> new BlueMug2Block());
	public static final RegistryObject<Block> BLUE_MUG_3 = REGISTRY.register("blue_mug_3", () -> new BlueMug3Block());
	public static final RegistryObject<Block> BROWN_MUG_2 = REGISTRY.register("brown_mug_2", () -> new BrownMug2Block());
	public static final RegistryObject<Block> BROWN_MUG_3 = REGISTRY.register("brown_mug_3", () -> new BrownMug3Block());
	public static final RegistryObject<Block> CYAN_MUG_2 = REGISTRY.register("cyan_mug_2", () -> new CyanMug2Block());
	public static final RegistryObject<Block> CYAN_MUG_3 = REGISTRY.register("cyan_mug_3", () -> new CyanMug3Block());
	public static final RegistryObject<Block> GRAY_MUG_2 = REGISTRY.register("gray_mug_2", () -> new GrayMug2Block());
	public static final RegistryObject<Block> GRAY_MUG_3 = REGISTRY.register("gray_mug_3", () -> new GrayMug3Block());
	public static final RegistryObject<Block> GREEN_MUG_2 = REGISTRY.register("green_mug_2", () -> new GreenMug2Block());
	public static final RegistryObject<Block> GREEN_MUG_3 = REGISTRY.register("green_mug_3", () -> new GreenMug3Block());
	public static final RegistryObject<Block> LIGHT_BLUE_MUG_2 = REGISTRY.register("light_blue_mug_2", () -> new LightBlueMug2Block());
	public static final RegistryObject<Block> LIGHT_BLUE_MUG_3 = REGISTRY.register("light_blue_mug_3", () -> new LightBlueMug3Block());
	public static final RegistryObject<Block> LIGHT_GRAY_MUG_2 = REGISTRY.register("light_gray_mug_2", () -> new LightGrayMug2Block());
	public static final RegistryObject<Block> LIGHT_GRAY_MUG_3 = REGISTRY.register("light_gray_mug_3", () -> new LightGrayMug3Block());
	public static final RegistryObject<Block> LIME_MUG_2 = REGISTRY.register("lime_mug_2", () -> new LimeMug2Block());
	public static final RegistryObject<Block> LIME_MUG_3 = REGISTRY.register("lime_mug_3", () -> new LimeMug3Block());
	public static final RegistryObject<Block> MAGENTA_MUG_2 = REGISTRY.register("magenta_mug_2", () -> new MagentaMug2Block());
	public static final RegistryObject<Block> MAGENTA_MUG_3 = REGISTRY.register("magenta_mug_3", () -> new MagentaMug3Block());
	public static final RegistryObject<Block> ORANGE_MUG_2 = REGISTRY.register("orange_mug_2", () -> new OrangeMug2Block());
	public static final RegistryObject<Block> ORANGE_MUG_3 = REGISTRY.register("orange_mug_3", () -> new OrangeMug3Block());
	public static final RegistryObject<Block> PINK_MUG_2 = REGISTRY.register("pink_mug_2", () -> new PinkMug2Block());
	public static final RegistryObject<Block> PINK_MUG_3 = REGISTRY.register("pink_mug_3", () -> new PinkMug3Block());
	public static final RegistryObject<Block> PURPLE_MUG_2 = REGISTRY.register("purple_mug_2", () -> new PurpleMug2Block());
	public static final RegistryObject<Block> PURPLE_MUG_3 = REGISTRY.register("purple_mug_3", () -> new PurpleMug3Block());
	public static final RegistryObject<Block> RED_MUG_2 = REGISTRY.register("red_mug_2", () -> new RedMug2Block());
	public static final RegistryObject<Block> RED_MUG_3 = REGISTRY.register("red_mug_3", () -> new RedMug3Block());
	public static final RegistryObject<Block> YELLOW_MUG_2 = REGISTRY.register("yellow_mug_2", () -> new YellowMug2Block());
	public static final RegistryObject<Block> YELLOW_MUG_3 = REGISTRY.register("yellow_mug_3", () -> new YellowMug3Block());
	public static final RegistryObject<Block> COFFEE_MAKER_BLACK = REGISTRY.register("coffee_maker_black", () -> new CoffeeMakerBlackBlock());
	public static final RegistryObject<Block> COFFEE_MAKER_WHITE = REGISTRY.register("coffee_maker_white", () -> new CoffeeMakerWhiteBlock());
	public static final RegistryObject<Block> COFFE_PLANT_STAGE_3_BOTTOM = REGISTRY.register("coffe_plant_stage_3_bottom", () -> new CoffePlantStage3BottomBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_3_TOP = REGISTRY.register("coffee_plant_stage_3_top", () -> new CoffeePlantStage3TopBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_4_BOTTOM = REGISTRY.register("coffee_plant_stage_4_bottom", () -> new CoffeePlantStage4BottomBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_4_TOP = REGISTRY.register("coffee_plant_stage_4_top", () -> new CoffeePlantStage4TopBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_5_BOTTOM = REGISTRY.register("coffee_plant_stage_5_bottom", () -> new CoffeePlantStage5BottomBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_5_TOP = REGISTRY.register("coffee_plant_stage_5_top", () -> new CoffeePlantStage5TopBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_6_BOTTOM = REGISTRY.register("coffee_plant_stage_6_bottom", () -> new CoffeePlantStage6BottomBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_6_TOP = REGISTRY.register("coffee_plant_stage_6_top", () -> new CoffeePlantStage6TopBlock());
	public static final RegistryObject<Block> COFFEE_PLANT = REGISTRY.register("coffee_plant", () -> new CoffeePlantBlock());
	public static final RegistryObject<Block> COFFEE_PLANT_STAGE_2 = REGISTRY.register("coffee_plant_stage_2", () -> new CoffeePlantStage2Block());
	public static final RegistryObject<Block> COFFEE_CARROT_BLOC = REGISTRY.register("coffee_carrot_bloc", () -> new CoffeeCarrotBlocBlock());
	public static final RegistryObject<Block> EXPRESSO_BLOC = REGISTRY.register("expresso_bloc", () -> new ExpressoBlocBlock());
	public static final RegistryObject<Block> LUNGO_BLOC = REGISTRY.register("lungo_bloc", () -> new LungoBlocBlock());
	public static final RegistryObject<Block> END_COFFEE_BLOC = REGISTRY.register("end_coffee_bloc", () -> new EndCoffeeBlocBlock());
	public static final RegistryObject<Block> COFFEE_EGG_BLOC = REGISTRY.register("coffee_egg_bloc", () -> new CoffeeEggBlocBlock());
	public static final RegistryObject<Block> COFFEE_ICED_BLOC = REGISTRY.register("coffee_iced_bloc", () -> new CoffeeIcedBlocBlock());
	public static final RegistryObject<Block> COFFEE_NETHER_BLOC = REGISTRY.register("coffee_nether_bloc", () -> new CoffeeNetherBlocBlock());
	public static final RegistryObject<Block> COFFEE_HONEY_BLOC = REGISTRY.register("coffee_honey_bloc", () -> new CoffeeHoneyBlocBlock());
	public static final RegistryObject<Block> COFFEE_MOCHA_BLOC = REGISTRY.register("coffee_mocha_bloc", () -> new CoffeeMochaBlocBlock());
	public static final RegistryObject<Block> COFFEE_CAPPUCCINO_BLOC = REGISTRY.register("coffee_cappuccino_bloc", () -> new CoffeeCappuccinoBlocBlock());
	public static final RegistryObject<Block> CROISSANT_BLOC = REGISTRY.register("croissant_bloc", () -> new CroissantBlocBlock());
	public static final RegistryObject<Block> COFFEE_SWEET_LUNGO_BLOC = REGISTRY.register("coffee_sweet_lungo_bloc", () -> new CoffeeSweetLungoBlocBlock());
	public static final RegistryObject<Block> COFFEE_SWEET_EXPRESSO_BLOC = REGISTRY.register("coffee_sweet_expresso_bloc", () -> new CoffeeSweetExpressoBlocBlock());
}
