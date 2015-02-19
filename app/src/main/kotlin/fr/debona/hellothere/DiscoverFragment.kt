package fr.debona.hellothere

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ListView
import android.widget.ArrayAdapter
import java.util.ArrayList

public class DiscoverFragment:Fragment() {

    var rootView: View? = null
    var listView: ListView? = null

    override fun onCreateView(inflater:LayoutInflater, container:ViewGroup?, savedInstanceState:Bundle?):View {
        rootView = inflater.inflate(R.layout.fragment_discover, container, false)

        val items = ArrayList<String>()
        for (i in 0..10)
            items.add("Something " + i)
        val itemsAdapter = ArrayAdapter(getActivity(), R.layout.cell_place, items);

        listView = view(R.id.listView)
        listView?.setAdapter(itemsAdapter)

        return rootView!!
    }

    fun view<T>(id: Int): T {
        val view: View? = rootView?.findViewById(id)
        if (view == null)
            throw IllegalArgumentException("Given ID could not be found in current layout!")
        return view as T
    }

}
