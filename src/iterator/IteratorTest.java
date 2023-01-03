package iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ContainerImpl container = new ContainerImpl();
        Iterator iterator = container.getIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
