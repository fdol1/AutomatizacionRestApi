package com.lfpu.auto.test;

import com.lfpu.auto.builders.FooBuilder;
import com.lfpu.auto.models.Foo;
import org.junit.Test;

public class Pruebas {

    @Test
    public void pruebaBuilder(){

        Foo foo = FooBuilder.conNombre("anna")
                .yPeso("50kg")
                .yApellido("B")
                .build();

        Foo foo2 = FooBuilder.conNombre("anna")
                .yPeso("50kg")
                .build();

        System.out.println("datos" + foo.toString());
        System.out.println("datos" + foo2.toString());
    }
}
