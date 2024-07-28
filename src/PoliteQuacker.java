/**
 * @author 6510405377 Jitlada Yotinta
 */
public class PoliteQuacker extends QuackCounter{
    static int numOfPoliteQuack = 0;

    public PoliteQuacker(Quackable quackable) {
        super(quackable);
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("ka");
        numOfPoliteQuack++;
        numOfQuack++;
    }

    public static int getNumOfPoliteQuack() {
        return numOfPoliteQuack;
    }
}
