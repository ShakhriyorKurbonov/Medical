package iqro.mobil.testapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import iqro.mobil.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addImg.setOnClickListener {
            Intent(this,SecondActivity::class.java).apply {
                startActivity(this)
            }
        }

  binding.menuImg.setOnClickListener {
      Intent(this,RoyhatActivity::class.java).apply {
          startActivity(this)
      }
  }

        AnimationUtils.loadAnimation(this,R.anim.transelate_1).apply {
            binding.imageView2.startAnimation(this)
        }
        AnimationUtils.loadAnimation(this,R.anim.transelate_2).apply {
            binding.view4.startAnimation(this)
        }
        AnimationUtils.loadAnimation(this,R.anim.transelate_x_right).apply {
            binding.view7.startAnimation(this)
        }
        AnimationUtils.loadAnimation(this,R.anim.transelate_x_left).apply {
            binding.view8.startAnimation(this)
        }
        AnimationUtils.loadAnimation(this,R.anim.scale_alpha).apply {
            binding.menuImg.startAnimation(this)
        }
        AnimationUtils.loadAnimation(this,R.anim.scale_alpha).apply {
            binding.addImg.startAnimation(this)
        }




    }
}