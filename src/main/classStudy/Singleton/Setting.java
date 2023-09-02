package main.classStudy.Singleton;

public class Setting {
	private int volume = 5;

	public int getVolume() {
		return volume;
	}
	public void incVolume() { volume++; }
	public void decVolume() { volume--; }
}
