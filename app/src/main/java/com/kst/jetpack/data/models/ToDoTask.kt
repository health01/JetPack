package com.kst.jetpack.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kst.jetpack.util.Constants

@Entity(tableName = Constants.DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)