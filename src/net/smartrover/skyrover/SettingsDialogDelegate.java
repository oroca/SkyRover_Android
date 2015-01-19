package net.smartrover.skyrover;

import net.smartrover.skyrover.SettingsDialog;

/**
 * @author OROCA SkyRover Team
 * @since  0.1
 */
public interface SettingsDialogDelegate
{
    public void prepareDialog(SettingsDialog dialog);
    public void onDismissed(SettingsDialog settingsDialog);
}
