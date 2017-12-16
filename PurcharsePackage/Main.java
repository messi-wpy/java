package PurcharsePackage;

public class Main {
    public static void main(String[] args) {
        Purchase muxi = new Purchase();
        muxi.readInput();
        System.out.println("UnitCost "+muxi.getUnitCost());
        System.out.println("TotalCost "+muxi.getTotalCost());
    }
}
