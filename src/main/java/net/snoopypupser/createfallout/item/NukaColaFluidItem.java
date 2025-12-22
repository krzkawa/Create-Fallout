package net.snoopypupser.createfallout.item;

import net.snoopypupser.createfallout.init.CreateFalloutModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class NukaColaFluidItem extends BucketItem {
	public NukaColaFluidItem() {
		super(CreateFalloutModFluids.NUKA_COLA_FLUID.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}