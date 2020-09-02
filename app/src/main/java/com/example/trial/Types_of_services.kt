package com.example.trial

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.trial.databinding.FragmentTypesOfServicesBinding

class Types_of_services : Fragment() {

    // return inflater.inflate(R.layout.fragment_types_of_services, container, false)
//    init{
//        val intent = Intent(this,MapsActivity::class.java)
//        startActivity(intent)
//    }
    lateinit var handler:Handler
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentTypesOfServicesBinding =DataBindingUtil.inflate(inflater,R.layout.fragment_types_of_services,container,false)
        binding.location.setOnClickListener { view :View ->
//            handler= Handler()
//            handler.postDelayed(
//                {
//                    val intent= Intent(this,MapsActivity::class.java)
//                    startActivity(intent)
//                },3000)

  Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_mapsActivity)
        }
        binding.plumber.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }

        binding.painter.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }

        binding.electrician.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }

        binding.AC.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }

        binding.salon.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }

        binding.carpenter.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }

        binding.gardening.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }

        binding.appliances.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_types_of_services_to_list)
        }
        return binding.root

    }


}