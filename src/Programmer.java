import java.util.Objects;

public class Programmer {
    private final String position;
    private final int salary;

    protected Programmer(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Programmer that = (Programmer) o;

        if (salary != that.salary) return false;
        return Objects.equals(position, that.position);
    }
}