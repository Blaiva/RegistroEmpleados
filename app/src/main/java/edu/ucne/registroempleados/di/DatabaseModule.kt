package edu.ucne.registroempleados.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.registroempleados.data.database.EmpleadoDatabase
import edu.ucne.registroempleados.data.local.EmpleadoDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideEmpleadoDb(@ApplicationContext context: Context): EmpleadoDatabase
    {
        return Room.databaseBuilder(
            context, EmpleadoDatabase::class.java, "empleado_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideEmpleadoDao(database: EmpleadoDatabase): EmpleadoDao
    {
        return database.empleadoDao()
    }
}