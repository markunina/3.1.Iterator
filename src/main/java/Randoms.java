import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public class IteratorImpl implements Iterator<Integer> {
        protected int counter = min;

        @Override
        public boolean hasNext() {
            return counter < max;
        }

        @Override
        public Integer next() {
            random = new Random();
            return random.nextInt(min, max);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorImpl();
    }
}
