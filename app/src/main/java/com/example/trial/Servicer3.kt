package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.trial.databinding.FragmentServicer3Binding

class Servicer3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_servicer3, container, false)
        val binding :FragmentServicer3Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_servicer3,container,false)
        binding.login.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_servicer3_to_servicer1)
        }
        return binding.root
    }


}