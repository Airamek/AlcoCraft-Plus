package me.itzme1on.alcocraftplus.misc;

import com.mojang.logging.LogUtils;
import me.itzme1on.alcocraftplus.AlcoCraftPlus;
import me.itzme1on.alcocraftplus.blocks.AlcoBlocks;
import me.itzme1on.alcocraftplus.items.AlcoItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = AlcoCraftPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlcoTabGroup {
    @SubscribeEvent
    public static void creativeTabRegistry(CreativeModeTabEvent.Register event) {
        alcoTab = event.registerCreativeModeTab(new ResourceLocation(AlcoCraftPlus.MOD_ID, "alcocrafttab"), builder ->

            builder.icon(() -> AlcoItems.MUG_OF_CHORUS_ALE.get().getDefaultInstance()) // Icon of the tab display
            .displayItems((enabledFlags, populator, hasPermissions) -> {
                populator.accept(AlcoItems.HOP.get());
                populator.accept(AlcoItems.HOP_SEEDS.get());
                populator.accept(AlcoItems.DRY_SEEDS.get());
                populator.accept(AlcoItems.MUG_EMPTY.get());
                populator.accept(AlcoItems.MUG_OF_CHORUS_ALE.get());
                populator.accept(AlcoItems.MUG_OF_DIGGER_BITTER.get());
                populator.accept(AlcoItems.MUG_OF_DROWNED_ALE.get());
                populator.accept(AlcoItems.MUG_OF_ICE_BEER.get());
                populator.accept(AlcoItems.MUG_OF_KVASS.get());
                populator.accept(AlcoItems.MUG_OF_LEPRECHAUN_CIDER.get());
                populator.accept(AlcoItems.MUG_OF_MAGNET_PILSNER.get());
                populator.accept(AlcoItems.MUG_OF_NETHER_PORTER.get());
                populator.accept(AlcoItems.MUG_OF_NETHER_STAR_LAGER.get());
                populator.accept(AlcoItems.MUG_OF_NIGHT_RAUCH.get());
                populator.accept(AlcoItems.MUG_OF_SUN_PALE_ALE.get());
                populator.accept(AlcoItems.MUG_OF_WITHER_STOUT.get());
                populator.accept(AlcoBlocks.KEG.get());
            }).title(Component.translatable( "itemGroup.alcotabgroup")) // Set name of tab to display
        );
    }
    static CreativeModeTab alcoTab;
}
