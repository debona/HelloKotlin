package fr.debona.hellothere.extensions

import android.content.Context
import android.view.View
import android.widget.BaseAdapter
import java.util.ArrayList
import android.view.ViewGroup

public abstract class HeaderListAdapter<T>(val context: Context, val header: View): BaseAdapter() {

    var items = ArrayList<T>()


    /////////////////////////////////////////
    // Cell view types management
    /////////////////////////////////////////

    override public fun getViewTypeCount(): Int {
        return 2
    }

    override public fun getItemViewType(position: Int): Int {
        if (position == 0)
            return 0
        else
            return 1
    }


    /////////////////////////////////////////
    // Basic adapter stuff
    /////////////////////////////////////////

    override public fun getCount(): Int {
        return this.items.size() + 1 // offset due to header
    }

    override public fun getItem(position: Int): T {
        val realPosition = position - 1 // offset due to the header
        return this.items.get(realPosition)
    }

    override public fun getItemId(position: Int): Long {
        return position as Long
    }

    override public fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        if (position == 0)
            return header

        val item = getItem(position)
        var cell = convertView as Cell<T>

        if (cell == null)
            cell = this.cellFactory(context)

        cell.setIndex(position - 1) // offset due to header
        cell.setItem(item)

        return cell as View
    }

    public abstract fun cellFactory(context: Context): Cell<T>

}
