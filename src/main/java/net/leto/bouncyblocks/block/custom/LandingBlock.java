package net.leto.bouncyblocks.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class LandingBlock extends Block {
    public LandingBlock(Settings settings){
        super(settings);
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (entity.bypassesLandingEffects()) {
            super.onLandedUpon(world, state, pos, entity, fallDistance);
        } else {
            entity.handleFallDamage(fallDistance, 0.0f, world.getDamageSources().fall());
        }
    }
    
    /*
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.handleFallDamage(fallDistance, 1.0f, entity.getDamageSources().fall());
    }

    /**
     * Called after the entity lands on the block.
     *
     * <p>Default implementation resets the entity's vertical velocity. Blocks that cause
     * entities to jump (such as {@link SlimeBlock}) should override this.
     *
     * <p>This method is called on both the logical client and logical server, so take caution
     * when overriding this method. The logical side can be checked using {@link
     * World#isClient}.

    public void onEntityLand(BlockView world, Entity entity) {
        entity.setVelocity(entity.getVelocity().multiply(1.0, 0.0, 1.0));
    }
    */
}
