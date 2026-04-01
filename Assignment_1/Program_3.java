class WrapperDemo {

    void wrapperExample() {

        int num = 10;

        // Primitive to Object
        Integer obj = Integer.valueOf(num);

        // Object to Primitive
        int value = obj.intValue();

        System.out.println("Wrapper Object = " + obj);
        System.out.println("Primitive Value = " + value);
    }

    void stringExample() {

        String s1 = "Hello";
        s1.concat(" World");

        System.out.println("String (Immutable): " + s1);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");

        System.out.println("StringBuffer (Mutable): " + sb);
    }
}

public class Program_3
{
    public static void main(String args[]) {

        WrapperDemo obj = new WrapperDemo();

        obj.wrapperExample();
        obj.stringExample();
    }
}