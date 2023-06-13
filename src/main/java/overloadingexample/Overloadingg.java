package overloadingexample;

public class Overloadingg {
    public static void main(String[] args) {
    }
}
        class Add {
            public float sum(int a, float b) {
                return a + b;
            }

            public double sum(float a, double c) {
                return a + c;
            }
        }

        class SecondAdd {
            public float sum(int a, float b) {
                return a + b;
            }

            public float sum(float a, int b) {
                return a + b;
            }
}