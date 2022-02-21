package com.lothrazar.absentbydesign.registry;

import com.lothrazar.absentbydesign.ModAbsentBD;
import com.lothrazar.absentbydesign.block.BlockAbsentFence;
import com.lothrazar.absentbydesign.block.BlockAbsentGate;
import com.lothrazar.absentbydesign.block.BlockAbsentSlab;
import com.lothrazar.absentbydesign.block.BlockAbsentStair;
import com.lothrazar.absentbydesign.block.BlockAbsentWall;
import com.lothrazar.absentbydesign.block.DoorAbsentBlock;
import com.lothrazar.absentbydesign.block.IBlockAbsent;
import com.lothrazar.absentbydesign.block.TrapDoorAbsent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbsentRegistry {

  private static final List<Block> BLOCKLIST = new ArrayList<>();
  private static final String ID = ModAbsentBD.MODID + ":";
  @ObjectHolder(ID + "wall_glass_white")
  public static BlockAbsentWall wall_glass_white;
  @ObjectHolder(ID + "wall_glass_orange")
  public static BlockAbsentWall wall_glass_orange;
  @ObjectHolder(ID + "wall_glass_magenta")
  public static BlockAbsentWall wall_glass_magenta;
  @ObjectHolder(ID + "wall_glass_purple")
  public static BlockAbsentWall wall_glass_purple;
  @ObjectHolder(ID + "wall_glass_blue")
  public static BlockAbsentWall wall_glass_blue;
  @ObjectHolder(ID + "wall_glass_brown")
  public static BlockAbsentWall wall_glass_brown;
  @ObjectHolder(ID + "wall_glass_black")
  public static BlockAbsentWall wall_glass_black;
  @ObjectHolder(ID + "wall_glass_cyan")
  public static BlockAbsentWall wall_glass_cyan;
  @ObjectHolder(ID + "wall_glass_light_gray")
  public static BlockAbsentWall wall_glass_light_gray;
  @ObjectHolder(ID + "wall_glass_gray")
  public static BlockAbsentWall wall_glass_gray;
  @ObjectHolder(ID + "wall_glass_pink")
  public static BlockAbsentWall wall_glass_pink;
  @ObjectHolder(ID + "wall_glass_lime")
  public static BlockAbsentWall wall_glass_lime;
  @ObjectHolder(ID + "wall_glass_light_blue")
  public static BlockAbsentWall wall_glass_light_blue;
  @ObjectHolder(ID + "wall_glass_yellow")
  public static BlockAbsentWall wall_glass_yellow;
  @ObjectHolder(ID + "wall_glass_green")
  public static BlockAbsentWall wall_glass_green;
  @ObjectHolder(ID + "wall_glass_red")
  public static BlockAbsentWall wall_glass_red;
  @ObjectHolder(ID + "wall_glass")
  public static BlockAbsentWall wall_glass;
  @ObjectHolder(ID + "stairs_glass_purple")
  public static BlockAbsentStair stairs_glass_purple;
  @ObjectHolder(ID + "stairs_glass_blue")
  public static BlockAbsentStair stairs_glass_blue;
  @ObjectHolder(ID + "stairs_glass_brown")
  public static BlockAbsentStair stairs_glass_brown;
  @ObjectHolder(ID + "stairs_glass_red")
  public static BlockAbsentStair stairs_glass_red;
  @ObjectHolder(ID + "stairs_glass_black")
  public static BlockAbsentStair stairs_glass_black;
  @ObjectHolder(ID + "stairs_glass_cyan")
  public static BlockAbsentStair stairs_glass_cyan;
  @ObjectHolder(ID + "stairs_glass_light_gray")
  public static BlockAbsentStair stairs_glass_light_gray;
  @ObjectHolder(ID + "stairs_glass_gray")
  public static BlockAbsentStair stairs_glass_gray;
  @ObjectHolder(ID + "stairs_glass_pink")
  public static BlockAbsentStair stairs_glass_pink;
  @ObjectHolder(ID + "stairs_glass_lime")
  public static BlockAbsentStair stairs_glass_lime;
  @ObjectHolder(ID + "stairs_glass_light_blue")
  public static BlockAbsentStair stairs_glass_light_blue;
  @ObjectHolder(ID + "stairs_glass_magenta")
  public static BlockAbsentStair stairs_glass_magenta;
  @ObjectHolder(ID + "stairs_glass_white")
  public static BlockAbsentStair stairs_glass_white;
  @ObjectHolder(ID + "stairs_glass_green")
  public static BlockAbsentStair stairs_glass_green;
  @ObjectHolder(ID + "stairs_glass_yellow")
  public static BlockAbsentStair stairs_glass_yellow;
  @ObjectHolder(ID + "stairs_glass_orange")
  public static BlockAbsentStair stairs_glass_orange;
  @ObjectHolder(ID + "stairs_glass")
  public static BlockAbsentStair stairs_glass;
  @ObjectHolder(ID + "slab_glass")
  public static BlockAbsentSlab slab_glass;
  @ObjectHolder(ID + "slab_glass_white")
  public static BlockAbsentSlab slab_glass_white;
  @ObjectHolder(ID + "slab_glass_orange")
  public static BlockAbsentSlab slab_glass_orange;
  @ObjectHolder(ID + "slab_glass_magenta")
  public static BlockAbsentSlab slab_glass_magenta;
  @ObjectHolder(ID + "slab_glass_light_blue")
  public static BlockAbsentSlab slab_glass_light_blue;
  @ObjectHolder(ID + "slab_glass_yellow")
  public static BlockAbsentSlab slab_glass_yellow;
  @ObjectHolder(ID + "slab_glass_lime")
  public static BlockAbsentSlab slab_glass_lime;
  @ObjectHolder(ID + "slab_glass_pink")
  public static BlockAbsentSlab slab_glass_pink;
  @ObjectHolder(ID + "slab_glass_gray")
  public static BlockAbsentSlab slab_glass_gray;
  @ObjectHolder(ID + "slab_glass_light_gray")
  public static BlockAbsentSlab slab_glass_light_gray;
  @ObjectHolder(ID + "slab_glass_cyan")
  public static BlockAbsentSlab slab_glass_cyan;
  @ObjectHolder(ID + "slab_glass_purple")
  public static BlockAbsentSlab slab_glass_purple;
  @ObjectHolder(ID + "slab_glass_blue")
  public static BlockAbsentSlab slab_glass_blue;
  @ObjectHolder(ID + "slab_glass_brown")
  public static BlockAbsentSlab slab_glass_brown;
  @ObjectHolder(ID + "slab_glass_green")
  public static BlockAbsentSlab slab_glass_green;
  @ObjectHolder(ID + "slab_glass_red")
  public static BlockAbsentSlab slab_glass_red;
  @ObjectHolder(ID + "slab_glass_black")
  public static BlockAbsentSlab slab_glass_black;
  @ObjectHolder(ModAbsentBD.MODID + ":fence_quartz")
  private static BlockAbsentFence FENCE_QUARTZ;
  private static ItemGroup itemGroup = new ItemGroup(ModAbsentBD.MODID) {

    @Override
    public ItemStack createIcon() {
      return new ItemStack(AbsentRegistry.FENCE_QUARTZ);
    }
  };

  public static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
    return false;
  }

  public static Boolean neverAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
    return false;
  }

  public static void setupClient(final FMLClientSetupEvent event) {
    // walls
    setCutout(AbsentRegistry.wall_glass);
    setTranslucent(AbsentRegistry.wall_glass_white);
    setTranslucent(AbsentRegistry.wall_glass_orange);
    setTranslucent(AbsentRegistry.wall_glass_magenta);
    setTranslucent(AbsentRegistry.wall_glass_light_blue);
    setTranslucent(AbsentRegistry.wall_glass_yellow);
    setTranslucent(AbsentRegistry.wall_glass_lime);
    setTranslucent(AbsentRegistry.wall_glass_pink);
    setTranslucent(AbsentRegistry.wall_glass_gray);
    setTranslucent(AbsentRegistry.wall_glass_light_gray);
    setTranslucent(AbsentRegistry.wall_glass_cyan);
    setTranslucent(AbsentRegistry.wall_glass_purple);
    setTranslucent(AbsentRegistry.wall_glass_blue);
    setTranslucent(AbsentRegistry.wall_glass_brown);
    setTranslucent(AbsentRegistry.wall_glass_green);
    setTranslucent(AbsentRegistry.wall_glass_red);
    setTranslucent(AbsentRegistry.wall_glass_black);
    // stairs
    setCutout(AbsentRegistry.stairs_glass);
    setTranslucent(AbsentRegistry.stairs_glass_white);
    setTranslucent(AbsentRegistry.stairs_glass_orange);
    setTranslucent(AbsentRegistry.stairs_glass_magenta);
    setTranslucent(AbsentRegistry.stairs_glass_light_blue);
    setTranslucent(AbsentRegistry.stairs_glass_yellow);
    setTranslucent(AbsentRegistry.stairs_glass_lime);
    setTranslucent(AbsentRegistry.stairs_glass_pink);
    setTranslucent(AbsentRegistry.stairs_glass_gray);
    setTranslucent(AbsentRegistry.stairs_glass_light_gray);
    setTranslucent(AbsentRegistry.stairs_glass_cyan);
    setTranslucent(AbsentRegistry.stairs_glass_purple);
    setTranslucent(AbsentRegistry.stairs_glass_blue);
    setTranslucent(AbsentRegistry.stairs_glass_brown);
    setTranslucent(AbsentRegistry.stairs_glass_green);
    setTranslucent(AbsentRegistry.stairs_glass_red);
    setTranslucent(AbsentRegistry.stairs_glass_black);
    // slabs
    setCutout(AbsentRegistry.slab_glass);
    setTranslucent(AbsentRegistry.slab_glass_white);
    setTranslucent(AbsentRegistry.slab_glass_orange);
    setTranslucent(AbsentRegistry.slab_glass_magenta);
    setTranslucent(AbsentRegistry.slab_glass_light_blue);
    setTranslucent(AbsentRegistry.slab_glass_yellow);
    setTranslucent(AbsentRegistry.slab_glass_lime);
    setTranslucent(AbsentRegistry.slab_glass_pink);
    setTranslucent(AbsentRegistry.slab_glass_gray);
    setTranslucent(AbsentRegistry.slab_glass_light_gray);
    setTranslucent(AbsentRegistry.slab_glass_cyan);
    setTranslucent(AbsentRegistry.slab_glass_purple);
    setTranslucent(AbsentRegistry.slab_glass_blue);
    setTranslucent(AbsentRegistry.slab_glass_brown);
    setTranslucent(AbsentRegistry.slab_glass_green);
    setTranslucent(AbsentRegistry.slab_glass_red);
    setTranslucent(AbsentRegistry.slab_glass_black);
  }

  private static void setCutout(IBlockAbsent block) {
    RenderTypeLookup.setRenderLayer((Block) block, RenderType.getCutout());
    block.setTransparent();
  }

  private static void setTranslucent(IBlockAbsent block) {
    RenderTypeLookup.setRenderLayer((Block) block, RenderType.getTranslucent());
    block.setTransparent();
  }

  @SubscribeEvent
  public static void onBlocksRegistry(RegistryEvent.Register<Block> event) {
    IForgeRegistry<Block> reg = event.getRegistry();
    //
    //                FENCES
    //
    reg.register(createFence("fence_log_acacia", Blocks.ACACIA_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createFence("fence_log_birch", Blocks.BIRCH_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createFence("fence_log_darkoak", Blocks.DARK_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createFence("fence_log_jungle", Blocks.JUNGLE_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createFence("fence_log_oak", Blocks.OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createFence("fence_log_spruce", Blocks.SPRUCE_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createFence("fence_red_netherbrick", Blocks.RED_NETHER_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createFence("fence_crimson", Blocks.CRIMSON_STEM, Block.Properties.create(Material.WOOD)));
    reg.register(createFence("fence_warped", Blocks.OBSIDIAN, Block.Properties.create(Material.ROCK)));
    reg.register(createFence("fence_obsidian", Blocks.OBSIDIAN, Block.Properties.create(Material.ROCK)));
    reg.register(createFence("fence_quartz", Blocks.QUARTZ_BLOCK, Block.Properties.create(Material.ROCK)));
    //
    //                SLABS
    //
    reg.register(createSlab("slab_end_stone", Block.Properties.create(Material.ROCK), Blocks.END_STONE));
    reg.register(createSlab("slab_netherrack", Block.Properties.create(Material.ROCK), Blocks.NETHERRACK));
    reg.register(createSlab("slab_snow", Block.Properties.create(Material.ROCK), Blocks.SNOW_BLOCK));
    reg.register(createSlab("slab_bricks_cracked", Block.Properties.create(Material.ROCK), Blocks.CRACKED_STONE_BRICKS));
    reg.register(createSlab("slab_coarse_dirt", Block.Properties.create(Material.SNOW), Blocks.COARSE_DIRT));
    reg.register(createSlab("slab_obsidian", Block.Properties.create(Material.ROCK), Blocks.OBSIDIAN));
    reg.register(createSlab("slab_basalt", Block.Properties.create(Material.ROCK), Blocks.BASALT));
    reg.register(createSlab("slab_polished_basalt", Block.Properties.create(Material.ROCK), Blocks.POLISHED_BASALT));
    reg.register(createSlab("slab_crying_obsidian", Block.Properties.create(Material.ROCK).setLightLevel(state -> 10), Blocks.CRYING_OBSIDIAN));
    reg.register(createSlab("slab_lodestone", Block.Properties.create(Material.ROCK), Blocks.LODESTONE));
    reg.register(createSlab("slab_quartz_bricks", Block.Properties.create(Material.ROCK), Blocks.QUARTZ_BRICKS));
    reg.register(createSlab("slab_magma", Block.Properties.create(Material.ROCK).setLightLevel(state -> 3), Blocks.MAGMA_BLOCK));
    reg.register(createSlab("slab_glowstone", Block.Properties.create(Material.ROCK).sound(SoundType.GLASS).setLightLevel(state -> 15), Blocks.GLOWSTONE));
    reg.register(createSlab("slab_sea_lantern", Block.Properties.create(Material.ROCK).sound(SoundType.GLASS).setLightLevel(state -> 15), Blocks.SEA_LANTERN));
    reg.register(createSlab("slab_concrete_black", Block.Properties.create(Material.ROCK), Blocks.BLACK_CONCRETE));
    reg.register(createSlab("slab_concrete_blue", Block.Properties.create(Material.ROCK), Blocks.BLUE_CONCRETE));
    reg.register(createSlab("slab_concrete_brown", Block.Properties.create(Material.ROCK), Blocks.BROWN_CONCRETE));
    reg.register(createSlab("slab_concrete_cyan", Block.Properties.create(Material.ROCK), Blocks.CYAN_CONCRETE));
    reg.register(createSlab("slab_concrete_gray", Block.Properties.create(Material.ROCK), Blocks.GRAY_CONCRETE));
    reg.register(createSlab("slab_concrete_green", Block.Properties.create(Material.ROCK), Blocks.GREEN_CONCRETE));
    reg.register(createSlab("slab_concrete_light_blue", Block.Properties.create(Material.ROCK), Blocks.LIGHT_BLUE_CONCRETE));
    reg.register(createSlab("slab_concrete_lime", Block.Properties.create(Material.ROCK), Blocks.LIME_CONCRETE));
    reg.register(createSlab("slab_concrete_magenta", Block.Properties.create(Material.ROCK), Blocks.MAGENTA_CONCRETE));
    reg.register(createSlab("slab_concrete_orange", Block.Properties.create(Material.ROCK), Blocks.ORANGE_CONCRETE));
    reg.register(createSlab("slab_concrete_pink", Block.Properties.create(Material.ROCK), Blocks.PINK_CONCRETE));
    reg.register(createSlab("slab_concrete_purple", Block.Properties.create(Material.ROCK), Blocks.PURPLE_CONCRETE));
    reg.register(createSlab("slab_concrete_red", Block.Properties.create(Material.ROCK), Blocks.RED_CONCRETE));
    reg.register(createSlab("slab_concrete_silver", Block.Properties.create(Material.ROCK), Blocks.LIGHT_GRAY_CONCRETE));
    reg.register(createSlab("slab_concrete_white", Block.Properties.create(Material.ROCK), Blocks.WHITE_CONCRETE));
    reg.register(createSlab("slab_concrete_yellow", Block.Properties.create(Material.ROCK), Blocks.YELLOW_CONCRETE));
    reg.register(createSlab("slab_wool_black", Block.Properties.create(Material.WOOL), Blocks.BLACK_WOOL));
    reg.register(createSlab("slab_wool_blue", Block.Properties.create(Material.WOOL), Blocks.BLUE_WOOL));
    reg.register(createSlab("slab_wool_brown", Block.Properties.create(Material.WOOL), Blocks.BROWN_WOOL));
    reg.register(createSlab("slab_wool_cyan", Block.Properties.create(Material.WOOL), Blocks.CYAN_WOOL));
    reg.register(createSlab("slab_wool_gray", Block.Properties.create(Material.WOOL), Blocks.GRAY_WOOL));
    reg.register(createSlab("slab_wool_green", Block.Properties.create(Material.WOOL), Blocks.GREEN_WOOL));
    reg.register(createSlab("slab_wool_light_blue", Block.Properties.create(Material.WOOL), Blocks.LIGHT_BLUE_WOOL));
    reg.register(createSlab("slab_wool_lime", Block.Properties.create(Material.WOOL), Blocks.LIME_WOOL));
    reg.register(createSlab("slab_wool_magenta", Block.Properties.create(Material.WOOL), Blocks.MAGENTA_WOOL));
    reg.register(createSlab("slab_wool_orange", Block.Properties.create(Material.WOOL), Blocks.ORANGE_WOOL));
    reg.register(createSlab("slab_wool_pink", Block.Properties.create(Material.WOOL), Blocks.PINK_WOOL));
    reg.register(createSlab("slab_wool_purple", Block.Properties.create(Material.WOOL), Blocks.PURPLE_WOOL));
    reg.register(createSlab("slab_wool_red", Block.Properties.create(Material.WOOL), Blocks.RED_WOOL));
    reg.register(createSlab("slab_wool_silver", Block.Properties.create(Material.WOOL), Blocks.LIGHT_GRAY_WOOL));
    reg.register(createSlab("slab_wool_white", Block.Properties.create(Material.WOOL), Blocks.WHITE_WOOL));
    reg.register(createSlab("slab_wool_yellow", Block.Properties.create(Material.WOOL), Blocks.YELLOW_WOOL));
    reg.register(createSlab("slab_terracotta_white", Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA), Blocks.WHITE_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_orange", Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA), Blocks.ORANGE_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_magenta", Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA), Blocks.MAGENTA_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_light_blue", Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_yellow", Block.Properties.create(Material.ROCK, MaterialColor.YELLOW_TERRACOTTA), Blocks.YELLOW_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_lime", Block.Properties.create(Material.ROCK, MaterialColor.LIME_TERRACOTTA), Blocks.LIME_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_pink", Block.Properties.create(Material.ROCK, MaterialColor.PINK_TERRACOTTA), Blocks.PINK_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_gray", Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA), Blocks.GRAY_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_light_gray", Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_cyan", Block.Properties.create(Material.ROCK, MaterialColor.CYAN_TERRACOTTA), Blocks.CYAN_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_purple", Block.Properties.create(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA), Blocks.PURPLE_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_blue", Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA), Blocks.BLUE_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_brown", Block.Properties.create(Material.ROCK, MaterialColor.BROWN_TERRACOTTA), Blocks.BROWN_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_green", Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA), Blocks.GREEN_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_red", Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA), Blocks.RED_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta_black", Block.Properties.create(Material.ROCK, MaterialColor.BLACK_TERRACOTTA), Blocks.BLACK_GLAZED_TERRACOTTA));
    reg.register(createSlab("slab_terracotta", Block.Properties.create(Material.ROCK, MaterialColor.CLAY), Blocks.TERRACOTTA));
    reg.register(createSlab("slab_glass", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.GLASS));
    reg.register(createSlab("slab_glass_white", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.WHITE_STAINED_GLASS));
    reg.register(createSlab("slab_glass_orange", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.ORANGE_STAINED_GLASS));
    reg.register(createSlab("slab_glass_magenta", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.MAGENTA_STAINED_GLASS));
    reg.register(createSlab("slab_glass_light_blue", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.LIGHT_BLUE_STAINED_GLASS));
    reg.register(createSlab("slab_glass_yellow", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.YELLOW_STAINED_GLASS));
    reg.register(createSlab("slab_glass_lime", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.LIME_STAINED_GLASS));
    reg.register(createSlab("slab_glass_pink", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.PINK_STAINED_GLASS));
    reg.register(createSlab("slab_glass_gray", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.GRAY_STAINED_GLASS));
    reg.register(createSlab("slab_glass_light_gray", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.LIGHT_GRAY_STAINED_GLASS));
    reg.register(createSlab("slab_glass_cyan", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.CYAN_STAINED_GLASS));
    reg.register(createSlab("slab_glass_purple", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.PURPLE_STAINED_GLASS));
    reg.register(createSlab("slab_glass_blue", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.BLUE_STAINED_GLASS));
    reg.register(createSlab("slab_glass_brown", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.BROWN_STAINED_GLASS));
    reg.register(createSlab("slab_glass_green", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.GREEN_STAINED_GLASS));
    reg.register(createSlab("slab_glass_red", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.RED_STAINED_GLASS));
    reg.register(createSlab("slab_glass_black", Block.Properties.create(Material.GLASS).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.BLACK_STAINED_GLASS));
    reg.register(createSlab("slab_mushroom_stem", Block.Properties.create(Material.WOOD, MaterialColor.WOOL), Blocks.MUSHROOM_STEM));
    reg.register(createSlab("slab_red_mushroom", Block.Properties.create(Material.WOOD, MaterialColor.WOOL), Blocks.RED_MUSHROOM));
    reg.register(createSlab("slab_brown_mushroom", Block.Properties.create(Material.WOOD, MaterialColor.WOOL), Blocks.BROWN_MUSHROOM));
    reg.register(createSlab("slab_mushroom_polished", Block.Properties.create(Material.WOOD), Blocks.MUSHROOM_STEM));
    //  
    //                STAIRS
    //
    reg.register(createStair("stairs_coarse_dirt", Block.Properties.create(Material.EARTH), Blocks.COARSE_DIRT));
    reg.register(createStair("stairs_smooth_stone", Block.Properties.create(Material.ROCK), Blocks.SMOOTH_STONE));
    reg.register(createStair("stairs_end_stone", Block.Properties.create(Material.ROCK), Blocks.END_STONE));
    reg.register(createStair("stairs_bricks_cracked", Block.Properties.create(Material.ROCK), Blocks.CRACKED_STONE_BRICKS));
    reg.register(createStair("stairs_netherrack", Block.Properties.create(Material.ROCK), Blocks.NETHERRACK));
    reg.register(createStair("stairs_snow", Block.Properties.create(Material.SNOW), Blocks.SNOW_BLOCK));
    reg.register(createStair("stairs_obsidian", Block.Properties.create(Material.ROCK), Blocks.OBSIDIAN));
    reg.register(createStair("stairs_quartz_bricks", Block.Properties.create(Material.ROCK), Blocks.QUARTZ_BRICKS));
    reg.register(createStair("stairs_basalt", Block.Properties.create(Material.ROCK, MaterialColor.CLAY), Blocks.BASALT));
    reg.register(createStair("stairs_polished_basalt", Block.Properties.create(Material.ROCK, MaterialColor.CLAY), Blocks.POLISHED_BASALT));
    reg.register(createStair("stairs_crying_obsidian", Block.Properties.create(Material.ROCK, MaterialColor.CLAY).setLightLevel(state -> 10), Blocks.CRYING_OBSIDIAN));
    reg.register(createStair("stairs_lodestone", Block.Properties.create(Material.ROCK, MaterialColor.CLAY), Blocks.LODESTONE));
    reg.register(createStair("stairs_magma", Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).setLightLevel(s -> 3), Blocks.MAGMA_BLOCK));
    reg.register(createStair("stairs_glowstone", Block.Properties.create(Material.ROCK, MaterialColor.SAND).sound(SoundType.GLASS).setLightLevel(s -> 15), Blocks.GLOWSTONE));
    reg.register(createStair("stairs_sea_lantern", Block.Properties.create(Material.ROCK, MaterialColor.SAND).sound(SoundType.GLASS).setLightLevel(s -> 15), Blocks.SEA_LANTERN));
    reg.register(createStair("stairs_concrete_black", Block.Properties.create(Material.ROCK), Blocks.BLACK_CONCRETE));
    reg.register(createStair("stairs_concrete_blue", Block.Properties.create(Material.ROCK), Blocks.BLUE_CONCRETE));
    reg.register(createStair("stairs_concrete_brown", Block.Properties.create(Material.ROCK), Blocks.BROWN_CONCRETE));
    reg.register(createStair("stairs_concrete_cyan", Block.Properties.create(Material.ROCK), Blocks.CYAN_CONCRETE));
    reg.register(createStair("stairs_concrete_gray", Block.Properties.create(Material.ROCK), Blocks.GRAY_CONCRETE));
    reg.register(createStair("stairs_concrete_green", Block.Properties.create(Material.ROCK), Blocks.GREEN_CONCRETE));
    reg.register(createStair("stairs_concrete_light_blue", Block.Properties.create(Material.ROCK), Blocks.LIGHT_BLUE_CONCRETE));
    reg.register(createStair("stairs_concrete_lime", Block.Properties.create(Material.ROCK), Blocks.LIME_CONCRETE));
    reg.register(createStair("stairs_concrete_magenta", Block.Properties.create(Material.ROCK), Blocks.MAGENTA_CONCRETE));
    reg.register(createStair("stairs_concrete_orange", Block.Properties.create(Material.ROCK), Blocks.ORANGE_CONCRETE));
    reg.register(createStair("stairs_concrete_pink", Block.Properties.create(Material.ROCK), Blocks.PINK_CONCRETE));
    reg.register(createStair("stairs_concrete_purple", Block.Properties.create(Material.ROCK), Blocks.PURPLE_CONCRETE));
    reg.register(createStair("stairs_concrete_red", Block.Properties.create(Material.ROCK), Blocks.RED_CONCRETE));
    reg.register(createStair("stairs_concrete_silver", Block.Properties.create(Material.ROCK), Blocks.LIGHT_GRAY_CONCRETE));
    reg.register(createStair("stairs_concrete_white", Block.Properties.create(Material.ROCK), Blocks.WHITE_CONCRETE));
    reg.register(createStair("stairs_concrete_yellow", Block.Properties.create(Material.ROCK), Blocks.YELLOW_CONCRETE));
    reg.register(createStair("stairs_wool_black", Block.Properties.create(Material.WOOL), Blocks.BLACK_WOOL));
    reg.register(createStair("stairs_wool_blue", Block.Properties.create(Material.WOOL), Blocks.BLUE_WOOL));
    reg.register(createStair("stairs_wool_brown", Block.Properties.create(Material.WOOL), Blocks.BROWN_WOOL));
    reg.register(createStair("stairs_wool_cyan", Block.Properties.create(Material.WOOL), Blocks.CYAN_WOOL));
    reg.register(createStair("stairs_wool_gray", Block.Properties.create(Material.WOOL), Blocks.GRAY_WOOL));
    reg.register(createStair("stairs_wool_green", Block.Properties.create(Material.WOOL), Blocks.GREEN_WOOL));
    reg.register(createStair("stairs_wool_light_blue", Block.Properties.create(Material.WOOL), Blocks.LIGHT_BLUE_WOOL));
    reg.register(createStair("stairs_wool_lime", Block.Properties.create(Material.WOOL), Blocks.LIME_WOOL));
    reg.register(createStair("stairs_wool_magenta", Block.Properties.create(Material.WOOL), Blocks.MAGENTA_WOOL));
    reg.register(createStair("stairs_wool_orange", Block.Properties.create(Material.WOOL), Blocks.ORANGE_WOOL));
    reg.register(createStair("stairs_wool_pink", Block.Properties.create(Material.WOOL), Blocks.PINK_WOOL));
    reg.register(createStair("stairs_wool_purple", Block.Properties.create(Material.WOOL), Blocks.PURPLE_WOOL));
    reg.register(createStair("stairs_wool_red", Block.Properties.create(Material.WOOL), Blocks.RED_WOOL));
    reg.register(createStair("stairs_wool_silver", Block.Properties.create(Material.WOOL), Blocks.LIGHT_GRAY_WOOL));
    reg.register(createStair("stairs_wool_white", Block.Properties.create(Material.WOOL), Blocks.WHITE_WOOL));
    reg.register(createStair("stairs_wool_yellow", Block.Properties.create(Material.WOOL), Blocks.YELLOW_WOOL));
    reg.register(createStair("stairs_terracotta", Blocks.TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_white", Blocks.WHITE_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_orange", Blocks.ORANGE_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_magenta", Blocks.MAGENTA_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_light_blue", Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_yellow", Blocks.YELLOW_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_lime", Blocks.LIME_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_pink", Blocks.PINK_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_gray", Blocks.GRAY_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_light_gray", Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_cyan", Blocks.CYAN_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_purple", Blocks.PURPLE_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_blue", Blocks.BLUE_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_brown", Blocks.BROWN_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_green", Blocks.GREEN_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_red", Blocks.RED_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_terracotta_black", Blocks.BLACK_GLAZED_TERRACOTTA, Block.Properties.create(Material.ROCK, MaterialColor.CLAY)));
    reg.register(createStair("stairs_glass", Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid), Blocks.GLASS));
    reg.register(createStair("stairs_glass_white", Blocks.WHITE_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_orange", Blocks.ORANGE_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_magenta", Blocks.MAGENTA_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_light_blue", Blocks.LIGHT_BLUE_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_yellow", Blocks.YELLOW_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_lime", Blocks.LIME_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_pink", Blocks.PINK_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_gray", Blocks.GRAY_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_light_gray", Blocks.LIGHT_GRAY_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_cyan", Blocks.CYAN_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_purple", Blocks.PURPLE_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_blue", Blocks.BLUE_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_brown", Blocks.BROWN_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_green", Blocks.GREEN_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_red", Blocks.RED_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_glass_black", Blocks.BLACK_STAINED_GLASS, Block.Properties.create(Material.GLASS, MaterialColor.CLAY).notSolid().setAllowsSpawn(AbsentRegistry::neverAllowSpawn).setOpaque(AbsentRegistry::isntSolid).setSuffocates(AbsentRegistry::isntSolid).setBlocksVision(AbsentRegistry::isntSolid)));
    reg.register(createStair("stairs_red_mushroom", Block.Properties.create(Material.WOOD), Blocks.RED_MUSHROOM_BLOCK));
    reg.register(createStair("stairs_brown_mushroom", Block.Properties.create(Material.WOOD), Blocks.BROWN_MUSHROOM_BLOCK));
    reg.register(createStair("stairs_mushroom_stem", Block.Properties.create(Material.WOOD), Blocks.MUSHROOM_STEM));
    reg.register(createStair("stairs_mushroom_polished", Block.Properties.create(Material.WOOD), Blocks.MUSHROOM_STEM));
    //
    //                WALLS
    //
    reg.register(createWall("wall_stripped_acacia_log", Blocks.STRIPPED_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_stripped_birch_log", Blocks.STRIPPED_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_stripped_dark_oak_log", Blocks.STRIPPED_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_stripped_jungle_log", Blocks.STRIPPED_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_stripped_oak_log", Blocks.STRIPPED_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_stripped_spruce_log", Blocks.STRIPPED_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_acacia_log", Blocks.ACACIA_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_birch_log", Blocks.BIRCH_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_dark_oak_log", Blocks.DARK_OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_jungle_log", Blocks.JUNGLE_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_oak_log", Blocks.OAK_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_spruce_log", Blocks.SPRUCE_LOG, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_andesite_smooth", Blocks.ANDESITE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_diorite_smooth", Blocks.DIORITE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_end_stone", Blocks.END_STONE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_granite_smooth", Blocks.QUARTZ_BLOCK, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_purpur", Blocks.PURPUR_BLOCK, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_quartz", Blocks.QUARTZ_BLOCK, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_sandstone_red_smooth", Blocks.RED_SANDSTONE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_sandstone_smooth", Blocks.SANDSTONE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_stone", Blocks.STONE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_stone_slab", Blocks.STONE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_stonebrick_carved", Blocks.STONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_stonebrick_cracked", Blocks.STONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_obsidian", Blocks.OBSIDIAN, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_prismarine_bricks", Blocks.PRISMARINE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_dark_prismarine", Blocks.DARK_PRISMARINE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_crimson", Blocks.CRIMSON_STEM, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_warped", Blocks.WARPED_STEM, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_crying_obsidian", Blocks.CRYING_OBSIDIAN, Block.Properties.create(Material.ROCK).setLightLevel(state -> 10)));
    reg.register(createWall("wall_basalt", Blocks.BASALT, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_polished_basalt", Blocks.POLISHED_BASALT, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_lodestone", Blocks.LODESTONE, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_stripped_crimson", Blocks.STRIPPED_CRIMSON_HYPHAE, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_stripped_warped", Blocks.STRIPPED_WARPED_HYPHAE, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_mushroom_stem", Blocks.MUSHROOM_STEM, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_red_mushroom", Blocks.RED_MUSHROOM_BLOCK, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_brown_mushroom", Blocks.BROWN_MUSHROOM_BLOCK, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_mushroom_polished", Blocks.MUSHROOM_STEM, Block.Properties.create(Material.WOOD)));
    reg.register(createWall("wall_quartz_bricks", Blocks.QUARTZ_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createWall("wall_magma", Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).setLightLevel(s -> 3), Blocks.MAGMA_BLOCK));
    reg.register(createWall("wall_glowstone", Block.Properties.create(Material.ROCK, MaterialColor.SAND).sound(SoundType.GLASS).setLightLevel(s -> 15), Blocks.GLOWSTONE));
    reg.register(createWall("wall_sea_lantern", Block.Properties.create(Material.ROCK, MaterialColor.SAND).sound(SoundType.GLASS).setLightLevel(s -> 15), Blocks.SEA_LANTERN));
    reg.register(createWall("wall_glass", Block.Properties.create(Material.GLASS), Blocks.GLASS));
    reg.register(createWall("wall_glass_white", Block.Properties.create(Material.GLASS), Blocks.WHITE_STAINED_GLASS));
    reg.register(createWall("wall_glass_orange", Block.Properties.create(Material.GLASS), Blocks.ORANGE_STAINED_GLASS));
    reg.register(createWall("wall_glass_magenta", Block.Properties.create(Material.GLASS), Blocks.MAGENTA_STAINED_GLASS));
    reg.register(createWall("wall_glass_purple", Block.Properties.create(Material.GLASS), Blocks.PURPLE_STAINED_GLASS));
    reg.register(createWall("wall_glass_blue", Block.Properties.create(Material.GLASS), Blocks.BLUE_STAINED_GLASS));
    reg.register(createWall("wall_glass_brown", Block.Properties.create(Material.GLASS), Blocks.BROWN_STAINED_GLASS));
    reg.register(createWall("wall_glass_red", Block.Properties.create(Material.GLASS), Blocks.RED_STAINED_GLASS));
    reg.register(createWall("wall_glass_black", Block.Properties.create(Material.GLASS), Blocks.BLACK_STAINED_GLASS));
    reg.register(createWall("wall_glass_cyan", Block.Properties.create(Material.GLASS), Blocks.CYAN_STAINED_GLASS));
    reg.register(createWall("wall_glass_light_gray", Block.Properties.create(Material.GLASS), Blocks.LIGHT_GRAY_STAINED_GLASS));
    reg.register(createWall("wall_glass_gray", Block.Properties.create(Material.GLASS), Blocks.GRAY_STAINED_GLASS));
    reg.register(createWall("wall_glass_pink", Block.Properties.create(Material.GLASS), Blocks.PINK_STAINED_GLASS));
    reg.register(createWall("wall_glass_lime", Block.Properties.create(Material.GLASS), Blocks.LIME_STAINED_GLASS));
    reg.register(createWall("wall_glass_light_blue", Block.Properties.create(Material.GLASS), Blocks.LIGHT_BLUE_STAINED_GLASS));
    reg.register(createWall("wall_glass_yellow", Block.Properties.create(Material.GLASS), Blocks.YELLOW_STAINED_GLASS));
    reg.register(createWall("wall_glass_green", Block.Properties.create(Material.GLASS), Blocks.GREEN_STAINED_GLASS));
    reg.register(createWall("wall_oak_planks", Block.Properties.create(Material.WOOD), Blocks.OAK_PLANKS));
    reg.register(createWall("wall_dark_oak_planks", Block.Properties.create(Material.WOOD), Blocks.DARK_OAK_PLANKS));
    reg.register(createWall("wall_acacia_planks", Block.Properties.create(Material.WOOD), Blocks.ACACIA_PLANKS));
    reg.register(createWall("wall_jungle_planks", Block.Properties.create(Material.WOOD), Blocks.JUNGLE_PLANKS));
    reg.register(createWall("wall_birch_planks", Block.Properties.create(Material.WOOD), Blocks.BIRCH_PLANKS));
    reg.register(createWall("wall_spruce_planks", Block.Properties.create(Material.WOOD), Blocks.SPRUCE_PLANKS));
    reg.register(createWall("wall_crimson_planks", Block.Properties.create(Material.WOOD), Blocks.CRIMSON_PLANKS));
    reg.register(createWall("wall_warped_planks", Block.Properties.create(Material.WOOD), Blocks.WARPED_PLANKS));
    //
    //                GATE 
    //
    reg.register(createGate("gate_nether_bricks", Blocks.NETHER_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_red_nether_bricks", Blocks.RED_NETHER_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_quartz", Blocks.QUARTZ_BLOCK, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_stone_bricks", Blocks.STONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_blackstone_bricks", Blocks.POLISHED_BLACKSTONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_bricks", Blocks.BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_end_stone_bricks", Blocks.END_STONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_obsidian", Blocks.OBSIDIAN, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_prismarine", Blocks.PRISMARINE, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_prismarine_brick", Blocks.PRISMARINE, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_prismarine_dark", Blocks.DARK_PRISMARINE, Block.Properties.create(Material.ROCK)));
    reg.register(createGate("gate_purpur", Blocks.PURPUR_BLOCK, Block.Properties.create(Material.ROCK)));
    //
    //                TRAPDOOR
    //
    reg.register(createTrap("trapdoor_stone", Blocks.STONE, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_granite", Blocks.GRANITE, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_andesite", Blocks.ANDESITE, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_diorite", Blocks.DIORITE, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_bricks", Blocks.STONE, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_stone_bricks", Blocks.STONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_blackstone", Blocks.STONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_blackstone_bricks", Blocks.STONE_BRICKS, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_basalt", Blocks.STONE, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_end_stone", Blocks.STONE, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_purpur", Blocks.PURPUR_BLOCK, Block.Properties.create(Material.ROCK)));
    reg.register(createTrap("trapdoor_quartz", Blocks.QUARTZ_BLOCK, Block.Properties.create(Material.ROCK)));
  }

  @SubscribeEvent
  public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
    Item.Properties properties = new Item.Properties().group(AbsentRegistry.itemGroup);
    for (Block b : AbsentRegistry.BLOCKLIST) {
      event.getRegistry().register(new BlockItem(b, properties).setRegistryName(((IBlockAbsent) b).rawName()));
    }
  }

  public static Block createFence(String name, Block block, Block.Properties p) {
    return addBlock(new BlockAbsentFence(wrap(p, block), name));
  }

  public static Block createWall(String name, Block.Properties p, Block block) {
    Block b = addBlock(new BlockAbsentWall(wrap(p, block), name));
    if (block == Blocks.CRYING_OBSIDIAN) {
      ((BlockAbsentWall) b).part = ParticleTypes.DRIPPING_OBSIDIAN_TEAR;
    }
    return b;
  }

  @Deprecated
  public static Block createWall(String name, Block block, Block.Properties p) {
    return createWall(name, p, block);
  }

  public static Block createSlab(String name, Block.Properties prop, Block block) {
    Block b = addBlock(new BlockAbsentSlab(wrap(prop, block), name));
    if (block == Blocks.CRYING_OBSIDIAN) {
      ((BlockAbsentSlab) b).part = ParticleTypes.DRIPPING_OBSIDIAN_TEAR;
    }
    return b;
  }

  public static Block createStair(String name, Block.Properties prop, Block block) {
    Block b = addBlock(new BlockAbsentStair(block, wrap(prop, block), name));
    if (block == Blocks.CRYING_OBSIDIAN) {
      ((BlockAbsentStair) b).part = ParticleTypes.DRIPPING_OBSIDIAN_TEAR;
    }
    return b;
  }

  @Deprecated
  public static Block createStair(String name, Block block, Block.Properties prop) {
    return createStair(name, prop, block);
  }

  public static Block createGate(String name, Block block, Block.Properties p) {
    return addBlock(new BlockAbsentGate(wrap(p, block), name));
  }

  public static Block createDoor(String name, Block block, Block.Properties p) {
    return addBlock(new DoorAbsentBlock(wrap(p, block), name));
  }

  public static Block createTrap(String name, Block block, Block.Properties p) {
    return addBlock(new TrapDoorAbsent(wrap(p, block), name));
  }

  @SuppressWarnings("deprecation")
  private static Block.Properties wrap(Block.Properties propIn, Block blockIn) {
    if (blockIn.properties != null
        && blockIn.properties.blockColors != null) {
      propIn.blockColors = (state) -> {
        return blockIn.properties.blockColors.apply(blockIn.getDefaultState());
      };
    }
    return propIn
        .sound(blockIn.getSoundType(blockIn.getDefaultState()))
        .hardnessAndResistance(blockIn.getDefaultState().hardness);
  }

  @OnlyIn(Dist.CLIENT)
  public static void spawnBlockParticles(BasicParticleType partIn, World worldIn, BlockPos pos, Random rand) {
    double x = pos.getX() + rand.nextDouble();
    double y = pos.getY() + rand.nextDouble();
    double z = pos.getZ() + rand.nextDouble();
    double xSp = (rand.nextDouble() - 0.5D) * 0.5D;
    double ySp = (rand.nextDouble() - 0.5D) * 0.5D;
    double zSp = (rand.nextDouble() - 0.5D) * 0.5D;
    worldIn.addParticle(partIn, x, y, z, xSp, ySp, zSp);
  }

  public static Block addBlock(Block b) {
    BLOCKLIST.add(b);
    return b;
  }
}
