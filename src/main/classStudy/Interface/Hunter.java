package main.classStudy.Interface;

public interface Hunter {
	String position = "포식자"; // ⭐️ final - 초기화하지 않을 시 오류
	//interFace의 필드는 public static final이다
	//메소드는 public abstract이다
	void hunt ();
}
