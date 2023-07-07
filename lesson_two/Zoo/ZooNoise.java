package Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooNoise {
    private List<Speakable> speakables;

    public ZooNoise() {
        speakables = new ArrayList<>();
        speakables.add(new Dog());
        speakables.add(new Cat());
        speakables.add(new Radio());
    }

    public void speakAll() {
        for (Speakable speakable : speakables) {
            speakable.speak();
        }
    }

}