package fr.debona.hellothere

import android.support.v7.app.ActionBarActivity
import android.support.v7.app.ActionBar
import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.os.Build
import android.widget.TextView
import android.widget.LinearLayout
import android.widget.Toast
import android.support.v4.app.FragmentManager

public class MainActivity:ActionBarActivity() {

    fun view<T>(id: Int): T {
        val view: View? =  findViewById(id)
        if (view == null)
            throw IllegalArgumentException("Given ID could not be found in current layout!")
        return view as T
    }

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null)
        {
            val fragmentManager = getSupportFragmentManager().beginTransaction()
            fragmentManager.add(R.id.drawer_menu, DrawerFragment())
            fragmentManager.add(R.id.content_frame, DiscoverFragment())
            fragmentManager.commit()
        }
    }

    override fun onCreateOptionsMenu(menu:Menu):Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item:MenuItem):Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
