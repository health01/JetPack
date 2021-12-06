package com.kst.jetpack.data.repositories

import com.kst.jetpack.data.ToDoDao
import com.kst.jetpack.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class TodoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    fun getAllTask(): Flow<List<ToDoTask>> = toDoDao.getAllTask()

    fun sortByLowPriority(): Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()

    fun sortByHighPriority(): Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> = toDoDao.getSelectedTask(taskId)

    suspend fun addTask(toDoTask: ToDoTask) = toDoDao.addTask(toDoTask)

    suspend fun updateTask(toDoTask: ToDoTask) = toDoDao.updateTask(toDoTask)

    suspend fun deleteTask(toDoTask: ToDoTask) = toDoDao.deleteTask(toDoTask)

    suspend fun deleteAllTask() = toDoDao.deleteAllTask()
}