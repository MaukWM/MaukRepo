package ss.week2;

public class ThreeWayLampEnum {

	private Setting setting;
	public enum Setting {OFF,LOW,MEDIUM,HIGH}
	
	//@ ensures getSetting() == Setting.OFF;
	//@ pure;
	public ThreeWayLampEnum() {
		setting = Setting.OFF;
	}
	
	//@ ensures theSetting == this.getSetting();
	//@ pure;
	public ThreeWayLampEnum(Setting theSetting) {
		setting = theSetting;
	}
	
	//@ ensures \old(getSetting() == Setting.OFF) ==> (getSetting() == Setting.LOW);
	//@ ensures \old(getSetting() == Setting.LOW) ==> (getSetting() == Setting.MEDIUM);
	//@ ensures \old(getSetting() == Setting.MEDIUM) ==> (getSetting() == Setting.HIGH);
	//@ ensures \old(getSetting() == Setting.HIGH) ==> (getSetting() == Setting.OFF);
	public void switchSetting() {
		switch (setting) {
			case OFF:
				setting = Setting.LOW;
				break;
				
			case LOW:
				setting = Setting.MEDIUM;
				break;
				
			case MEDIUM:
				setting = Setting.HIGH;
				break;
				
			case HIGH:
				setting = Setting.OFF;
				break;
				
			default:
				break;
		}
	}
	
	//@ pure;
	public Setting getSetting() {
		return setting;
	}
}