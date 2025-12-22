package net.snoopypupser.createfallout.potion;

import net.snoopypupser.createfallout.procedures.RadiatedOnEffectActiveTickProcedure;
import net.snoopypupser.createfallout.procedures.RadiatedActiveTickConditionProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public class RadiatedMobEffect extends MobEffect {
	public RadiatedMobEffect() {
		super(MobEffectCategory.HARMFUL, -10027264);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return ParticleTypes.ITEM_SLIME;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return RadiatedActiveTickConditionProcedure.execute(amplifier, duration);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		RadiatedOnEffectActiveTickProcedure.execute(entity.level(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}