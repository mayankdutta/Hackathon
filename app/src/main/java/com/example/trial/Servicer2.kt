package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.trial.databinding.FragmentServicer2Binding


class Servicer2 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_servicer2, container, false)
        val binding :FragmentServicer2Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_servicer2,container,false)

        binding.button.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_servicer2_to_servicer3)
        }
        return binding.root
    }


}