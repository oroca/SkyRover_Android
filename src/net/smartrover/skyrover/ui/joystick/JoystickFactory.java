/*
 * JoystickFactory
 *
 *  Created on: May 26, 2011
 *      Author: Dmytro Baryskyy
 */

package net.smartrover.skyrover.ui.joystick;


import net.smartrover.skyrover.ui.Sprite.Align;

import android.content.Context;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public class JoystickFactory
{
    public enum JoystickType {
        NONE,
        ANALOGUE,
        ACCELERO,
    }

    public static JoystickBase createAnalogueJoystick(Context context, boolean isRollPitchJoystick,
                                                            JoystickListener analogueListener,
                                                            boolean yStickIsBounced)
    {
        AnalogueJoystick joy = new AnalogueJoystick(context, Align.NO_ALIGN, isRollPitchJoystick, yStickIsBounced);
        joy.setOnAnalogueChangedListener(analogueListener);

        return joy;
    }


    public static JoystickBase createAcceleroJoystick(Context context, boolean isRollPitchJoystick,
                                                            JoystickListener acceleroListener,
                                                            boolean yStickIsBounced)
    {
        AcceleratorJoystick joy = new AcceleratorJoystick(context, Align.NO_ALIGN, isRollPitchJoystick, yStickIsBounced);
        joy.setOnAnalogueChangedListener(acceleroListener);

        return joy;
    }
}