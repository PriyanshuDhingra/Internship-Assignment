public class MyList<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public MyList() {
        data = (T[]) new Object[100];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        @SuppressWarnings("unchecked")
        T[] newData = (T[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    public void deleteByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                deleteByIndex(i);
                return;
            }
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        return data[index];
    }

    public int size() {
        return size;
    }
}

