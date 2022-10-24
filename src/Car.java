public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else this.color = color;

        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;

        if (country == null || country.isEmpty()){
            this.country = "default";
        } else this.country = country;
    }

    public String toString() {
        return brand + " " + model + ". Год выпуска -  " + year + ". Сборка: " + country + ", " + "цвет кузова: " + color + ". Объем двигателя: " + engineVolume;
    }
}
