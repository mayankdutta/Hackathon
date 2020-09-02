package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.trial.databinding.FragmentAfterRegistrationBinding

class After_registration : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_after_registration, container, false)
        val binding:FragmentAfterRegistrationBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_after_registration,container,false)
        binding.editinfo.setOnClickListener {view :View ->

            Navigation.findNavController(view).navigate(R.id.action_after_registration_to_servicer2)
        }
        return binding.root
    }


}