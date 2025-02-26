package baguchan.earthmobsmod.registry;

import baguchan.earthmobsmod.EarthMobsMod;
import baguchan.earthmobsmod.item.BoneShardItem;
import baguchan.earthmobsmod.item.FixedInstrumentItem;
import baguchan.earthmobsmod.item.SmellyEggItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = EarthMobsMod.MODID)
public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EarthMobsMod.MODID);


	public static final RegistryObject<Item> SMELLY_EGG = ITEMS.register("smelly_egg", () -> new SmellyEggItem((new Item.Properties())));
	public static final RegistryObject<Item> BONE_SHARD = ITEMS.register("bone_shard", () -> new BoneShardItem((new Item.Properties())));
	public static final RegistryObject<Item> FANCY_FEATHER = ITEMS.register("fancy_feather", () -> new Item((new Item.Properties())));

	public static final RegistryObject<Item> BONE_SPIDER_EYE = ITEMS.register("bone_spider_eye", () -> new Item((new Item.Properties())));
	public static final RegistryObject<Item> HORN = ITEMS.register("horn", () -> new Item((new Item.Properties())));
	public static final RegistryObject<Item> HORN_FLUTE = ITEMS.register("horn_flute", () -> new FixedInstrumentItem((new Item.Properties()), InstrumentTags.GOAT_HORNS));

	public static final RegistryObject<Item> HYPER_RABBIT_FOOT = ITEMS.register("hyper_rabbit_foot", () -> new Item((new Item.Properties())));
	public static final RegistryObject<Item> MUD_BUCKET = ITEMS.register("mud_bucket", () -> new BucketItem(ModFluids.MUD, (new Item.Properties()).stacksTo(1).craftRemainder(Items.BUCKET)));
	public static final RegistryObject<Item> TROPICAL_SLIME_BUCKET = ITEMS.register("tropical_slime_bucket", () -> new MobBucketItem(ModEntities.TROPICAL_SLIME, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, (new Item.Properties()).stacksTo(1).craftRemainder(Items.BUCKET)));


	public static final RegistryObject<Item> CLUCK_SHROOM_SPAWNEGG = ITEMS.register("cluck_shroom_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.CLUCK_SHROOM, 0xB52C17, 0xDC883B, (new Item.Properties())));
	public static final RegistryObject<Item> FANCY_CHICKEN_SPAWNEGG = ITEMS.register("fancy_chicken_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.FANCY_CHICKEN, 0xF4A213, 0x202F22, (new Item.Properties())));
	public static final RegistryObject<Item> WOOLY_COW_SPAWNEGG = ITEMS.register("wooly_cow_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.WOOLY_COW, 0xDB8948, 0xFFDBB6, (new Item.Properties())));
	public static final RegistryObject<Item> UMBRA_COW_SPAWNEGG = ITEMS.register("umbra_cow_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.UMBRA_COW, 0x403E57, 0x0A0B1D, (new Item.Properties())));
	public static final RegistryObject<Item> HORNED_SHEEP_SPAWNEGG = ITEMS.register("horned_sheep_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.HORNED_SHEEP, 15198183, 16758197, (new Item.Properties())));
	public static final RegistryObject<Item> HYPER_RABBIT_SPAWNEGG = ITEMS.register("hyper_rabbit_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.HYPER_RABBIT, 0xDA784A, 0xF4BF83, (new Item.Properties())));
	public static final RegistryObject<Item> MOOBLOOM_SPAWNEGG = ITEMS.register("moobloom_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.MOOBLOOM, 0xFDCA00, 0xF7EDC1, (new Item.Properties())));
	public static final RegistryObject<Item> MOOLIP_SPAWNEGG = ITEMS.register("moolip_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.MOOLIP, 0xD882B0, 0xF1DFE8, (new Item.Properties())));
	public static final RegistryObject<Item> JUMBO_RABBIT_SPAWNEGG = ITEMS.register("jumbo_rabbit_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.JUMBO_RABBIT, 0x9E5C48, 0xE5B2A3, (new Item.Properties())));
	public static final RegistryObject<Item> ZOMBIFILED_PIG_SPAWNEGG = ITEMS.register("zombified_pig_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.ZOMBIFIED_PIG, 15373203, 5009705, (new Item.Properties())));
	public static final RegistryObject<Item> DUCK_SPAWNEGG = ITEMS.register("duck_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.DUCK, 0x64413A, 0x17951E, (new Item.Properties())));


	public static final RegistryObject<Item> BONE_SPIDER_SPAWNEGG = ITEMS.register("bone_spider_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.BONE_SPIDER, 0x461C2E, 0x6130B7, (new Item.Properties())));
	public static final RegistryObject<Item> STRAY_BONE_SPIDER_SPAWNEGG = ITEMS.register("stray_bone_spider_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.STRAY_BONE_SPIDER, 0x20112F, 0x30B6B2, (new Item.Properties())));
	public static final RegistryObject<Item> VILER_WITCH_SPAWNEGG = ITEMS.register("viler_witch_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.VILER_WITCH, 0x111322, 0x37464D, (new Item.Properties())));
	public static final RegistryObject<Item> BOULDERING_ZOMBIE_SPAWNEGG = ITEMS.register("bouldering_zombie_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.BOULDERING_ZOMBIE, 0x384242, 0x52261A, (new Item.Properties())));
	public static final RegistryObject<Item> LOBBER_ZOMBIE_SPAWNEGG = ITEMS.register("lobber_zombie_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.LOBBER_ZOMBIE, 0x899274, 0x436858, (new Item.Properties())));
	public static final RegistryObject<Item> BOULDERING_DROWNED_SPAWNEGG = ITEMS.register("bouldering_drowned_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.BOULDERING_DROWNED, 0x56847E, 0x52261A, (new Item.Properties())));
	public static final RegistryObject<Item> LOBBER_DROWNED_SPAWNEGG = ITEMS.register("lobber_drowned_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.LOBBER_DROWNED, 0x739274, 0x3E5F51, (new Item.Properties())));
	public static final RegistryObject<Item> TROPICAL_SLIME_SPAWNEGG = ITEMS.register("tropical_slime_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.TROPICAL_SLIME, 0x5B83AD, 0x90B1D3, (new Item.Properties())));
	public static final RegistryObject<Item> SKELETON_WOLF_SPAWNEGG = ITEMS.register("skeleton_wolf_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.SKELETON_WOLF, 12698049, 4802889, (new Item.Properties())));
	public static final RegistryObject<Item> WITHER_SKELETON_WOLF_SPAWNEGG = ITEMS.register("wither_skeleton_wolf_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.WITHER_SKELETON_WOLF, 1315860, 4672845, (new Item.Properties())));
	public static final RegistryObject<Item> BABY_GHAST_SPAWNEGG = ITEMS.register("baby_ghast_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.BABY_GHAST, 0xFFFFFF, 0xFF9393, (new Item.Properties())));

	@SubscribeEvent
	public static void registerCreativeTabsItem(CreativeModeTabEvent.BuildContents event) {
		if (event.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			event.accept(CLUCK_SHROOM_SPAWNEGG);
			event.accept(FANCY_CHICKEN_SPAWNEGG);
			event.accept(WOOLY_COW_SPAWNEGG);
			event.accept(UMBRA_COW_SPAWNEGG);
			event.accept(HORNED_SHEEP_SPAWNEGG);
			event.accept(HYPER_RABBIT_SPAWNEGG);
			event.accept(MOOBLOOM_SPAWNEGG);
			event.accept(MOOLIP_SPAWNEGG);
			event.accept(JUMBO_RABBIT_SPAWNEGG);
			event.accept(ZOMBIFILED_PIG_SPAWNEGG);
			event.accept(DUCK_SPAWNEGG);

			event.accept(BONE_SPIDER_SPAWNEGG);
			event.accept(STRAY_BONE_SPIDER_SPAWNEGG);
			event.accept(BABY_GHAST_SPAWNEGG);
			event.accept(BOULDERING_ZOMBIE_SPAWNEGG);
			event.accept(BOULDERING_DROWNED_SPAWNEGG);
			event.accept(LOBBER_ZOMBIE_SPAWNEGG);
			event.accept(LOBBER_DROWNED_SPAWNEGG);
			event.accept(TROPICAL_SLIME_SPAWNEGG);
			event.accept(SKELETON_WOLF_SPAWNEGG);
			event.accept(VILER_WITCH_SPAWNEGG);
			event.accept(WITHER_SKELETON_WOLF_SPAWNEGG);
		}
		if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
			event.accept(SMELLY_EGG);
			event.accept(BONE_SHARD);
			event.accept(FANCY_FEATHER);
			event.accept(BONE_SPIDER_EYE);
			event.accept(HORN);
			event.accept(HYPER_RABBIT_FOOT);

		}

		if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			event.accept(MUD_BUCKET);
			event.accept(TROPICAL_SLIME_BUCKET);
		}
		if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			event.accept(ModBlocks.CARVED_MELON);
			event.accept(ModBlocks.CARVED_MELON_SHOOT);
			event.accept(ModBlocks.BUTTERCUP);
			event.accept(ModBlocks.PINK_DAISY);
		}
	}
}