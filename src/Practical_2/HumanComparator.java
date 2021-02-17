package Practical_2;
import java.util.Comparator;

public class HumanComparator implements Comparator<Human>{

    public int compare(Human a, Human b){
        return a.getBirthDate().compareTo(b.getBirthDate());
    }
}
