/**
 * 
 */
package org.team2168.utils.consoleprinter;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author James
 *
 * Note: This class uses attempts to use a removed class.
 * This class is deprecated.
 */
public class LoggableNamedSendable implements Loggable {
	private Supplier<Sendable> value;

	// public LoggableNamedSendable(Supplier<NamedSendable> value) {
	// 	this.value = value;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.team2168.utils.consoleprinter.Loggable#put(java.lang.String)
	 */
	@Override
	public void put(String key) {
		SmartDashboard.putData(value.get());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.team2168.utils.consoleprinter.Loggable#valueToString()
	 */
	@Override
	public String valueToString() {
		return value.get().getName();
	}
	
}
