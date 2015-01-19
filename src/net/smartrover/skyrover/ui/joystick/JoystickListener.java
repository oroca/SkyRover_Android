/*
 * JoystickListener
 *
 *  Created on: May 26, 2011
 *      Author: Dmytro Baryskyy
 */

package net.smartrover.skyrover.ui.joystick;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public abstract class JoystickListener
{
    public abstract void onChanged(JoystickBase joystick, float x, float y);
    public abstract void onPressed(JoystickBase joystick);
    public abstract void onReleased(JoystickBase joystick);
}
