import org.junit.jupiter.api.Test;

class Chapter02Tests {
    @Test
    void logicalType() {
        boolean t = true;
        System.out.println(t);
    }

    @Test
    void characterType() {
        char a = 'a';
        char b = 65;
        char c = '\n';
        char d = '\u0000';

        System.out.println(a); // a
        System.out.println(b); // A
        System.out.println(c); //
        System.out.println(d); //  
    }

    @Test
    void integerType() {
        int a = 10;
        int b = 20;
        b = a; // 변수 a에 저장된 값을 변수 b에 저장
        System.out.println(a); // 10
        System.out.println(b); // 10
    }


    @Test
    void realType() {
        float a = 10.f; // 10.f = 10.0f
        float b = .1f; // .1f = 0.1f
        float c = 3.14e3f; // 3.14e3f = 3140.0f
        float d = 1e1f; // 1e1f = 10.0f;
        float e = 1e-3f; // 1e-3f = 0.001f;
        System.out.println(a); // 10.0
        System.out.println(b); // 0.1
        System.out.println(c); // 3140.0
        System.out.println(d); // 10.0
        System.out.println(e); // 0.001

        double f = 10.; // 10. = 10.0
        double g = .1; // .1 = 0.1
        double h = 3.14e3; // 3.14e3 = 3140.0
        double i = 1e1; // 1e1 = 10.0;
        double j = 1e-3; // 1e-3 = 0.001;
        System.out.println(f); // 10.0
        System.out.println(g); // 0.1
        System.out.println(h); // 3140.0
        System.out.println(i); // 10.0
        System.out.println(j); // 0.001
    }

    @Test
    void overFlow() {
        int INTEGER_MAX_VALUE = Integer.MAX_VALUE;
        int a = INTEGER_MAX_VALUE + 1;
        System.out.println(INTEGER_MAX_VALUE); // 2147483647
        System.out.println(a); // -2147483648

        double DOUBLE_MAX_VLAUE = Double.MAX_VALUE;
        double b = DOUBLE_MAX_VLAUE + 1.0;
        float c = (float) DOUBLE_MAX_VLAUE;
        System.out.println(DOUBLE_MAX_VLAUE); // 1.7976931348623157E308
        System.out.println(b); // 1.7976931348623157E308
        System.out.println(c); // Infinity
    }

    @Test
    void castingBetweenIntegerTypes() {
        // 큰타입에서 작은타입으로 변환
        int a = 300;
        byte b = (byte) a;
        System.out.println(b); // 44

        // 작은타입에서 큰타입으로 변환
        int x = 1224;
        Long y = (long) x;
        System.out.println(y); // 1224
    }

    @Test
    void castingBetweenRealTypes() {
        float f = 9.1234567f;
        double d1 = 9.1234567;
        double d2 = (double) f;

        System.out.println(f); // 9.123457
        System.out.println(d1); // 9.1234567
        System.out.println(d2); // 9.123456954956055
    }

    @Test
    void castingIntegerToReal() {
        int i = 91234567;
        float f = (int) i; // float는 약 7자리의 정밀도만을 제공하므로, int를 float로 변환할 때 정밀도 차이에 의한 오차가 발생할 수 있다.
        System.out.println(f); // 91234568
    }

    @Test
    void castingRealToInteger() {
        int i = 91234567;
        float f = (float) i;

        int i2 = (int) f;

        int i3 = (int) (double) i;

        float f2 = 1.666f;
        int i4 = (int) f2;

        System.out.println(i); // 91234567
        System.out.println(i2); // 91234568
        System.out.println(i3); // 91234567
        System.out.println(i4); // 1
    }

    @Test
    void promotion() {
        int a = 1;
        double b = 2.0;
        double c = a + b;
        System.out.println(c); // 3.0
    }
}
