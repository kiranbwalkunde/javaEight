package javaeight;

public class JavaEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        First first = (a, b) -> {
            System.out.println(a + b);
        };
        first.add(10, 20);
    }

}

interface First {

    public void add(int a, int b);
}
