package com.jptadros.jpsnewsnewyorktimes.database

import androidx.room.*
import com.jptadros.jpsnewsnewyorktimes.database.UserEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface UserDao {

    @Insert
    suspend fun insert(userEntity: UserEntity)

    @Update
    suspend fun update(userEntity: UserEntity)

    @Delete
    suspend fun delete(userEntity: UserEntity)

    @Query("SELECT * FROM `user-table`")
    fun fetchAllUsers(): Flow<List<UserEntity>>

    @Query("SELECT * FROM `user-table` WHERE id=:id")
    fun fetchUserByID(id:Int): Flow<List<UserEntity>>


}