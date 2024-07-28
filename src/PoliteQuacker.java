/**
 * @author 6510405377 Jitlada Yotinta
 */
public class PoliteQuacker implements Quackable{
    Quackable quackable;

    public PoliteQuacker(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("ka");
    }

}
