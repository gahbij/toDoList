package com.example.todolist

import android.app.Application

class todoApplication: Application() {

    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepo(database.taskItemDao()) }

}