package baguchan.earthmobsmod.entity;

import baguchan.earthmobsmod.entity.projectile.BoneShard;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.level.Level;

import java.util.EnumSet;

public class BoneSpider extends Spider implements RangedAttackMob {
	public BoneSpider(EntityType<? extends BoneSpider> p_33786_, Level p_33787_) {
		super(p_33786_, p_33787_);
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 28.0D).add(Attributes.ATTACK_DAMAGE, 4.0F).add(Attributes.MOVEMENT_SPEED, (double) 0.3F).add(Attributes.ARMOR, 8.0F).add(Attributes.FOLLOW_RANGE, 18.0F);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(2, new BoneSpiderAttackGoal(this));
	}

	static class BoneSpiderAttackGoal extends Goal {
		private final BoneSpider spider;
		private int attackStep;
		private int attackTime;
		private int lastSeen;

		public BoneSpiderAttackGoal(BoneSpider p_32247_) {
			this.spider = p_32247_;
			this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
		}

		public boolean canUse() {
			LivingEntity livingentity = this.spider.getTarget();
			return livingentity != null && livingentity.isAlive() && this.spider.canAttack(livingentity);
		}

		public void start() {
			this.attackStep = 0;
		}

		public void stop() {
			this.lastSeen = 0;
		}

		public void tick() {
			--this.attackTime;
			LivingEntity livingentity = this.spider.getTarget();
			if (livingentity != null) {
				boolean flag = this.spider.getSensing().hasLineOfSight(livingentity);
				if (flag) {
					this.lastSeen = 0;
				} else {
					++this.lastSeen;
				}

				double d0 = this.spider.distanceToSqr(livingentity);
				if (d0 < 32.0D) {
					if (!flag) {
						return;
					}
					this.attackStep = 0;

					if (d0 < 4.0D + this.spider.getBbWidth() && this.attackTime <= 0) {
						this.attackTime = 20;
						this.spider.doHurtTarget(livingentity);
					}

					this.spider.getLookControl().setLookAt(livingentity, 10.0F, 10.0F);
					this.spider.getNavigation().moveTo(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0F);
				} else if (d0 < this.getFollowDistance() * this.getFollowDistance() && flag) {
					if (this.attackTime <= 0) {
						++this.attackStep;
						if (this.attackStep == 1) {
							this.attackTime = 30;
						} else if (this.attackStep <= 3) {
							this.attackTime = 10;
						} else {
							this.attackTime = 30;
							this.attackStep = 0;
						}

						if (this.attackStep > 1) {
							double d4 = Math.sqrt(Math.sqrt(d0)) * 0.5D;

							this.spider.performRangedAttack(livingentity, attackTime);
						}
					}

					this.spider.getLookControl().setLookAt(livingentity, 10.0F, 10.0F);
				} else if (this.lastSeen < 5) {
					this.spider.getNavigation().moveTo(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0F);
				}

				super.tick();
			}
		}

		private double getFollowDistance() {
			return this.spider.getAttributeValue(Attributes.FOLLOW_RANGE);
		}
	}

	public void performRangedAttack(LivingEntity p_29912_, float p_29913_) {
		BoneShard bone = new BoneShard(this.level, this);
		double d1 = p_29912_.getX() - this.getX();
		double d2 = p_29912_.getEyeY() - this.getEyeY();
		double d3 = p_29912_.getZ() - this.getZ();
		bone.shoot(d1, d2, d3, 1.4F, 2.0F + p_29913_);
		this.playSound(SoundEvents.LLAMA_SPIT, 1.0F, 0.4F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
		this.level.addFreshEntity(bone);
	}
}
