public class Main {
    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"), createObject("treeObject")};
        for (Printable printable:print){
            printable.print();
        }
    }
    public static Printable createObject(String className){
        switch (className){
            case "oneObject":
                Car car = new Car("BMW","black","hybrid","20.5");
                return car;
            case "twoObject":
                Airplane airplane = new Airplane("boing"," white","pessenjer","big");
                return airplane;
            case "treeObject":
                Boat boat = new Boat("polaris","red","water","true");
                return boat;
        }
        return null;
    }
}