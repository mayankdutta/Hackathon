package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.trial.databinding.FragmentSignUpBinding


class Sign_up : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_sign_up, container, false)
        val binding : FragmentSignUpBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up,container,false)

        binding.login.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_sign_up_to_after_registration)
        }
        return binding.root
    }


}