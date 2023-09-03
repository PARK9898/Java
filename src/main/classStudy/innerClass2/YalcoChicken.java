package main.classStudy.innerClass2;

// 내부 클래스 사용 이유
// - 외부/내부 클래스간의 관계가 긴밀할경우
// 적절히 사용시 유지보수 용이&가독성 증가
public class YalcoChicken {
	private String name;
	public YalcoChicken (String name) {
		this.name = name;
	}

	//  매장신설 TF팀 - 본사에서 창설
	// static은 본사와 연관
	public static class LaunchTF {
		private String title;
		private String leader;

		public LaunchTF(String title, String leader) {
			this.title = title;
			this.leader = leader;
		}

		public YalcoChicken launch () {
			//  ⚠️ 인스턴스 필드는 사용 불가
			//  System.out.println(this.name);
			return new YalcoChicken(title);
		}
	}

	//  매장마다의 기프트 - 매장에서 배부
	//  매장에서 관리
	class Gift {
		private String message;

		public Gift(String to) {
			this.message = "From 얄코치킨 %s점 to %s님"
				.formatted(name, to);
		}
	}
	// 매장에서 관리하기 때문에 이것을 반환하는 메서드를 만들어줘야함
	public Gift getGift (String to) {
		return new Gift(to);
	}
}
