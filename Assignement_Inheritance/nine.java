interface Game {
	void play();
}
class Cricket implements Game {
	public void play() {
		System.out.println("play cricket");
	}
}
class Football implements Game {
	public void play() {
		System.out.println("play football");
	}
}
class Tennis implements Game {
	public void play() {
		System.out.println("play tennis");
	}
}

public class nine {
	static void perform(Game ref) {
		ref.play();
	}
	public static void main(String[] args) {
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}
}