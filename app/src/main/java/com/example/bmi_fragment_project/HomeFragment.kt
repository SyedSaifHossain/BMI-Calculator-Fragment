package com.example.bmi_fragment_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {
    private lateinit var weightEdit : EditText
    private lateinit var heightEdit : EditText
    private lateinit var button : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        var view = inflater.inflate(R.layout.fragment_home, container, false)
        weightEdit = view.findViewById(R.id.weightEtx)
        heightEdit = view.findViewById(R.id.heightEtx)
        button = view.findViewById(R.id.calculatBtn)

        button.setOnClickListener{
        var weight = weightEdit.text.toString().toDouble()

        var height = heightEdit.text.toString().toDouble()
        var bmi = weight/(height*height)

            var bundle = bundleOf("score" to bmi)

        findNavController().navigate(R.id.result_action,bundle)


        }
        return view
    }
}