package com.lfpu.auto.builders;

import com.lfpu.auto.models.Foo;

//Clase que construye un objeto de tipo Foo
public class FooBuilder {


    private String name;
    private String lastName;
    private String email;
    private int age;

    public FooBuilder(String name) {
        this.name = name;
        this.lastName = "defaultLastnName";
        this.email = "defaultEmail";
        this.age = 50;
    }

    public static FooBuilder withName(String name){
        return new FooBuilder(name);
    }

    public FooBuilder andLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public FooBuilder andEmail(String email){
        this.email = email;
        return this;
    }

    public FooBuilder andAge(int age){
        this.age = age;
        return this;
    }

    public Foo build(){
        return new Foo(name, lastName, email, age);
    }

    /*
    private String nombre;
    private String apellido;
    private String peso;
    private String edad;

    public FooBuilder(String nombre) {
        this.nombre = nombre;
        this.apellido = "por defecto";
        this.peso = "por defecto";
        this.edad = edad;
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
        return new Foo(nombre,apellido,peso,edad);
    }
    */
}
