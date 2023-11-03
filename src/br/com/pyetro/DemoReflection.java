package br.com.pyetro;

import java.lang.annotation.Annotation;

public class DemoReflection {
    public static void main(String[] args) {

        Class aName = NewClass.class;

        Annotation[] annotations = aName.getAnnotations();

        for(Annotation annotation : annotations){
            if(annotation instanceof Tabela){
                Tabela tabela = (Tabela) annotation;
                System.out.println("name: " + tabela.nome());
            }
        }

    }
}
