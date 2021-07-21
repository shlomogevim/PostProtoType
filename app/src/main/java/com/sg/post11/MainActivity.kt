package com.sg.post11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import coil.load
import com.github.florent37.viewanimator.AnimationBuilder
import com.github.florent37.viewanimator.ViewAnimator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dur = 1000L
    lateinit var views: ArrayList<TextView>
    var selector=0
    val k="stam"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createArray()


        backgroundImage.load(R.drawable.struggle)
        preAnimation()
        backgroundImage.setOnClickListener {
            //makeAnimation()
           if (selector==0) {
               makeAnim()
               selector = 1
           } else{
               postAnim()
           }
        }

    }

    private fun makeAnim() {
        for (i in 0..views.size-1){
          ViewAnimator
                .animate(views[i])
                .alpha(1f)
                .duration(dur )
              .startDelay((500* i).toLong())
              .start()
        }

    }
    private fun postAnim() {
        for (i in 0..views.size-1){
            ViewAnimator
                .animate(views[i])
                .alpha(0f)
                .duration(dur )
                .startDelay((200* i).toLong())
                .start()
        }

    }

    private fun createArray() {
        views= arrayListOf(ot43,ot44,ot45,ot46,ot47,ot48,ot50,ot53,ot54,ot55,ot56,ot57,ot58,ot59,ot60,ot61,ot62,ot63)
    }




    private fun preAnimation() {
        for (i in 0..views.size-1){
            ViewAnimator
                .animate(views[i])
                .alpha(0f)
                .duration(1)
                .start()
        }

    }
















    private fun makeAnimation() {
        ViewAnimator
            .animate(ot43)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot44)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot45)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot46)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot47)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot48)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot50)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot53)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot54)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot55)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot56)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot57)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot58)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot59)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot60)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot61)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot62)
            .alpha(1f)
            .duration(dur)
            .thenAnimate(ot63)
            .alpha(1f)
            .duration(dur)
            .start()
    }

}