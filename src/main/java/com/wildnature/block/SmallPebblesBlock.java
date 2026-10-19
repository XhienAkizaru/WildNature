package com.wildnature.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Decorative scattered pebbles. Their visible shape is low, but they have no
 * collision so the player can walk through/across the patch without snagging.
 */
public final class SmallPebblesBlock extends Block {
    private static final VoxelShape VISUAL_SHAPE = Shapes.or(
        Shapes.or(
            Shapes.or(Block.box(1, 0, 6, 3, 1, 8), Block.box(12, 0, 3, 15, 1, 7)),
            Block.box(12, 0, 12, 14, 1, 16)
        ),
        Shapes.or(Block.box(5, 0, 1, 8, 1, 4), Block.box(6, 0, 9, 8, 1, 11))
    );

    public SmallPebblesBlock(Properties properties) {
        super(properties.noOcclusion().instabreak().strength(0.05F));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return VISUAL_SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }
}
