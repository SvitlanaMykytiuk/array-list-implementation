public class ArrayListImplementation {

    private int[] array;
    private int size;

    public ArrayListImplementation(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (array.length == size) {
            grow();
        }

        array[size] = element;
        size++;
    }

    public void add(int index, int element) {
        if (index > size || index < 0) {
            System.out.println("Неверно введен индекс");
        }
        if (array.length == size) {
            grow();
        }
        if (index == size) {
            array[size] = element;
            size++;
        }
        if (index > 0 && index < size) {
            int[] newArray = new int[size + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = element;
            for (int i = index; i < size; i++) {
                newArray[i + 1] = array[i];
            }
            size++;

            array = newArray;
        }
    }

    private void grow() {
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int size() {
        return size;
    }

    public String toPrint() {
        String print = "";

        if (size == 0) {
            print = "[]";
        }

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                print = print + "[" + array[i];
            } else if (i == size - 1) {
                print = print + ", " + array[i] + "]";
            } else {
                print = print + ", " + array[i];
            }
        }
        return print;
    }

    public void remove(int index) {
        int[] newArray = new int[size];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i <= size; i++) {
            newArray[i - 1] = array[i];
        }
        size--;
        array = newArray;
    }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
