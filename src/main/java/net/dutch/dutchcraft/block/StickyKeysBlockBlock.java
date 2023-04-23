
package net.dutch.dutchcraft.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.dutch.dutchcraft.itemgroup.DUTCHCRAFTItemGroup;
import net.dutch.dutchcraft.DutchcraftModElements;

import java.util.List;
import java.util.Collections;

@DutchcraftModElements.ModElement.Tag
public class StickyKeysBlockBlock extends DutchcraftModElements.ModElement {
	@ObjectHolder("dutchcraft:sticky_keys_block")
	public static final Block block = null;

	public StickyKeysBlockBlock(DutchcraftModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(DUTCHCRAFTItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.GLASS)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("dutchcraft:block.stickykeys")),
							() -> new SoundEvent(new ResourceLocation("dutchcraft:block.stickykeys")),
							() -> new SoundEvent(new ResourceLocation("dutchcraft:block.stickykeys")),
							() -> new SoundEvent(new ResourceLocation("dutchcraft:block.stickykeys")),
							() -> new SoundEvent(new ResourceLocation("dutchcraft:block.stickykeys"))))
					.hardnessAndResistance(0.01f, 0.01f).setLightLevel(s -> 7).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("sticky_keys_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 0));
		}
	}
}
