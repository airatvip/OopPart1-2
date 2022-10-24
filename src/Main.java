public class Main {
    public static void main(String[] args) {

        Car lada = new Car( "LADA", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car( "Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car( "BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car( "Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car( "Hyundai", "", 0, "оранжевый", 2016, "Южная Корея");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }

}
