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
import fr.debona.hellothere.extensions.ListAdapter
import fr.debona.hellothere.extensions.Cell
import android.content.Context
import fr.debona.hellothere.models.Place

public class DiscoverFragment: Fragment() {

    var rootView: View? = null
    var listView: ListView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        rootView = inflater.inflate(R.layout.fragment_discover, container, false)

        val places = Place.all()
        val itemsAdapter = object: ListAdapter<Place>(getActivity()) {
            override public fun cellFactory(context: Context): Cell<Place> {
                return PlaceCell(context)
            }
        }
        itemsAdapter.items = places

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
