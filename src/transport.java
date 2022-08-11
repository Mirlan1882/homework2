public class transport implements Printable {
    @Override
    public void print() {

    }

    private String model;
    private String color;
    private String type;



    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public transport ( String model, String color, String type) {

        this.model = model;
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;

    }
}
