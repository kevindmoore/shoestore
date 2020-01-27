package com.udacity.shoestore


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.LoginBinding
import com.udacity.shoestore.databinding.WelcomeBinding

class WelcomeFragment : Fragment() {

    lateinit var welcomeBinding: WelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        welcomeBinding = DataBindingUtil.inflate(inflater, R.layout.welcome, container, false)
        welcomeBinding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        }
        return welcomeBinding.root
    }


}
