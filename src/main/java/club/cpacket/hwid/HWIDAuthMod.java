package club.cpacket.hwid;

import club.cpacket.hwid.manager.HWIDManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HWIDAuthMod.MODID, name = HWIDAuthMod.NAME, version = HWIDAuthMod.VERSION)
public class HWIDAuthMod {

    public static final String MODID = "hwidauthmod";
    public static final String NAME = "HWID-Authentication-System";
    public static final String VERSION = "1.0.0";

    public static String getVersion() {
        return VERSION;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        HWIDManager.hwidCheck(); // Does the HWID check.
    }
}
