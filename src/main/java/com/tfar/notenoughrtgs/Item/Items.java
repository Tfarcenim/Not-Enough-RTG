package com.tfar.notenoughrtgs.Item;


        import java.util.List;

        import javax.annotation.Nullable;

        import com.tfar.notenoughrtgs.util.reference;
        import nc.util.InfoHelper;
        import net.minecraft.client.util.ITooltipFlag;
        import net.minecraft.entity.player.EntityPlayer;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemStack;
        import net.minecraft.util.ActionResult;
        import net.minecraft.util.EnumActionResult;
        import net.minecraft.util.ResourceLocation;
        import net.minecraft.util.text.TextFormatting;
        import net.minecraft.world.World;
        import net.minecraftforge.fml.relauncher.Side;
        import net.minecraftforge.fml.relauncher.SideOnly;

public class Items extends Item {

    public final TextFormatting fixedColor;
    public final String[] fixedInfo;
    public final String[] info;

    public Items(String nameIn, TextFormatting fixedColor, String[] fixedTooltip, String... tooltip) {
        setUnlocalizedName(reference.MOD_ID + "." + nameIn);
        setRegistryName(new ResourceLocation(reference.MOD_ID, nameIn));
        this.fixedColor = fixedColor;
        fixedInfo = InfoHelper.buildFixedInfo(getUnlocalizedName(), fixedTooltip);
        info = InfoHelper.buildInfo(getUnlocalizedName(), tooltip);
    }

    public Items(String nameIn, TextFormatting fixedColor, String... tooltip) {
        this(nameIn, fixedColor, InfoHelper.EMPTY_ARRAY, tooltip);
    }

    public Items(String nameIn, String[] fixedTooltip, String... tooltip) {
        this(nameIn, TextFormatting.AQUA, fixedTooltip, tooltip);
    }

    public Items(String nameIn, String... tooltip) {
        this(nameIn, InfoHelper.EMPTY_ARRAY, tooltip);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, @Nullable World world, List<String> tooltip, ITooltipFlag flag) {
        super.addInformation(itemStack, world, tooltip, flag);
        if (info.length + fixedInfo.length > 0) InfoHelper.infoFull(tooltip, fixedColor, fixedInfo, info);
    }

    protected ActionResult<ItemStack> actionResult(boolean success, ItemStack stack) {
        return new ActionResult<ItemStack>(success ? EnumActionResult.SUCCESS : EnumActionResult.FAIL, stack);
    }

    protected boolean isStackOnHotbar(ItemStack itemStack, EntityPlayer player) {
        for (ItemStack hotbarStack : player.inventory.mainInventory.subList(0, 9)) {
            if (itemStack.isItemEqual(hotbarStack)) return true;
        }
        return false;
    }

    protected boolean isStackInInventory(ItemStack itemStack, EntityPlayer player) {
        for (ItemStack hotbarStack : player.inventory.mainInventory) {
            if (itemStack.isItemEqual(hotbarStack)) return true;
        }
        return false;
    }
}
