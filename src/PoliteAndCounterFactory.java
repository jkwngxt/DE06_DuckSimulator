/**
 * @author 6510405377 Jitlada Yotinta
 */
public class PoliteAndCounterFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new PoliteQuacker(new MallardDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteQuacker(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteQuacker(new RedheadDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new PoliteQuacker(new RedheadDuck());
    }
}
