/**
 * @author 6510405377 Jitlada Yotinta
 */
public class QuackCounter implements Quackable{
    Quackable quackable;
    static int numOfQuack = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numOfQuack++;
    }

    public static int getNumOfQuack() {
        return numOfQuack;
    }
}
