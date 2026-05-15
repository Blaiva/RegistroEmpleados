package edu.ucne.registroempleados.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.registroempleados.data.local.EmpleadoDao
import edu.ucne.registroempleados.data.local.EmpleadoEntity

@Database(
    entities = [EmpleadoEntity::class],
    version = 1
)
abstract class EmpleadoDatabase: RoomDatabase() {
    abstract fun empleadoDao(): EmpleadoDao
}