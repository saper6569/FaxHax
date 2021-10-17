package com.fax.hax;

import java.util.logging.Logger;

import com.fax.hax.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FaxHax.MODID, name = FaxHax.NAME, version = FaxHax.VERSION)
public class FaxHax {

    public static final String MODID = "faxhax";
    public static final String NAME = "FaxHax";
    public static final String VERSION = "1.0.0";
    public static final String CLIENT_PROXY = "com.fax.hax.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.fax.hax.proxy.ServerProxy";

    public static final Logger LOGGER = Logger.getLogger(FaxHax.MODID);

    @Mod.Instance
    public static FaxHax instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static ServerProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
