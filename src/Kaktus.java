// Arv: Kaktus ärver egenskaper från Plant.
public class Kaktus extends Plant implements Waterable {

    @Override
    public void calculateWater() {
        water = 0.02;
    }
}