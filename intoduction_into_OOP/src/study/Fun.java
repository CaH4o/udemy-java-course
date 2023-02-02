package study;

public class Fun {

	private String make;
	private double radios;
	private String color;

	private boolean isOn;
	private byte speed; // 0 - 5

	public Fun(String make, double radios, String color) {
		this.make = make;
		this.radios = radios;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		this.setSpeed((byte) 1);
	}

	public void switchOff() {
		this.isOn = false;
		this.setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		if (this.isOn && speed > 0 && speed <= 5)
			this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("Fun:\n Make: %s;\n Radios: %f;\n Color: %s;\n Is on: %b;\n Speed: %d.", this.make,
				this.radios, this.color, this.isOn, this.speed);
	}
}
