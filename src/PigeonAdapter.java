/**
 * @author 6510405377 Jitlada Yotinta
 */
public class PigeonAdapter implements Quackable{
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
