import java.util.function.Consumer;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a=new Cow();
		Sound s=new Sound();

		Consumer<Animal>fn=p->s.sound(p);
		fn.accept(a);

	}
}



