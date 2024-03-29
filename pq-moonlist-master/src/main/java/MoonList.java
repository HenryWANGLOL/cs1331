import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Comparator;
public class MoonList implements Iterable<Moon> {

    private int size;
    private final int capacity;
    private Moon[] moonList;

    public MoonList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.moonList = new Moon[capacity];
    }

    public void add(Moon s) {
        if (size >= capacity) {
            throw new ArrayIndexOutOfBoundsException("List is full");
        }

        moonList[size++] = s;
    }

    public Moon get(int index) {
        return moonList[index];
    }

    public boolean isEmpty() {
        return 0 == size;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; ++i) {
            str += moonList[i].toString();
            str += "\n";
        }
        return str;
    }


    public void sortByName() {

        SortWrapper.sort(moonList, Comparator.comparing(Moon::getName));
    }


    public void sortByPlanet() {
        SortWrapper.sort(moonList, (Moon a, Moon b) -> {
                return a.getPlanet().ordinal() - b.getPlanet().ordinal();
            });

    }

    public Iterator<Moon> iterator() {
        return new MoonIterator();
    }

    private class MoonIterator implements Iterator<Moon> {

        private int cursor = 0;

        public boolean hasNext() {
            return cursor < size;
        }

        public Moon next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Moon nextElem = get(cursor++);
            return nextElem;
        }
    }
}
