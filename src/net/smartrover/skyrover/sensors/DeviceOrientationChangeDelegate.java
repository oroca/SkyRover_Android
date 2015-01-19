package net.smartrover.skyrover.sensors;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public interface DeviceOrientationChangeDelegate {
    public void onDeviceOrientationChanged(float[] orientation, float magneticHeading, int magnetoAccuracy);
}
