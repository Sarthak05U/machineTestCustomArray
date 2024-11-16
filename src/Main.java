public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> d1 = new DynamicArray<Integer>();
        d1.addElements( new Integer[]{10,20,30,40,50,60,70,80});
        d1.display();
        d1.removeElements(4);
        d1.display();

        System.out.println();

        DynamicArray <Integer> d2 = new DynamicArray<Integer>();
        d2.addElements( new Integer[]{10,20,30,40,50,60,70,80,90,100,110,120});
        d2.display();
    }
}