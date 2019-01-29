package com.tfar.notenoughrtgs.item;


        import java.util.List;

        import javax.annotation.Nullable;

        import com.tfar.notenoughrtgs.util.reference;
        import nc.util.InfoHelper;
        import net.minecraft.client.util.ITooltipFlag;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemStack;
        import net.minecraft.util.ResourceLocation;
        import net.minecraft.util.text.TextFormatting;
        import net.minecraft.world.World;
        import net.minecraftforge.fml.relauncher.Side;
        import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems extends Item {

    public final TextFormatting fixedColor;
    public final String[] fixedInfo;
    public final String[] info;

    public ModItems(String nameIn, TextFormatting fixedColor, String[] fixedTooltip, String... tooltip) {
        setUnlocalizedName(reference.MOD_ID + "." + nameIn);
        setRegistryName(new ResourceLocation(reference.MOD_ID, nameIn));
        this.fixedColor = fixedColor;
        fixedInfo = InfoHelper.buildFixedInfo(getUnlocalizedName(), fixedTooltip);
        info = InfoHelper.buildInfo(getUnlocalizedName(), tooltip);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, @Nullable World world, List<String> tooltip, ITooltipFlag flag) {
        super.addInformation(itemStack, world, tooltip, flag);
        if (info.length + fixedInfo.length > 0) InfoHelper.infoFull(tooltip, fixedColor, fixedInfo, info);
    }
}
