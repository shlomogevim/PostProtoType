package com.sg.post11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.github.florent37.viewanimator.ViewAnimator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dur=500L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        backgroundImage.load(R.drawable.struggle)
        preAnimation()
        backgroundImage.setOnClickListener {
            makeAnimation()
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

    private fun preAnimation() {
        ViewAnimator
           .animate(ot43,ot44,ot45,ot46,ot47,ot48,ot50,ot53,ot54,ot55,ot56,ot57,ot58,ot59,ot59,ot60,ot61,ot62,ot63)
            .alpha(0f)
            .duration(1)
            .start()
    }




}