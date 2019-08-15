class myClass {
    public static void main(String[] args) {
        System.out.println("I");
        hello();
    }
    static void hello2() {
        System.out.println("Programming");
    }
    static void hello() {
        System.out.println("Love");
        hello2();
    }
}