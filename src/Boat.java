public class Boat extends transport{
    private String propeller;

    public String getPropeller() {
        return propeller;
    }

    @Override
    public void print() {
        System.out.println("Модель" + getModel() + "Цвет" + getColor() + "ТипТранспорта" + getType()+"Проппеллер"+ getPropeller());
    }

    public Boat(String model, String color, String type, String propeller) {
        super(model, color, type);
        this.propeller = propeller;
    }
}

