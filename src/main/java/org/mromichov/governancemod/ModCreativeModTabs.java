package org.mromichov.governancemod;

import com.google.common.util.concurrent.ClosingFuture;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.mromichov.governancemod.block.ModBlocks;
import org.mromichov.governancemod.item.ModItems;

import static org.mromichov.governancemod.GovernanceMod.MODID;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> GOVERNANCE_TAB = CREATIVE_MODE_TABS.register("governance_tab",
            () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.governance_tab"))
            .icon(() -> new ItemStack(ModItems.CARD.get()))
            .displayItems((params, output) -> {
                output.accept(ModItems.CARD.get());
                output.accept(ModBlocks.DECOR_BLOCK.get());
            })
            .build()
    );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
