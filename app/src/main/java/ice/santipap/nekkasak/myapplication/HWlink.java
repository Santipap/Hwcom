package ice.santipap.nekkasak.myapplication;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by hibiki on 06/04/2016.
 */
public class HWlink extends BaseAdapter{
    //ประกาศตัวแปร
    private Context context;
    private int[] iconInts;
    private String[] titleStrings,detailStrings;

    public HWlink(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings) { //alt+insert
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.computorlist,viewGroup,false);
        //for icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);
        //for title
        TextView titleTextView = (TextView) view1.findViewById(R.id.b1);
        titleTextView.setText(titleStrings[i]);
        //for detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.b2);
        detailTextView.setText(detailStrings[i]);
        return null;
    }
}//main class
