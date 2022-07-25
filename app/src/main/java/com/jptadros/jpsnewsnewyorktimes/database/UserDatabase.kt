package com.jptadros.jpsnewsnewyorktimes.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jptadros.jpsnewsnewyorktimes.database.UserEntity
import com.jptadros.jpsnewsnewyorktimes.database.UserDao
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized


@Database(entities = [UserEntity::class], version = 1)

abstract class UserDatabase: RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object {

        @Volatile
        private var INSTANCE: UserDatabase? = null

        @InternalCoroutinesApi
        fun getInstance(context: Context): UserDatabase {

            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance= Room.databaseBuilder(
                        context.applicationContext, UserDatabase::class.java,
                    "user-database").fallbackToDestructiveMigration().build()

                    INSTANCE = instance
                }

                return instance

            }


        }




    }


}