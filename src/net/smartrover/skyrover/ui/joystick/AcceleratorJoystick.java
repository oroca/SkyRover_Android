/*
 * AcceleroJoystick
 *
 *  Created on: May 26, 2011
 *      Author: Dmytro Baryskyy
 */

package net.smartrover.skyrover.ui.joystick;

import net.smartrover.skyrover.R;

import android.content.Context;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public class AcceleratorJoystick extends JoystickBase {

    public AcceleratorJoystick(Context context, Align align, boolean isRollPitchJoystick, boolean yStickIsBounced) {
        super(context, align, isRollPitchJoystick, yStickIsBounced);
    }

    @Override
    protected int getBackgroundDrawableId() {
        return R.drawable.joystick_bg2;
    }

    @Override
    protected int getTumbDrawableId() {
        return R.drawable.joystick_rudder_throttle;
    }

    @Override
    protected void onActionMove(float x, float y) {}
}
