@file:Suppress("DEPRECATION")

package com.rana.myfragmentstrial

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment(R.layout.fragment_first) {

    private var listener: FragmentListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fragOne_Bt)?.apply {
            setOnClickListener {
                listener?.onBtnClicked(1)
            }
        }

        arguments?.let {
            view.findViewById<TextView>(R.id.tv_text).text = it.getString(KEY)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as FragmentListener
    }

    override fun onDestroyView() {
        super.onDestroyView()
        listener = null
    }

    companion object {
        private var instance: FirstFragment? = null
        private const val KEY = "key"

        fun newInstance(text: String): FirstFragment {
            val args = Bundle()
            args.putString(KEY, text)
            if (instance == null)
                instance = FirstFragment()

            instance?.arguments = args
            return instance ?: FirstFragment()
        }
    }

}

