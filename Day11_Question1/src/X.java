public interface X {
    abstract void displyX();

    default void x1() {
        System.out.println("X1 from Class X");
    }

    static void x2() {
        System.out.println("X2 from Class X");
    }
}
