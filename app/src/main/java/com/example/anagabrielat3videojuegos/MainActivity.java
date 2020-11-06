package com.example.anagabrielat3videojuegos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.anagabrielat3videojuegos.Adapter.AdapterList;
import com.example.anagabrielat3videojuegos.Entidades.AnimeClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.listAnime);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        AdapterList adapterList = new AdapterList(list());
        recyclerView.setAdapter(adapterList);
    }
    List<AnimeClass> list(){

        List<AnimeClass> animeClasses = new ArrayList<>();

        animeClasses.add(new AnimeClass(
                "MAOU GAKUIN NO FUTEKIGOUSHA",
                "El tiránico y legendario Rey Demonio se reencarna tras 2000 años. Para su desgracia, sus aptitudes como Rey Demonio le llevan a la academia en la que entrenan los candidatos a nuevo Rey Demonio.",
                "https://cdn.jkanime.net/assets/images/animes/image/maou-gakuin-no-futekigousha-shijou-saikyou-no-maou-no-shiso-tensei-shite-shison-tachi-no-gakkou-e.jpg",
                false
                ));
        animeClasses.add(new AnimeClass(
                "KANOJO, OKARISHIMASU",
                "Kazuya Kinoshita es un joven universitario de 20 años que tras conseguir novia, pudo besarla, ¡pero lo dejó tras solo un mes!. Maldita sea, no quiero tener que volver a pasar por eso.",
                "https://cdn.jkanime.net/assets/images/animes/image/kanojo-okarishimasu.jpg",
                false
                ));
        animeClasses.add(new AnimeClass(
                "NARUTO SHIPPUDEN",
                "Pasan dos años después de que Naruto y Sakura se fueran a entrenar cada uno con su maestro sannin, en este caso, Naruto se fue con Jiraya y Sakura con Tsunade. Ya tienen 14 años y son unos geniales ninjas.",
                "https://cdn.jkanime.net/assets/images/animes/image/naruto-shippuden.jpg",
                false
        ));
        animeClasses.add(new AnimeClass(
                "ONE PIECE",
                "Una historia épica de piratas, donde narra la historia de Monkey D. Luffy quien cuando tenia 7 años, comió accidentalmente una Akuma no mi (Fruta del diablo) la cual le convirtió en un hombre de goma.",
                "https://cdn.jkanime.net/assets/images/animes/image/one-piece.jpg",
                false
        ));
        animeClasses.add(new AnimeClass(
                "RE:ZERO KARA HAJIMERU ISEKAI SEIKATSU 2ND SEASON",
                "Segunda temporada de Re: Zero kara Hajimeru Isekai Seikatsu.",
                "https://cdn.jkanime.net/assets/images/animes/image/rezero-kara-hajimeru-isekai-seikatsu-2nd-season.jpg",
                false
        ));

        return animeClasses;
    }
}