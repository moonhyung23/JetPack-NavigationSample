package com.example.a220317_navigaion_bottom_1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.a220317_navigaion_bottom_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //class name {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //프래그먼트를 뛰울 ViewContainer를 가져온다.
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        //클릭한 BottomMenu에 해당하는 프래그먼트를 갖고온다.
        val navController = navHostFragment.findNavController()
        binding.bnMenu.setupWithNavController(navController)

    }
}