package com.lfpu.auto.builders;

import com.lfpu.auto.models.Foo;

//Clase que construye un objeto de tipo Foo
public class FooBuilder {

    private String nombre;
    private String apellido;
    private String peso;
    private String edad;

    public FooBuilder(String nombre) {
        this.nombre = nombre;
    }
    //Sirve como punto de entrada para el builder
    public  static FooBuilder conNombre(String nombre){
        return new FooBuilder(nombre); //Retorna al mismo FooBulder entrando por el constructor de encima
    }
    //
    public FooBuilder yApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public FooBuilder yPeso(String peso){
        this.peso = peso;
        return this;
    }

    public FooBuilder yEdad(String edad){
        this.edad = edad;
        return this;
    }
    //Este metodo construye el objeto
    public Foo build(){
        return new Foo();
    }
}
