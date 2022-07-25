package com.jptadros.jpsnewsnewyorktimes.database

import android.graphics.Bitmap
import android.graphics.Picture
import android.media.Image
import android.net.Uri
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user-table")
data class UserEntity(

    @PrimaryKey(autoGenerate = true)
    val id:  Int = 0,
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val password: String = "",
    val userImageUri: String = ""


)
