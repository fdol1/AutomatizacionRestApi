package com.lfpu.auto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class Foo {

    private String nombre;
    private String apellido;
    private String peso;
    private String edad;

    public Foo() {
        
    }
}