public class List {
    final int MAX_SIZE = 5;
    private int[] array = new int[MAX_SIZE];
    private int size;
    public int size() {
        return size;
    }

    public void add(int element) {
        array[size++] = element;
    }

    public void remove(int element) {
        for(int index = 0; index < MAX_SIZE; index++){
            if(array[index] == element)
                size--;
        }
    }
}
