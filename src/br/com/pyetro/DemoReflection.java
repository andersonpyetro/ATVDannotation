package br.com.pyetro;

public class DemoReflection {
    public static void main(String[] args) {

        Class cName = NewClass.class;

        System.out.println(cName);

        NewClass c = new NewClass();
        Class cName1 = c.getClass();
        System.out.println(cName1);

    }
}
