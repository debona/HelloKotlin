package fr.debona.hellothere.extensions

import android.content.Context
import android.view.View
import android.widget.BaseAdapter
import java.util.ArrayList
import android.view.ViewGroup

open abstract class ListAdapter<T>(val context: Context): BaseAdapter() {

    var items = ArrayList<T>()

    /////////////////////////////////////////
    // Basic adapter stuff
    /////////////////////////////////////////

    override public fun getCount(): Int {
        return this.items.size()
    }

    override public fun getItem(position: Int): T {
        return this.items.get(position)
    }

    override public fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override public fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val item = getItem(position)

        var cell = if (convertView != null) convertView as Cell<T> else this.cellFactory(context)

        cell.setIndex(position)
        cell.setItem(item)

        return cell as View
    }

    public abstract fun cellFactory(context: Context): Cell<T>

}
