import java.io.Serializable;
import java.util.List;

public class Animal implements Noisable, Serializable{
    protected int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public <T extends Animal> void makeNoise(T someAnimal, T someAnimal2){
        System.out.println(someAnimal + "+" + someAnimal2);
        someAnimal.makeSomeNoise();
    }

    public void makeNoise2(List<? super Animal> animals, List<? extends Animal> animals2){
        System.out.println(animals);
        System.out.println(animals2);
    }

    @Override
    public void makeSomeNoise() {

    }
}
