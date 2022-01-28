package com.example.roomdb_azhardwi_04.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
)