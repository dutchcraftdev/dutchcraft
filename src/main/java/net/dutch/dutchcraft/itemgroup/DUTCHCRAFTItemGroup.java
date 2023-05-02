
package net.dutch.dutchcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.dutch.dutchcraft.item.LogoItem;
import net.dutch.dutchcraft.DutchcraftModElements;

@DutchcraftModElements.ModElement.Tag
public class DUTCHCRAFTItemGroup extends DutchcraftModElements.ModElement {
	public DUTCHCRAFTItemGroup(DutchcraftModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdutchcraft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LogoItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
