package com.lfpu.auto.test;

import com.lfpu.auto.builders.FooBuilder;
import com.lfpu.auto.models.Foo;
import org.junit.Test;

public class Pruebas {

    @Test
    public void pruebaBuilder(){
        Foo foo2 = FooBuilder
                .withName("Pepito")
                .build();

        Foo foo3 = FooBuilder
                .withName("Pepito")
                .andAge(10)
                .andLastName("Rodriguez")
                .build();

        System.out.println(foo2.toString());
        System.out.println(foo3.toString());

        //Foo foo = FooBuilder
        //        .conNombre("anna")
        //        .yPeso("50kg")
        //        .yApellido("B")
        //        .build();

        // Foo foo2 = FooBuilder.conNombre("anna")
        //         .yPeso("50kg")
        //         .build();

        //System.out.println("datos" + foo.toString());
        // System.out.println("datos" + foo2.toString());
    }
}
