import java.util.Objects;

/**
 * Абстрактный класс. Является родительским классом для всех видов транспорта. Реализует интерфейс Comparable
 */
public abstract class Transport implements Comparable<Transport> {
String model;

public Transport(String model){
    this.model = model;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }
    @Override
    public int compareTo(Transport o) {
        return this.model.compareTo(o.model);
    }

    @Override
    public String toString() {
        return model;
    }
}
