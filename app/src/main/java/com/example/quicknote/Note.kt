package com.example.quicknote

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
class Note (
    @PrimaryKey(autoGenerate = true)
    var id: Int? = 0,
    @ColumnInfo(name = "title")
    var title: String? = "",
    @ColumnInfo(name = "description")
    var description: String? = ""
) {

}

