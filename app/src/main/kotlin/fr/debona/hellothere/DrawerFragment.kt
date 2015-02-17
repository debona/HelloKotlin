package fr.debona.hellothere

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

/**
 * Created by debona on 17/02/15.
 */
public class DrawerFragment:Fragment() {

    override fun onCreateView(inflater:LayoutInflater, container:ViewGroup?, savedInstanceState:Bundle?):View {
        val rootView = inflater.inflate(R.layout.fragment_drawer, container, false)
//        val text_view_hello = rootView.findViewById(R.id.text_view_hello) as TextView
//        text_view_hello.setText("text_view_hello")
        rootView.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View) {
                Toast.makeText(getActivity(), "Drawer menu clicked!", Toast.LENGTH_SHORT).show()
            }
        })
        return rootView
    }
}