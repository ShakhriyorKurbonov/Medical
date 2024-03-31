package iqro.mobil.testapp

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import iqro.mobil.testapp.databinding.ActivityRoyhatBinding

class RoyhatActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRoyhatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRoyhatBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.view3.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_0))
        binding.view5.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_0_right))
        binding.view6.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_0))
        binding.view9.startAnimation(AnimationUtils.loadAnimation(this,R.anim.transelate_x_0_right))

        binding.textView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView5.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView6.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView7.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView8.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView9.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView10.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView11.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView12.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView13.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView14.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView15.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView16.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView17.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView18.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView19.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView20.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView21.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView22.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView23.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView24.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView25.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView26.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))
        binding.textView27.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_alpha))

        binding.view2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale))

    }
}