package pl.sdacademy.java.advance.exercises.day3.task28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {
//    public SkipArrayList(Collection<? extends E> c) {
//        super(c);
//    }

    public SkipArrayList() {
    }

    public List<E> getEveryNthElement(int startIndex, int skip) {
        List<E> everyNthElement = new ArrayList<>();
        for(int currentIndex = startIndex; currentIndex < size(); currentIndex += skip + 1) {
            everyNthElement.add(get(currentIndex));
        }
        return everyNthElement;
    }
}
