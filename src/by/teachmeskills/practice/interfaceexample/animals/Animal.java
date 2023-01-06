package by.teachmeskills.practice.interfaceexample.animals;

import java.util.Calendar;
import java.util.Objects;

public abstract class Animal {

    private final Integer animalId;
    private String name;
    private Calendar birthday;

    public Animal(Integer animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getAnimalId(), animal.getAnimalId()) &&
                Objects.equals(getName(), animal.getName()) &&
                Objects.equals(getBirthday(), animal.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnimalId(), getName(), getBirthday());
    }
}
