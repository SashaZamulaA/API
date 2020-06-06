package com.example.api.ui.current

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.api.R

class CurrentWeatherFragment : Fragment() {

    private lateinit var currentWeatherModel: CurrentWeatherModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        currentWeatherModel =
                ViewModelProviders.of(this).get(CurrentWeatherModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        currentWeatherModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
