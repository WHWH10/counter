package com.ejcho.counter

import android.app.Activity
import android.app.Application
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.ejcho.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.viewModel = viewModel
        // MainActivity Lifecycle 에 맞게 동작하도록 하겠다
        binding.lifecycleOwner = this
    }
}

//class MainActivity : AppCompatActivity() {
//    companion object {
//        val TAG = MainActivity::class.java.simpleName.toString()
//    }
//
//    private val viewModel by viewModels<MainViewModel>()
//
//    //    @RequiresApi(Build.VERSION_CODES.Q)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
//
////        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
//        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//
//        binding.viewModel = viewModel
//        // MainActivity Lifecycle 에 맞게 동작하도록 하겠다
//        binding.lifecycleOwner = this
//
////        val addButton = findViewById<Button>(R.id.add_button)
////        val subButton = findViewById<Button>(R.id.sub_button)
//
//        val addButton = binding.addButton
//        val subButton = binding.subButton
//
////        val countText = findViewById<TextView>(R.id.counter_text)
//        val countText = binding.counterText
//
//        // 데이터 바인딩 하면 쓸 필요 없음 : XML 에서 직접 값을 셋팅함
////        viewModel.countLiveData.observe(this@MainActivity, Observer { count ->
////            countText.text = "$count"
////
////        })
//
//        // 데이터 바인딩 하면 쓸 필요 없음
////        addButton.setOnClickListener {
//////            viewModel.count++
////            viewModel.increaseCount()
////        }
////
////        subButton.setOnClickListener {
//////            viewModel.count--
////            viewModel.decreaseCount()
////        }
//
////        registerActivityLifecycleCallbacks(object: Application.ActivityLifecycleCallbacks {
////            override fun onActivityPaused(activity: Activity) {
////                Log.d(TAG, "onActivityPaused")
////            }
////
////            override fun onActivityStarted(activity: Activity) {
////                Log.d(TAG, "onActivityStarted")
////            }
////
////            override fun onActivityDestroyed(activity: Activity) {
////                Log.d(TAG, "onActivityDestroyed")
////            }
////
////            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
////                Log.d(TAG, "onActivitySaveInstanceState")
////            }
////
////            override fun onActivityStopped(activity: Activity) {
////                Log.d(TAG, "onActivityStopped")
////            }
////
////            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
////                Log.d(TAG, "onActivityCreated")
////            }
////
////            override fun onActivityResumed(activity: Activity) {
////                Log.d(TAG, "onActivityResumed")
////            }
////        })
//    }
//}