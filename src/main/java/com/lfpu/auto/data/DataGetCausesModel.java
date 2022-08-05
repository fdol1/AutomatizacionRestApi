package com.lfpu.auto.data;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
//@EqualsAndHashCode
@Data
@EqualsAndHashCode(exclude = {"edad"}) //Sirve para comparar excluyendo algun atributo de la clase
@Builder
public class DataGetCausesModel {

    //@Getter @Setter
    private String capacidad;
   // @Getter @Setter
    private String estadoRespuesta;
    private String edad;



}
