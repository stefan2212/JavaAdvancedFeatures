public class Car {
    private Model model;
    private Integer year;
    private String color;

    public Car(final Model model, final Integer year, final String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(final Model model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(final Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
