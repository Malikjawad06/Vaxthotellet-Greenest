
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Kaktus igge = new Kaktus();
        igge.name = "Igge";
        igge.type = PlantType.KAKTUS;
        igge.height = 0.2;

        Palm laura = new Palm();
        laura.name = "Laura";
        laura.type = PlantType.PALM;
        laura.height = 5.0;

        KottatandeVaxt meatloaf = new KottatandeVaxt();
        meatloaf.name = "Meatloaf";
        meatloaf.type = PlantType.KOTTATANDE_VAXT;
        meatloaf.height = 0.7;

        Palm olof = new Palm();
        olof.name = "Olof";
        olof.type = PlantType.PALM;
        olof.height = 1.0;

        // Polymorfism: samma metod anropas för olika växttyper.
        Waterable[] plantsToWater = {igge, laura, meatloaf, olof};

        for (Waterable plant : plantsToWater) {
            plant.calculateWater();
        }

        Liquid iggesLiquid = new Liquid();
        iggesLiquid.name = "Mineralvatten";
        iggesLiquid.amount = igge.water;
        igge.liquid = iggesLiquid;

        Liquid laurasLiquid = new Liquid();
        laurasLiquid.name = "Kranvatten";
        laurasLiquid.amount = laura.water;
        laura.liquid = laurasLiquid;

        Liquid meatloafLiquid = new Liquid();
        meatloafLiquid.name = "Proteindryck";
        meatloafLiquid.amount = meatloaf.water;
        meatloaf.liquid = meatloafLiquid;

        Liquid olofsLiquid = new Liquid();
        olofsLiquid.name = "Kranvatten";
        olofsLiquid.amount = olof.water;
        olof.liquid = olofsLiquid;

        String plantName = JOptionPane.showInputDialog(
                null, "Vilken växt vill du vattna?"
        );

        // Avbryt eller stängd ruta: avsluta utan fel.
        if (plantName == null) {
            return;
        }

        // Kontrollera om användaren skrev något.
        if (plantName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "Du måste skriva ett växtnamn."
            );
        } else if (plantName.equalsIgnoreCase("Igge")) {
            igge.printInfo();
        } else if (plantName.equalsIgnoreCase("Laura")) {
            laura.printInfo();
        } else if (plantName.equalsIgnoreCase("Meatloaf")) {
            meatloaf.printInfo();
        } else if (plantName.equalsIgnoreCase("Olof")) {
            olof.printInfo();
        } else {
            JOptionPane.showMessageDialog(
                    null, "Växten finns inte."
            );
        }
    }
}
