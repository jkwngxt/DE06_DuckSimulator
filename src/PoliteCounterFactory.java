/**
 * @author 6510405377 Jitlada Yotinta
 */
public class PoliteCounterFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new PoliteCounter(new PoliteQuacker(new MallardDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteCounter(new PoliteQuacker(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteCounter(new PoliteQuacker(new RedheadDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new PoliteCounter(new PoliteQuacker(new RedheadDuck()));
    }
}
