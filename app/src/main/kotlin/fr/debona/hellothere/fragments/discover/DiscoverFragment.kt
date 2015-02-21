package fr.debona.hellothere.fragments.discover

import android.support.v4.app.Fragment
import android.view.View
import android.widget.ListView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import fr.debona.hellothere.R
import java.util.ArrayList
import android.widget.ArrayAdapter

public class DiscoverFragment: Fragment() {

    var rootView: View? = null
    var listView: ListView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
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