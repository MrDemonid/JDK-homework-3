public class Main {

    public static void main(String[] args) {
        testCalculator();
        testCompareArrays();
        testPair();
    }


    private static void testCalculator()
    {
        System.out.println("Test calculator");

        float n = 192.0f;
        float m = 64.0f;
        System.out.printf("%s / %s = %s\n", n, m, Calculator.divide(n, m));

        int k = 1202;
        int l = 29;
        System.out.printf("%s + %s = %f\n", k, l, Calculator.sum(k, l));
    }

    private static void testCompareArrays()
    {
        System.out.println("\nTest compare arrays");
        Integer[] n = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 0};
        Integer[] m = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 0};
        Integer[] k = {1, 2, 3, 4, 5, 6, 7, 0 ,9, 8};
        Long[] l = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L ,9L, 0L};
        Long[] t = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L ,9L, 0L};
        Float[] f = {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f ,9f, 0f};

        Object[] o1 = {1, 2f, 3, 4, 5, 6, 7f, 0 ,9, 8d};
        Object[] o2 = {1, 2f, 3, 4, 5, 6, 7f, 0 ,9, 8d};
        Object[] o3 = {1, 2f, 3, 4, 5, 6, 7f, 0 ,9, 8};

        System.out.println(CmpArray.compareArrays(n, m));
        System.out.println(CmpArray.compareArrays(n, k));
        System.out.println(CmpArray.compareArrays(n, l));
        System.out.println(CmpArray.compareArrays(t, l));
        System.out.println(CmpArray.compareArrays(n, f));

        System.out.println(CmpArray.compareArrays(o1, o2));
        System.out.println(CmpArray.compareArrays(o1, o3));
    }

    private static void testPair()
    {
        System.out.println("\nTest Pair()");
        Pair<String, Integer> p1 = new Pair<>("Firts param", 2);
        Pair<Float, Character> p2 = new Pair<>(3.14f, 'N');
        System.out.println(p1);
        System.out.println(p2);
    }
}