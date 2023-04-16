
package net.dutch.dutchcraft.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.dutch.dutchcraft.itemgroup.DUTCHCRAFTItemGroup;
import net.dutch.dutchcraft.DutchcraftModElements;

@DutchcraftModElements.ModElement.Tag
public class BibItem extends DutchcraftModElements.ModElement {
	@ObjectHolder("dutchcraft:bib_helmet")
	public static final Item helmet = null;
	@ObjectHolder("dutchcraft:bib_chestplate")
	public static final Item body = null;
	@ObjectHolder("dutchcraft:bib_leggings")
	public static final Item legs = null;
	@ObjectHolder("dutchcraft:bib_boots")
	public static final Item boots = null;

	public BibItem(DutchcraftModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 3;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 0, 1, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.STRING));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "bib";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(DUTCHCRAFTItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "dutchcraft:textures/models/armor/bib__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("bib_chestplate"));
	}

}
