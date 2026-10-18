public class Plant {
    String name;
    double height;
    double water;
    Liquid liquid;
    PlantType type;

    public void printInfo() {
        String info = "Växt: " + name
                + "\nTyp: " + type
                + "\nVätska: " + liquid.name
                + "\nMängd: " + liquid.amount + " liter";

        javax.swing.JOptionPane.showMessageDialog(null, info);
    }
}
