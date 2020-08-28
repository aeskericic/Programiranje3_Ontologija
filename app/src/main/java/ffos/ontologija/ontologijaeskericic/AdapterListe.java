package ffos.ontologija.ontologijaeskericic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<ffos.ontologija.ontologijaeskericic.Film> podaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        ffos.ontologija.ontologijaeskericic.Film f = podaci.get(position);
        red.film.setText(f.getFilm());
        red.zanr.setText(f.getZanr());
        red.mjesto.setText(f.getMjesto());;
        red.nastao.setText(f.getNastao());
        red.prodaneKarte.setText(f.getProdaneKarte());
        red.vrijeme.setText(f.getVrijeme());
    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView film;
        private TextView zanr;
        private TextView mjesto;
        private TextView nastao;
        private TextView prodaneKarte;
        private TextView vrijeme;

        Red(View itemView) {
            super(itemView);
            film = itemView.findViewById(R.id.film);
            zanr = itemView.findViewById(R.id.zanr);
            nastao = itemView.findViewById(R.id.nastao);
            mjesto = itemView.findViewById(R.id.mjesto);
            prodaneKarte = itemView.findViewById(R.id.karte);
            vrijeme = itemView.findViewById(R.id.vrijeme);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public ffos.ontologija.ontologijaeskericic.Film getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<ffos.ontologija.ontologijaeskericic.Film> itemList) {
        this.podaci = itemList;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
