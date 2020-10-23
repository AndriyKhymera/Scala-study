import java.util.Comparator;

public class WeightComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Cat) || !(o2 instanceof Cat)){
            return 0;
        }
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;

        if (cat1.getWeight() > cat2.getWeight()){
            return 1;
        };
        if (cat1.getWeight() < cat2.getWeight()){
            return -1;
        }

        return 0;
    }
}
