package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.trial.databinding.FragmentFrontPageBinding

class Front_page : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentFrontPageBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_front_page,container,false)
        binding.login.setOnClickListener {view :View ->

            Navigation.findNavController(view).navigate(R.id.action_front_page_to_types_of_services)
        }
        binding.fb.setOnClickListener { view:View ->
            Navigation.findNavController(view).navigate(R.id.action_front_page_to_register_account)
        }
        return binding.root
    }

    }