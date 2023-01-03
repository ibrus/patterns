package iterator;

public class ContainerImpl implements Container{

    String [] arr = {"Max", "john", "Michael"};

    @Override
    public Iterator getIterator() {
        return new ContainerIterator();
    }

    class ContainerIterator implements Iterator{
        int index;


        @Override
        public boolean hasNext() {
            return index < arr.length;
        }

        @Override
        public Object next() {
            if(hasNext()) return arr[index++];
            else return null;
        }
    }
}
