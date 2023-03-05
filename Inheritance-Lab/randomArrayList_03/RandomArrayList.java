package randomArrayList_03;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    //getRandomElement(): Object    /
    public Object getRandomElement(){
        Random random = new Random();
        Object o = this.get(random.nextInt(this.size()));
        this.remove(o);
        return o;
    }
}
