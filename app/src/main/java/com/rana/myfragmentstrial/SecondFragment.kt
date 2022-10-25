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


class SecondFragment : Fragment(R.layout.fragment_second) {

    private var listener: FragmentListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.fragtwo_Bt)?.apply {
            setOnClickListener {
                listener?.onBtnClicked(2)
            }
        }
        view.findViewById<TextView>(R.id.tv_text)?.text = arguments?.getString(KEY)
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
        private const val KEY: String = "KEY"

        private var instance: Fragment? = null

        fun newInstance(text: String): Fragment {
            val args = Bundle()
            args.putString(KEY, text)
            if (instance == null)
                instance = SecondFragment()
            instance?.arguments = args
            return instance ?: SecondFragment()
        }
    }

}