package com.github.rogerp91.basicwskt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_base.*

abstract class Base : AppCompatActivity() , Print {

    private val TAG : String =  "BASIC_KT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        main()
    }

    abstract fun main()

    override fun all(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                console(it)
                device(it)
                toast(it)
            }
        }
    }

    override fun console(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                Log.i(TAG, text)
            }
        }
    }

    override fun device(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                text_view.text = text
            }
        }
    }

    override fun toast(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                Toast.makeText(this, text, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun logi(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                Log.i(TAG, text)
            }
        }
    }

    override fun loge(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                Log.e(TAG, text)
            }
        }
    }

    override fun logd(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                Log.d(TAG, text)
            }
        }
    }

    override fun logv(text: String?) {
        text?.let {
            if(!TextUtils.isEmpty(it)){
                Log.v(TAG, text)
            }
        }
    }
}
