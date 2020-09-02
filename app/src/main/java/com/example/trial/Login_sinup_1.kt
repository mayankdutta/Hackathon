package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.trial.ViewModel.EmailViewModel
import com.example.trial.databinding.FragmentLoginSinup1Binding
import com.google.firebase.database.FirebaseDatabase

class Login_sinup_1 : Fragment() {

    private lateinit var viewModel: EmailViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_register_account, container, false)


        viewModel = ViewModelProviders.of(this).get(EmailViewModel::class.java)

        val binding: FragmentLoginSinup1Binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login_sinup_1, container, false)


        binding.login.setOnClickListener() {
            //save_id ( )


            val email = binding.emailid.text.toString().trim()
            val password = binding.password.text.toString().trim()

            if (email.isEmpty()) {
                binding.emailid.error = "Please Enter a Name "

            }

            //val upload_email = emailid ( email, password )
            val ref = FirebaseDatabase.getInstance().getReference( "Email_Id's" ) // Email_Id's --> folder named in firebase
            val uploadEmailId:String = ref.push().key.toString()

            val hero = emailid ( uploadEmailId, email, password)

            //Fot output
            ref.child(uploadEmailId).setValue(hero)

            binding.login.setOnClickListener { view :View ->
                Navigation.findNavController(view).navigate(R.id.action_login_sinup_1_to_servicer2)
            }
        }
        return binding.root
    }
}

