package com.example.trial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.trial.databinding.FragmentCustomerInfoBinding


class Customer_info : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      val binding:FragmentCustomerInfoBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_customer_info,container,false)
        return binding.root
        //  return inflater.inflate(R.layout.fragment_customer_info, container, false)
    }

}