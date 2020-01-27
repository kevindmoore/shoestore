package com.udacity.shoestore


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.InstructionsBinding

class InstructionsFragment : Fragment() {


    lateinit var instructionsBinding: InstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        instructionsBinding = DataBindingUtil.inflate(inflater, R.layout.instructions, container, false)
        instructionsBinding.nextButton.setOnClickListener {
            findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
        }
        return instructionsBinding.root
    }




}
