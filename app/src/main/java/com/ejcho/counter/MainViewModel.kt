package com.ejcho.counter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val handle: SavedStateHandle) : ViewModel() {

    // UI 변경되는 상태
//    private var count: Int = 0
    private var count = handle.get<Int>("count") ?: 0

    set(value) {
        field = value
        countLiveData.value = value
        handle.set("count", value)
    }

    val countLiveData = MutableLiveData<Int>()

    fun increaseCount() {
        count++
//        countLiveData.value = count
    }

    fun decreaseCount() {
        count--
//        countLiveData.value = count
    }
}