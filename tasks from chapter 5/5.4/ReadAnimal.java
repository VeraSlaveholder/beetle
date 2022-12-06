package Task54;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class ReadAnimal {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals = null;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Integer numAnimals = ois.readInt();
            animals = new Animal[numAnimals];
            for (int i = 0; i < numAnimals; i++) {
                animals[i] = (Animal) ois.readObject();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }
}
