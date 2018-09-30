package tech.devatacreative.submission2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FieldClassification
import android.support.design.widget.TabLayout
import android.support.v4.view.PagerAdapter
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.ctx
import org.jetbrains.anko.recyclerview.v7.recyclerView
import tech.devatacreative.submission2.Match.LastMatch.MatchAdapter
import tech.devatacreative.submission2.Match.LastMatch.MatchPresenter
import tech.devatacreative.submission2.Model.EventsItem
import tech.devatacreative.submission2.R.color.*

class MainActivity : AppCompatActivity() {
    private lateinit var listMatch: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var matchAdapter: MatchAdapter
    private lateinit var presenter: MatchPresenter
    private var match: MutableList<EventsItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = HomePagerAdapter(supportFragmentManager)
        viewpager_match.adapter = fragmentAdapter
        tabs_match.setupWithViewPager(viewpager_match)
//        viewManager = LinearLayoutManager(ctx)
//        listMatch.layoutManager = viewManager
//        viewAdapter = matchAdapter
//        listMatch.adapter = viewAdapter
//


//                lparams(width = matchParent, height = wrapContent)
//
//                listMatch = recyclerView {
//                    lparams(width = matchParent, height = wrapContent)
//                    layoutManager = LinearLayoutManager(ctx)
//                }
//                progressBar = progressBar{
//                }.lparams{
//                    centerHorizontally()
//                }
//

//                tabLayout = themedTabLayout(R.style.ThemeOverlay_AppCompat_Dark){
//                    lparams(width = matchParent, height = wrapContent){
//                        tabGravity = Gravity.FILL
//                        tabMode = TabLayout.MODE_FIXED
//                    }
//                }
            }


        }
//    }
//}
