/**
 * @author 6510405377 Jitlada Yotinta
 */
public class QuackFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
}
