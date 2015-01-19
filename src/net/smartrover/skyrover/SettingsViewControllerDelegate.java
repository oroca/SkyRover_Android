package net.smartrover.skyrover;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public interface SettingsViewControllerDelegate {
    public void interfaceOpacityValueDidChange(float newValue);
    public void leftHandedValueDidChange(boolean isLeftHanded);
    public void accModeValueDidChange(boolean isAccMode);
    public void headfreeModeValueDidChange(boolean isHeadfree);
    public void yawEnableValueDidChange(boolean isHeadfree);
    public void beginnerModeValueDidChange(boolean isBeginnerMode);
    public void aileronAndElevatorDeadBandValueDidChange(float newValue);
    public void rudderDeadBandValueDidChange(float newValue);

    public void didConnect();
    public void didDisconnect();
    public void didFailToConnect();
}
