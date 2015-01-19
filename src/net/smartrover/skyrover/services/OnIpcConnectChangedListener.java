package net.smartrover.skyrover.services;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public interface OnIpcConnectChangedListener {
    public void OnIpcConnected();

    public void OnIpcDisConnected();

    public void onIpcPaused();

    public void onIpcResumed();
}
