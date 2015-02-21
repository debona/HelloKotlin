package fr.debona.hellothere.fragments

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import fr.debona.hellothere.R
import android.widget.Toast

public class DrawerFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater.inflate(R.layout.fragment_drawer, container, false)

        rootView.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View) {
                Toast.makeText(getActivity(), "Drawer menu clicked!", Toast.LENGTH_SHORT).show()
            }
        })
        return rootView
    }
}