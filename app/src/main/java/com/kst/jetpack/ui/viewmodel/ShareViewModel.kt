package com.kst.jetpack.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kst.jetpack.data.models.ToDoTask
import com.kst.jetpack.data.repositories.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShareViewModel @Inject constructor(private val repository: TodoRepository) : ViewModel() {

    private val _allTask = MutableStateFlow<List<ToDoTask>>(emptyList())
    val allTask: StateFlow<List<ToDoTask>> = _allTask

    fun getAllTask() {
        viewModelScope.launch {
            repository.getAllTask().collect {
                _allTask.value = it
            }
        }

    }
}