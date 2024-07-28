/**
 * @author 6510405377 Jitlada Yotinta
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulator();
    }

    private void simulator() {

        System.out.println("Simulate Part 1 Adapter");
        Quackable duckCall1 = new DuckCall();
        Quackable mallardDuck1 = new MallardDuck();
        Quackable redheadDuck1 = new RedheadDuck();
        Quackable rubberDuck1 = new RubberDuck();
        Quackable goose1 = new GooseAdapter(new Goose());
        Quackable pigeon1 = new PigeonAdapter(new Pigeon());

        simulate(duckCall1);
        simulate(mallardDuck1);
        simulate(redheadDuck1);
        simulate(rubberDuck1);
        simulate(goose1);
        simulate(pigeon1);

        System.out.println("Simulate Part 2 Decorator");
        Quackable mallardDuck2 = new QuackCounter(new MallardDuck());
        Quackable rubberDuck2 = new QuackCounter(new RubberDuck());
        Quackable redheadDuck2 = new QuackCounter(new RedheadDuck());
        System.out.println("Count duck: " + QuackCounter.getNumOfQuack());
        simulate(mallardDuck2);
        simulate(redheadDuck2);
        simulate(rubberDuck2);
        System.out.println();

        Quackable duckCall2 = new PoliteCounter(new PoliteQuacker(new DuckCall()));
        Quackable pigeon2 = new PoliteCounter(new PoliteQuacker(new PigeonAdapter(new Pigeon())));
        Quackable goose2 = new PoliteCounter(new PoliteQuacker(new GooseAdapter(new Goose())));
        simulate(duckCall2);
        simulate(pigeon2);
        simulate(goose2);
        System.out.println("Count Polite: " + PoliteCounter.getNumOfQuack());
        System.out.println();


        System.out.println("Simulate Part 3 Abstract Factory");
        AbstractDuckFactory duckFactory = new DuckFactory();
        Quackable duckCall3DF = duckFactory.createDuckCall();
        Quackable mallardDuck3DF = duckFactory.createMallardDuck();
        Quackable redheadDuck3DF = duckFactory.createRubberDuck();
        Quackable rubberDuck3DF = duckFactory.createRubberDuck();
        System.out.println("Simulate Part 3 : Duck Factory");
        simulate(duckCall3DF);
        simulate(mallardDuck3DF);
        simulate(redheadDuck3DF);
        simulate(rubberDuck3DF);

        AbstractDuckFactory counterFactory = new QuackCounterFactory();
        Quackable duckCall3CF = counterFactory.createDuckCall();
        Quackable mallardDuck3CF = counterFactory.createMallardDuck();
        Quackable redheadDuck3CF = counterFactory.createRubberDuck();
        Quackable rubberDuck3CF = counterFactory.createRubberDuck();
        System.out.println("Simulate Part 3 : Counter Factory");
        simulate(duckCall3CF);
        simulate(mallardDuck3CF);
        simulate(redheadDuck3CF);
        simulate(rubberDuck3CF);
        System.out.println("Count duck: " + QuackCounter.getNumOfQuack());
        System.out.println();

        AbstractDuckFactory politeAndCounterFactory = new PoliteCounterFactory();
        Quackable duckCall3CP = politeAndCounterFactory.createDuckCall();
        Quackable mallardDuck3CP = politeAndCounterFactory.createMallardDuck();
        Quackable redheadDuck3CP = politeAndCounterFactory.createRubberDuck();
        Quackable rubberDuck3CP = politeAndCounterFactory.createRubberDuck();
        System.out.println("Simulate Part 3 : Polite Counter Factory");
        simulate(duckCall3CP);
        simulate(mallardDuck3CP);
        simulate(redheadDuck3CP);
        simulate(rubberDuck3CP);
        System.out.println("Count Polite Duck: " + PoliteCounter.getNumOfQuack());
        System.out.println();

        System.out.println("Simulate Part 4 Composition");
        Flock flock = new Flock();
        flock.add(mallardDuck1);
        flock.add(redheadDuck1);
        flock.add(rubberDuck1);
        flock.add(goose1);
        flock.add(pigeon1);

        flock.add(mallardDuck2);
        flock.add(redheadDuck2);
        flock.add(rubberDuck1);

        simulate(flock);

    }

    void simulate(Quackable quackable) {
        quackable.quack();
        System.out.println(); //เพื่อแยกแต่ละเสียงร้องให้ชัดเจน
    }


}
