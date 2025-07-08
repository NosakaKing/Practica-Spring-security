package com.nosaka.practica.domain.medico;

public record DatosListaMedicos(
        Long id,
        String nombre,
        String email,
        String documento,
        String telefono
) {
    public DatosListaMedicos(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEmail(), medico.getDocumento(), medico.getTelefono());
    }
}
