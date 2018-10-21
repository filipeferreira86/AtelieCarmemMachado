package testemenu.filipefj.com.atelicarmemmachado;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TopActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] txtsmenu;
    TypedArray imgsmenu;

    List<LinhaItem> linhaItems;
    RecyclerView listaPrin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        linhaItems = new ArrayList<LinhaItem>();
        txtsmenu = getResources().getStringArray(R.array.lista);
        imgsmenu = getResources().obtainTypedArray(R.array.fotos);

        for(int i = 0; i < txtsmenu.length; i++){
            LinhaItem item = new LinhaItem(txtsmenu[i], imgsmenu.getResourceId(i, -1));
            linhaItems.add(item);
        }

        listaPrin = (RecyclerView)findViewById(R.id.content);
        ItemAdapter adapter = new ItemAdapter();

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
