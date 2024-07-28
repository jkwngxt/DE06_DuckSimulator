public class PoliteCounter implements Quackable{
    Quackable quackable;
    static int numOfQuack = 0;

    public PoliteCounter(Quackable quackable) {
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
