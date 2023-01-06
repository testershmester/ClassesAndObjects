package by.teachmeskills.practice.interfaceexample.animals;

import java.util.Objects;

public class Cat extends Animal {

    private String eyesColor;

    public Cat(Integer animalId) {
        super(animalId);
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(getEyesColor(), cat.getEyesColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEyesColor());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "animalId=" + super.getAnimalId() +
                ", name='" + super.getName() + '\'' +
                ", birthday=" + super.getBirthday() + '\'' +
                ", eyesColor='" + getEyesColor() + '\'' +
                '}';
    }

    @Override
    protected Cat clone() {
        Cat clone = new Cat(super.getAnimalId());
        clone.setName(super.getName());
        clone.setBirthday(super.getBirthday());
        clone.setEyesColor(this.eyesColor);
        return clone;
    }
}
