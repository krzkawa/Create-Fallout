/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createfallout.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Item;

import net.mcreator.createfallout.item.*;
import net.mcreator.createfallout.CreateFalloutMod;

public class CreateFalloutModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateFalloutMod.MODID);
	public static final DeferredItem<Item> NUKA_COLA;
	public static final DeferredItem<Item> SUGARBOMBS;
	public static final DeferredItem<Item> NUKA_COLA_GLASS;
	public static final DeferredItem<Item> NUKA_COLA_FLUID_BUCKET;
	public static final DeferredItem<Item> NUKA_CAPS;
	public static final DeferredItem<Item> BROWNING_SAUCE;
	public static final DeferredItem<Item> QUANTUM_COLA;
	public static final DeferredItem<Item> STIMPACK;
	public static final DeferredItem<Item> RADAWAY;
	static {
		NUKA_COLA = REGISTRY.register("nuka_cola", NukaColaItem::new);
		SUGARBOMBS = REGISTRY.register("sugarbombs", SugarbombsItem::new);
		NUKA_COLA_GLASS = REGISTRY.register("nuka_cola_glass", NukaColaGlassItem::new);
		NUKA_COLA_FLUID_BUCKET = REGISTRY.register("nuka_cola_fluid_bucket", NukaColaFluidItem::new);
		NUKA_CAPS = REGISTRY.register("nuka_caps", NukaCapsItem::new);
		BROWNING_SAUCE = REGISTRY.register("browning_sauce", BrowningSauceItem::new);
		QUANTUM_COLA = REGISTRY.register("quantum_cola", QuantumColaItem::new);
		STIMPACK = REGISTRY.register("stimpack", StimpackItem::new);
		RADAWAY = REGISTRY.register("radaway", RadawayItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), NUKA_COLA_FLUID_BUCKET.get());
	}
}