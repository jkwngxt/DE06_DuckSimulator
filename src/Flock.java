import java.util.ArrayList;
import java.util.List;
/**
 * @author 6510405377 Jitlada Yotinta
 */

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        //เพิ่มบรรทัดว่างเพื่อให้เห็นการร้องอย่างชัดเจน
        quackers.get(0).quack();
        System.out.println();
        quackers.get(0).quack();
        System.out.println();
        for (Quackable quackable : quackers) {
            quackable.quack();
            System.out.println();
        }
    }
}
