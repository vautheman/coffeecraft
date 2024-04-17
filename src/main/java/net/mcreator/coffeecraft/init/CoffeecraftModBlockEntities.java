
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.coffeecraft.block.entity.RoasterBlockEntity;
import net.mcreator.coffeecraft.block.entity.RoasterAnimatedTileEntity;
import net.mcreator.coffeecraft.block.entity.GrinderBlockEntity;
import net.mcreator.coffeecraft.block.entity.GrinderAnimTileEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage6TopBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage6BottomBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage5TopBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage5BottomBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage4TopBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage4BottomBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage3TopBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage2BlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage1BlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeePlantStage0BlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeeMakerWhiteEmptyBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeeMakerWhiteBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeeMakerBlackEmptyBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeeMakerBlackBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffeeBoxBlocBlockEntity;
import net.mcreator.coffeecraft.block.entity.CoffePlantStage3BottomBlockEntity;
import net.mcreator.coffeecraft.CoffeecraftMod;

public class CoffeecraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CoffeecraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_MAKER_BLACK_EMPTY = register("coffee_maker_black_empty", CoffeecraftModBlocks.COFFEE_MAKER_BLACK_EMPTY, CoffeeMakerBlackEmptyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_MAKER_WHITE_EMPTY = register("coffee_maker_white_empty", CoffeecraftModBlocks.COFFEE_MAKER_WHITE_EMPTY, CoffeeMakerWhiteEmptyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<GrinderAnimTileEntity>> GRINDER_ANIM = REGISTRY.register("grinder_anim", () -> BlockEntityType.Builder.of(GrinderAnimTileEntity::new, CoffeecraftModBlocks.GRINDER_ANIM.get()).build(null));
	public static final RegistryObject<BlockEntityType<RoasterAnimatedTileEntity>> ROASTER_ANIMATED = REGISTRY.register("roaster_animated",
			() -> BlockEntityType.Builder.of(RoasterAnimatedTileEntity::new, CoffeecraftModBlocks.ROASTER_ANIMATED.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> COFFEE_BOX_BLOC = register("coffee_box_bloc", CoffeecraftModBlocks.COFFEE_BOX_BLOC, CoffeeBoxBlocBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRINDER = register("grinder", CoffeecraftModBlocks.GRINDER, GrinderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROASTER = register("roaster", CoffeecraftModBlocks.ROASTER, RoasterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_0 = register("coffee_plant_stage_0", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_0, CoffeePlantStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_1 = register("coffee_plant_stage_1", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_1, CoffeePlantStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_MAKER_BLACK = register("coffee_maker_black", CoffeecraftModBlocks.COFFEE_MAKER_BLACK, CoffeeMakerBlackBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_MAKER_WHITE = register("coffee_maker_white", CoffeecraftModBlocks.COFFEE_MAKER_WHITE, CoffeeMakerWhiteBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFE_PLANT_STAGE_3_BOTTOM = register("coffe_plant_stage_3_bottom", CoffeecraftModBlocks.COFFE_PLANT_STAGE_3_BOTTOM, CoffePlantStage3BottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_3_TOP = register("coffee_plant_stage_3_top", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_3_TOP, CoffeePlantStage3TopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_4_BOTTOM = register("coffee_plant_stage_4_bottom", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_BOTTOM, CoffeePlantStage4BottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_4_TOP = register("coffee_plant_stage_4_top", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_4_TOP, CoffeePlantStage4TopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_5_BOTTOM = register("coffee_plant_stage_5_bottom", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_5_BOTTOM, CoffeePlantStage5BottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_5_TOP = register("coffee_plant_stage_5_top", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_5_TOP, CoffeePlantStage5TopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_6_BOTTOM = register("coffee_plant_stage_6_bottom", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_6_BOTTOM, CoffeePlantStage6BottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_6_TOP = register("coffee_plant_stage_6_top", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_6_TOP, CoffeePlantStage6TopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PLANT_STAGE_2 = register("coffee_plant_stage_2", CoffeecraftModBlocks.COFFEE_PLANT_STAGE_2, CoffeePlantStage2BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
