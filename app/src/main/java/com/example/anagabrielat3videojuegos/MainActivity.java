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
        animeClasses.add(new AnimeClass(
                "SWORD ART ONLINE",
                "Segunda temporada de Sword Art Online: Alicization - War of Underworld.",
                "https://cdn.jkanime.net/assets/images/animes/image/sword-art-online-alicization-war-of-underworld-2nd-season.jpg",
                false
        ));
        animeClasses.add(new AnimeClass(
                "UZAKI-CHAN WA ASOBITAI!",
                " El único deseo de Sakurai Shinichi es un poco de paz y tranquilidad. Pero Uzaki Hana, su bullicioso y bien dotado estudiante de secundaria, tiene otros planes.",
                "https://cdn.jkanime.net/assets/images/animes/image/uzaki-chan-wa-asobitai.jpg",
                false
        ));
        animeClasses.add(new AnimeClass(
                "BLACK CLOVER (TV)",
                "Hay un mundo en donde la magia lo es todo. Asta y Yuno crecieron en una iglesia, y el día que cumplieron 15 años participaron en una ceremonia en donde les concedieron grimores los cuales despiertan los poderes mágicos innatos.",
                "https://cdn.jkanime.net/assets/images/animes/image/black-clover-tv.jpg",
                false
        ));
        animeClasses.add(new AnimeClass(
                "THE GOD OF HIGH SCHOOL",
                "Jin Mori se ha autoproclamado como el estudiante de preparatoria más fuerte del mundo, pero su vida cambia por completo cuando lo invitan a participar en el \"God of High School\", un torneo en el que se decidirá el estudiante más fuerte de todos.",
                "https://cdn.jkanime.net/assets/images/animes/image/the-god-of-high-school.jpg",
                false
        ));
        animeClasses.add(new AnimeClass(
                "KIMETSU NO YAIBA",
                "Estamos en la era Taisho de Japón. Tanjiro, un joven que se gana la vida vendiendo carbón, descubre un día que su familia ha sido asesinada por un demonio.",
                "https://cdn.jkanime.net/assets/images/animes/image/kimetsu-no-yaiba.jpg",
                false
        ));

        return animeClasses;
    }
}