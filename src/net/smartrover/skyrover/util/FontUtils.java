package net.smartrover.skyrover.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public class FontUtils
{
    public static final class TYPEFACE
    {
        private static Typeface helvetica;
        public static final Typeface Helvetica(Context ctx) {

            if (helvetica == null) {
                helvetica = Typeface.createFromAsset(ctx.getAssets(), "fonts/helveticaneue-condensedbold.otf");
            }

            return helvetica;
        }
    }
}
