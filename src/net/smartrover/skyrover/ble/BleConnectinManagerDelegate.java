package net.smartrover.skyrover.ble;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public interface BleConnectinManagerDelegate {
    public void didConnect(BleConnectinManager manager);
    public void didDisconnect(BleConnectinManager manager);
    public void didFailToConnect(BleConnectinManager manager);
    public void didReceiveData(BleConnectinManager manager, String data);
}
