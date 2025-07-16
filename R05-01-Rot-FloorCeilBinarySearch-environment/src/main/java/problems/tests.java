package problems;
public class tests {
    public static void main(String[] args) {
        FloorCeil floor = new FloorCeilBinarySearchImpl();
        Integer[] array = {0, 0, 0};
        System.out.println(floor.floor(array,-1));
        System.out.println(floor.ceil(array,-1));
    }
}
