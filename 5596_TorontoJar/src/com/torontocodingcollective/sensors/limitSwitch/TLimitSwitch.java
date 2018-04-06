package com.torontocodingcollective.sensors.limitSwitch;

import edu.wpi.first.wpilibj.DigitalInput;

public class TLimitSwitch {

	public enum DefaultState {
		CLOSED, OPEN
	}

	private final boolean defaultState;
	
	public final DigitalInput limitSwitch;

	public TLimitSwitch(int port, DefaultState defaultState) {
		this.defaultState = defaultState == DefaultState.CLOSED ? true : false;
		limitSwitch = new DigitalInput(port);
	}

	public boolean atLimit() {
		return limitSwitch.get() != defaultState;
	}

}
