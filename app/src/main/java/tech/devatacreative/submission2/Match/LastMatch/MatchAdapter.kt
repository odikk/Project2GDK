package tech.devatacreative.submission2.Match.LastMatch

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_recycler_view_last_match.view.*
import tech.devatacreative.submission2.Model.EventsItem
import tech.devatacreative.submission2.R
import java.text.SimpleDateFormat

class MatchAdapter(private val matches: List<EventsItem>,
                   private val clickListener: (EventsItem) -> Unit)
    : RecyclerView.Adapter<MatchViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
//       return TeamViewHolder(MatchUI().createView(AnkoContext.create(parent.context, parent)))
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view_last_match, parent, false)
        return MatchViewHolder(itemView)
    }

    override fun getItemCount(): Int = matches.size

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
       holder.bindItem(matches[position], clickListener)
    }
}

class MatchViewHolder(view: View) : RecyclerView.ViewHolder(view){
    fun bindItem(matches: EventsItem, clickListener: (EventsItem) -> Unit){
        val dateFormat = SimpleDateFormat("E, MMM dd yyyy")
        itemView.list_date.text = dateFormat.parse(matches.dateEvent).toString()
        itemView.list_home_score.text = matches.intHomeScore
        itemView.list_home_team.text = matches.strHomeTeam
        itemView.list_away_team.text = matches.strAwayTeam
        itemView.list_away_score.text = matches.intAwayScore
        itemView.setOnClickListener {
            clickListener(matches)
        }
    }
}
//
//class MatchUI: AnkoComponent<ViewGroup>{
//    override fun createView(ui: AnkoContext<ViewGroup>): View {
//        return with(ui){
//            linearLayout{
//                lparams(width = matchParent, height = wrapContent)
//                padding = dip(8)
////                orientation = LinearLayout.HORIZONTAL
//            relativeLayout{
//                lparams(width = matchParent, height = wrapContent)
//
//                textView{
//                    textSize =16f
//                    id = R.id.date
//
//                }.lparams{
//                    centerHorizontally()
//                    margin = dip(8)
//                }
//
//            }
//
//            }
//        }
//    }
//}