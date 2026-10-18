// Arv: KottatandeVaxt ärver från Plant.
public class KottatandeVaxt extends Plant implements Waterable {

    @Override
    public void calculateWater() {
        water = 0.1 + (0.2 * height);
    }
}