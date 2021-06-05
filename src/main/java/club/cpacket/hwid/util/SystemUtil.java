package club.cpacket.hwid.util;

import net.minecraft.client.Minecraft;
import org.apache.commons.codec.digest.DigestUtils;

public class SystemUtil {

    public static String getSystemInfo() {

        /**
         * [OPTIONAL]
         * Your main mod configuration folder, if you'd like to add configuration folder checks.
         */

        // String mainPath = "hwid-auth-mod/";

        /**
         * System properties.
         */

        return DigestUtils.sha256Hex(DigestUtils.sha256Hex(System.getenv("os")
                + System.getProperty("os.name")
                + System.getProperty("os.arch")
                + System.getProperty("user.name")
                + System.getenv("SystemRoot")
                + System.getenv("HOMEDRIVE")
                + System.getenv("PROCESSOR_LEVEL")
                + System.getenv("PROCESSOR_REVISION")
                + System.getenv("PROCESSOR_IDENTIFIER")
                + System.getenv("PROCESSOR_ARCHITECTURE")
                + System.getenv("PROCESSOR_ARCHITEW6432")
                + System.getenv("NUMBER_OF_PROCESSORS")
        )) + Minecraft.getMinecraft().session.getUsername();
    }
}