package tech.devatacreative.submission2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class LastMatchFragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater!!.inflate(R.layout.fragment_last_match, container, false)



        val fragmentAdapter = HomePagerAdapter(supportFragmentManager)
        viewpager_match.adapter = fragmentAdapter
        tabs_match.setupWithViewPager(viewpager_match)


        return rootView


    }
}