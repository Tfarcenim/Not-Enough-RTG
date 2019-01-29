
package com.tfar.notenoughrtgs.block.item;

        import java.util.List;

        import javax.annotation.Nullable;

        import nc.util.InfoHelper;
        import net.minecraft.block.Block;
        import net.minecraft.client.util.ITooltipFlag;
        import net.minecraft.item.ItemBlock;
        import net.minecraft.item.ItemStack;
        import net.minecraft.util.text.TextFormatting;
        import net.minecraft.world.World;
        import net.minecraftforge.fml.relauncher.Side;
        import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlocks extends ItemBlock {

    public final TextFormatting fixedColor;
    public final String[] fixedInfo;
    public final String[] info;

    public ItemBlocks(Block block, TextFormatting fixedColor, String[] fixedTooltip, String... tooltip) {
        super(block);
        this.fixedColor = fixedColor;
        fixedInfo = InfoHelper.buildFixedInfo(block.getUnlocalizedName(), fixedTooltip);
        info = InfoHelper.buildInfo(block.getUnlocalizedName(), tooltip);
    }

    public ItemBlocks(Block block, String[] fixedTooltip, String... tooltip) {
        this(block, TextFormatting.AQUA, fixedTooltip, tooltip);
    }

    public ItemBlocks(Block block, String... tooltip) {
        this(block, InfoHelper.EMPTY_ARRAY, tooltip);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, @Nullable World world, List<String> tooltip, ITooltipFlag flag) {
        super.addInformation(itemStack, world, tooltip, flag);
        if (info.length + fixedInfo.length > 0) InfoHelper.infoFull(tooltip, fixedColor, fixedInfo, info);
    }
}
