package fr.debona.hellothere.fragments.discover

import fr.debona.hellothere.extensions.Cell
import android.content.Context
import fr.debona.hellothere.R
import android.view.LayoutInflater
import android.widget.RelativeLayout
import android.widget.TextView
import fr.debona.hellothere.models.Place

public class PlaceCell(context: Context): RelativeLayout(context), Cell<Place> {

    var name: TextView

    {
        LayoutInflater.from(getContext()).inflate(R.layout.cell_place, this)
        name = findViewById(R.id.name) as TextView
    }

    override fun setIndex(position: Int) {
        // nothing to do...
    }

    override fun setItem(item: Place?) {
        if (item != null && item.name != null)
            name.setText(item.name)
        else
            name.setText("")
    }
}