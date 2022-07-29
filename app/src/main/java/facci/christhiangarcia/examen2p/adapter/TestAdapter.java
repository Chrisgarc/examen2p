package facci.christhiangarcia.examen2p.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import facci.christhiangarcia.examen2p.ActivityView;
import facci.christhiangarcia.examen2p.R;
import facci.christhiangarcia.examen2p.models.ModelTest;

public class TestAdapter extends BaseAdapter {

    private Context context;
    private List<ModelTest> list;

    public TestAdapter(Context context, List<ModelTest> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {return list.size();}

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = View.inflate(context,  R.layout.list_person, null);
        }

        TextView id = convertView.findViewById(R.id.txtId);
        TextView url = convertView.findViewById(R.id.txtUrl);
        //ImageView img = convertView.findViewById(R.id.image);
        Button btnView = convertView.findViewById(R.id.btnView);

        ModelTest modelTest = list.get(position);

        //Glide.with(context).load(modelTest.getImg()).into(img);
        id.setText(modelTest.getId());
        url.setText(modelTest.getUrl());
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, ActivityView.class).putExtra("_id", modelTest.getId()));
            }
        });

        return convertView;
    }
}