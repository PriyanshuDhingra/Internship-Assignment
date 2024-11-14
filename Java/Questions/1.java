public class MyList {
    private int[] data;
    private int size;

    public MyList() {
        data = new int[100];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                deleteByIndex(i);
                return;
            }
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        return data[index];
    }

    public int size() {
        return size;
    }
}

