package es.eucm.gleaner.tracker.model.traces;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
/**
 * Represents an input trace
 */
public class InputTrace extends Trace {

	public static final String TYPE = "input";

	public static enum Device {
		MOUSE, KEYBOARD, TOUCH_SCREEN, NO_DEVICE, MOUSE_WHEEL;
	}

	public static enum Action {
		PRESSED, RELEASED, CLICKED, MOVED, DRAGGED, ENTERED, EXITED, WHEEL, FOCUS_GAINED, FOCUS_LOST, DROPPED, START_DRAG, DRAG_ENTERED, DRAG_EXITED, DROPPED_OVER;
	}

	private String context;

	private String target;

	private String device;

	private String action;

	private Integer button;

	private Float value1;

	private Float value2;

	private Float value3;

	private String extra;

	public InputTrace() {
		event = TYPE;
	}

	public InputTrace(String context, String target, String device,
			String action, Integer button, Float value1, Float value2,
			Float value3, String extra) {
		this();
		this.context = context;
		this.target = target;
		this.device = device;
		this.action = action;
		this.button = button;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.extra = extra;
	}

	public String getContext() {
		return context;
	}

	public String getTarget() {
		return target;
	}

	public String getDevice() {
		return device;
	}

	public String getAction() {
		return action;
	}

	public Integer getButton() {
		return button;
	}

	public Float getValue1() {
		return value1;
	}

	public Float getValue2() {
		return value2;
	}

	public Float getValue3() {
		return value3;
	}

	public String getExtra() {
		return extra;
	}
}
