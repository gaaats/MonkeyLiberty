package com.fungames.battletank.accctiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Toast
import androidx.core.view.MotionEventCompat
import com.fungames.battletank.R

class GyyymyActivity : AppCompatActivity() {

//    private val gestDetector by lazy {
//        GestureDetectorCompat(this,
//            GestureListener(this)
//        )
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gyyymy)

    }

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        gestDetector.onTouchEvent(event!!)
//        return super.onTouchEvent(event)
//    }

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        val action = MotionEventCompat.getActionMasked(event)
//
//        return when(action){
//            MotionEvent.ACTION_UP ->{
//                Toast.makeText(this, "ACTION_UP", Toast.LENGTH_SHORT).show()
//                Log.d("loo", "Action is ACTION_UP")
//                Log.d("loo", "Event is ${event}")
//                true
//            }
//            MotionEvent.ACTION_DOWN ->{
//                Toast.makeText(this, "ACTION_UP", Toast.LENGTH_SHORT).show()
//                Log.d("loo", "Action is ACTION_DOWN")
//                true
//            }
//            MotionEvent.ACTION_MOVE ->{
//                Toast.makeText(this, "ACTION_MOVE", Toast.LENGTH_SHORT).show()
//                Log.d("loo", "Action is ACTION_MOVE")
//                Log.d("loo", "Event is ${event}")
//                true
//            }
//            MotionEvent.ACTION_CANCEL->{
//                Toast.makeText(this, "ACTION_CANCEL", Toast.LENGTH_SHORT).show()
//                Log.d("loo", "Action is ACTION_CANCEL")
//                true
//            }
//            MotionEvent.ACTION_OUTSIDE ->{
//                Toast.makeText(this, "ACTION_OUTSIDE", Toast.LENGTH_SHORT).show()
//                Log.d("loo", "Action is ACTION_OUTSIDE")
//                true
//            }
//            else -> {
//                super.onTouchEvent(event)
//            }
//
//        }
//    }

//    class GestureListener(val conteeeext: Context): GestureDetector.SimpleOnGestureListener(){
//        override fun onSingleTapUp(e: MotionEvent?): Boolean {
//            Toast.makeText(conteeeext, "onSingleTapUp", Toast.LENGTH_SHORT).show()
//            return super.onSingleTapUp(e)
//        }
//
//        override fun onFling(
//            e1: MotionEvent?,
//            e2: MotionEvent?,
//            velocityX: Float,
//            velocityY: Float
//        ): Boolean {
//            Toast.makeText(conteeeext, "onFling", Toast.LENGTH_SHORT).show()
//            return super.onFling(e1, e2, velocityX, velocityY)
//        }
//
//        override fun onDoubleTap(e: MotionEvent?): Boolean {
//            Toast.makeText(conteeeext, "onDoubleTap", Toast.LENGTH_SHORT).show()
//            return super.onDoubleTap(e)
//        }
//
//    }
}