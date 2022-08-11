public class Car extends transport {
    private String wheels;

    public String getWheels() {
        return wheels;
    }

    @Override
    public void print() {
        System.out.println("Модель" + getModel() + "Цвет" + getColor() + "ТипТранспорта" + getType() +"Колеса" + getWheels());
    }

    public Car(String model, String color, String type, String wheels) {
        super(model, color, type);
        this.wheels = wheels;
    }
}
