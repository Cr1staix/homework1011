import java.util.Objects;

public class Car extends Transport {
    String color;
    Integer year;
    public Car(String model, String color, Integer year){
        super(model);
        this.color = color;
        this.year = year;
    }
    @Override
    public String toString() {
        return  super.toString() + " " +  color + " " +  year;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, year);
    }


    /**
     * Метод сортирует список по Модели, году выпуска, цвету.
     * @param o Принимает параметр типа Транспорт и приводит его к типу Машина.
     * @return возвращает int значение для сортировки.
     */
    @Override
    public int compareTo(Transport o) {
        Car otherCar = (Car) o;
        int c = super.compareTo(otherCar);
        if(c == 0){
            c = Integer.compare(otherCar.year, this.year);
            if(c == 0){
                c = this.color.compareTo(otherCar.color);
            }
        }
        return c;
    }
}


