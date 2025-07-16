package problems;
public class tests {
    public static void main(String[] args) {
        FloorCeil floor = new FloorCeilBinarySearchImpl();
        Integer[] array = {1,3, 4, 6};

        System.out.println(floor.floor(array, 0 ));
    }
}
