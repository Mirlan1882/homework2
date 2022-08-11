public class Airplane extends transport{
    private String wings;

    public String getWings() {
        return wings;
    }

    @Override
    public void print() {
        System.out.println("Модель" + getModel() + "Цвет" + getColor() + "ТипТранспорта" + getType() + "Крыля" + getWings());
    }

    public Airplane(String model, String color, String type, String wings) {
        super(model, color, type);
        this.wings = wings;
    }
}
