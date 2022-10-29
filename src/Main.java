import Transport.Car;
import Transport.Car.Insurance;
import Transport.Car.Key;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("LADA", "Granta", 1.7, "желтый", 2015, "Россия", "МКПП", "Лифтбек", "А552ЮН102", 5, "Зима");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКПП", "Седан", "К152СН152", 5, "Лето");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "АКПП", "Купе", "С248КН716", 2, "Лето");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.0, "красный", 2018, "Южная Корея", "МКПП", "Универсал", "А523МН716", 5, "Лето");
        Car hyundai = new Car("Hyundai", "Avante", 2.4, "оранжевый", 2016, "Южная Корея", "МКПП", "Седан", "В526ВН102", 5, "Лето");
//        System.out.println(lada);
//        System.out.println(audi.toString());
//        System.out.println(bmw.toString());
//        System.out.println(kia.toString());
//        System.out.println(hyundai.toString());


        Car.Key ladaKey = lada.new Key("Нет", "Нет");
        lada.setKey(ladaKey);
//        System.out.println(lada);
        Car.Key audiKey = audi.new Key("Да", "Да");
        audi.setKey(audiKey);
//        System.out.println(audi);
        Car.Key bwmKey = bmw.new Key("Нет", "Да");
        bmw.setKey(bwmKey);
//        System.out.println(bmw);
        Car.Key kiaKey = kia.new Key("Да", "Нет");
        kia.setKey(kiaKey);
//        System.out.println(kia);
        Car.Key hyundaiKey = hyundai.new Key("", "Нет");
        hyundai.setKey(hyundaiKey);
//        System.out.println(hyundai);

        Car.Insurance ladaIns = lada.new Insurance("21.09.2022", 5002.25, "МММ256321" );
        lada.setInsurance(ladaIns);
        System.out.println(lada);
        Car.Insurance audiIns = audi.new Insurance("21.12.2022", 15035.25, "МCC256352" );
        audi.setInsurance(audiIns);
        System.out.println(audi);
        Car.Insurance bmwIns = bmw.new Insurance("15.05.2022", 15112.72, "МXX234444" );
        bmw.setInsurance(bmwIns);
        System.out.println(bmw);
        Car.Insurance kiaIns = kia.new Insurance("01.06.2022", 15102.50, "АВВ223546" );
        kia.setInsurance(kiaIns);
        System.out.println(kia);
        Car.Insurance hyundaiIns = hyundai.new Insurance("03.12.2022", 7856.25, "ВВВ256" );
        hyundai.setInsurance(hyundaiIns);
        System.out.println(hyundai);
        hyundaiIns.checkingTheNumber();
        hyundaiIns.checkingTheExpirationDate();
        bmwIns.checkingTheExpirationDate();
        lada.tyreService();
        audi.tyreService();

    }

}
