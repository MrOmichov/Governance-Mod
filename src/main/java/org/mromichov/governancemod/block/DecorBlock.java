package org.mromichov.governancemod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class DecorBlock extends Block {

    public DecorBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        // pPlayer.sendSystemMessage(Component.literal("This is decor block."));
        pLevel.playSound(pPlayer, pPos, SoundEvents.NOTE_BLOCK_HAT.get(), SoundSource.BLOCKS, 1f, 1f);

        return InteractionResult.SUCCESS;
    }
}
