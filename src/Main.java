import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       Stream.of(array).map(v->v*v ).filter(c->c%2==0).forEach(b -> System.out.println(b));
      Optional<Integer>optional = Stream.of(array).max((x,y)->Integer.compare(x,y));
      System.out.println(optional);
        }
    }
