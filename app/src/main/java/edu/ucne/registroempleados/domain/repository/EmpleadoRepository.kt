package edu.ucne.registroempleados.domain.repository

import edu.ucne.registroempleados.domain.model.Empleado
import kotlinx.coroutines.flow.Flow

interface EmpleadoRepository {
    fun observeEmpleados(): Flow<List<Empleado>>
    suspend fun getEmpleado(id: Int): Empleado?
    suspend fun upsert(empleado: Empleado): Int
    suspend fun delete(id: Int)
    suspend fun exists(id: Int): Boolean
}