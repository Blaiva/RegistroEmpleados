package edu.ucne.registroempleados.domain.model

import kotlinx.datetime.LocalDate

data class Empleado(
    val empleadoId: Int = 0,
    val fechaIngreso: LocalDate,
    val nombres: String = "",
    val sexo: String = "",
    val sueldo: Double = 0.0
)
