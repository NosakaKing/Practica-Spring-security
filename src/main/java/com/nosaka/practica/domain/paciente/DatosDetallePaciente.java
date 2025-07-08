package com.nosaka.practica.domain.paciente;

import com.nosaka.practica.domain.direccion.Direccion;

public record DatosDetallePaciente(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documentoIdentidad,
        Direccion direccion
) {
    public DatosDetallePaciente (Paciente paciente) {
        this (
                paciente.getId(),
                paciente.getNombre(),
                paciente.getEmail(),
                paciente.getTelefono(),
                paciente.getDocumento_identidad(),
                paciente.getDireccion()

        );
    }
}
