package testemenu.filipefj.com.atelicarmemmachado;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter{

    Context context;
    List<LinhaItem> linhaItems;

    @Override
    public int getCount() {
        return linhaItems.size();
    }

    @Override
    public Object getItem(int position) {
        return linhaItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return linhaItems.indexOf(getItem(position));
    }

    private class ViewHolder{
        private TextView itemnome;
        private ImageView foto;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ViewHolder holder = null;

        LayoutInflater nInflater = (LayoutInflater)context.getSystemService(Activity.
                LAYOUT_INFLATER_SERVICE);
        if (view==null){
            view = nInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.itemnome = (TextView)view.findViewById(R.id.txtmenu);
            holder.foto = (ImageView)view.findViewById(R.id.imgmenu);

            LinhaItem posicao_linha = linhaItems.get(position);
            holder.foto.setImageResource(posicao_linha.getFoto());
            holder.itemnome.setText(posicao_linha.getItemnome());

        }

        return null;
    }
}
