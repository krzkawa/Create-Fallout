package net.snoopypupser.createfallout.procedures;

import net.snoopypupser.createfallout.init.CreateFalloutModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class RadiationOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CreateFalloutModMobEffects.RADIATED);
	}
}