public class Kangaroo extends Animal implements Noisable{

    private int numberOfChildren;

    public Kangaroo() {
    }

    public Kangaroo(int numberOfChildren){
        this.numberOfChildren = numberOfChildren;
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Kangorooo!!");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "numberOfChildren=" + numberOfChildren +
                ", weight=" + weight +
                '}';
    }
}
