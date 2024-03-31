package iqro.mobil.testapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import iqro.mobil.testapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.textView2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_0))
        binding.textView3.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_250))
        binding.textView4.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelation_x_500))

        binding.button.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_2))

        binding.view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale))

        binding.editTextText.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.editTextText2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.editTextText3.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))

    }
}