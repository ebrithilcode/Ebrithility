package com.ebrithil.ebrithility.blocks;

import com.ebrithil.ebrithility.EbrithilityMod;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;


public class BlockCharger extends Block {

    public BlockCharger() {
        super(Properties.create(Material.IRON));
        setRegistryName(new ResourceLocation(EbrithilityMod.MOD_ID , "block_charger"));
    }

//    @Override
//    public boolean hasTileEntity(BlockState state) {
//        return true;
//    }

//    @Nullable
//    @Override
//    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
//        return null;
//    }

    @Nullable
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 2;
    }

    private Item item = new BlockItem(this, new Item.Properties());
    @Override
    public Item asItem() {
        return item;
    }

}
