/**
 * @author 6510405377 Jitlada Yotinta
 */
public class GooseAdapter implements Quackable{
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }


    @Override
    public void quack() {
        goose.honk();
    }
}
