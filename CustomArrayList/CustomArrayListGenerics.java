import java.util.Arrays;

public class CustomArrayListGenerics<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int index = 0;

    public CustomArrayListGenerics() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T input) {
        if (isFull()) {
            resize();
        }
        data[index++] = input;
    }

    private boolean isFull() {
        return index == data.length;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @SuppressWarnings("unchecked")
    public T remove() {
        if (index <= 0) {
            throw new IllegalStateException("Array is empty, nothing to remove.");
        }
        T deleted = (T) data[--index];
        data[index] = null;
        return deleted;
    }

    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i < index) {
            return (T) data[i];
        } else {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }
    }

    public int size() {
        return index;
    }

    public void print() {
        Object[] arrayToPrint = Arrays.copyOfRange(data, 0, index);
        System.out.println(Arrays.toString(arrayToPrint));
    }
}
