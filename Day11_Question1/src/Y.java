public interface Y {
    abstract void displyY();

    default void y1() {
        System.out.println("Y1 from Class Y");
    }

    static void y2() {
        System.out.println("Y2 from Class Y");
    }
}
