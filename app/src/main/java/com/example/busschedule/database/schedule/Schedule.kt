package com.example.busschedule.database.schedule

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NonNls

@Entity
data class Schedule(
    @PrimaryKey val id: Int,
    @NonNls @ColumnInfo(name = "stop_name") val stopName: String,
    @NonNls @ColumnInfo(name = "arrival_time") val arrivalTime: Int,
)
