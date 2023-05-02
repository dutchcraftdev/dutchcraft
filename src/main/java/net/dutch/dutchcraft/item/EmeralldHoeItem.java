
package net.dutch.dutchcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.dutch.dutchcraft.itemgroup.DUTCHCRAFTItemGroup;
import net.dutch.dutchcraft.DutchcraftModElements;

@DutchcraftModElements.ModElement.Tag
public class EmeralldHoeItem extends DutchcraftModElements.ModElement {
	@ObjectHolder("dutchcraft:emeralld_hoe")
	public static final Item block = null;

	public EmeralldHoeItem(DutchcraftModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 400;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.EMERALD));
			}
		}, 0, -3f, new Item.Properties().group(DUTCHCRAFTItemGroup.tab)) {
		}.setRegistryName("emeralld_hoe"));
	}
}
