package com.nosaka.practica.domain.direccion;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String complemento;
    private String ciudad;
    private String barrio;
    private String codigoPostal;
    private String estado;

    public Direccion(DatosDireccion datosDireccion) {
        this.calle = datosDireccion.calle();
        this.numero = datosDireccion.numero();
        this.complemento = datosDireccion.complemento();
        this.ciudad = datosDireccion.ciudad();
        this.barrio = datosDireccion.barrio();
        this.codigoPostal = datosDireccion.codigo_postal();
        this.estado = datosDireccion.estado();
    }

    public void actualizarDireccion(DatosDireccion datos) {
        if(datos.calle() != null) {
            this.calle = datos.calle();
        }
        if(datos.numero() != null) {
            this.numero = datos.numero();
        }
        if(datos.complemento() != null) {
            this.complemento = datos.complemento();
        }
        if(datos.ciudad() != null) {
            this.ciudad = datos.ciudad();
        }
        if(datos.barrio() != null) {
            this.barrio = datos.barrio();
        }
        if(datos.estado() != null) {
            this.estado = datos.estado();
        }
        if (datos.codigo_postal() != null) {
            this.codigoPostal = datos.codigo_postal();
        }

    }
}

