package main.classStudy.objectClass2;

public class Click {
	int x;
	int y;
	int timestamp;

	public Click(int x, int y, int timestamp) {
		this.x = x;
		this.y = y;
		this.timestamp = timestamp;
	}

	 // obj로 들어왔으니까 강제 형변환 해줘야함
	 @Override
	 public boolean equals(Object obj) {
	     if (!(obj instanceof Click)) return false;
	     return this.x == ((Click) obj).x && this.y == ((Click) obj).y;
	 }
}
