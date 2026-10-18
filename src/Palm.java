// Arv: Palm ärver egenskaper från Plant.
public class Palm extends Plant implements Waterable {

    @Override
    public void calculateWater() {
        water = 0.5 * height;
    }
}