package net.smartrover.skyrover.util;

import java.io.IOException;

/**
 * @author OROCA SmartRover Team
 * @since  0.1
 */
public interface Serializable {

    public void serialize(Output out) throws IOException;

    public void deserialize(Input in) throws IOException;
}
