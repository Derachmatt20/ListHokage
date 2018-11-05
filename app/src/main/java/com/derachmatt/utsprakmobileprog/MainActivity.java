package com.derachmatt.utsprakmobileprog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> url= new ArrayList();
    private ArrayList<String> Nama = new ArrayList<>();
    private ArrayList<String> HK = new ArrayList<>();
    private ArrayList<String> Desc = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
    }

    private void setup(){
        url.add("https://vignette.wikia.nocookie.net/naruto/images/7/7e/Hashirama_Senju.png/revision/latest?cb=20160124040430");
        Nama.add("Hasirama Senju");
        HK.add("Hokage Dosa Konoha Ke - 1");
        Desc.add("Hashirama Senju (千手柱間, Senju Hashirama) dulunya Hokage Pertama (初代火影, Shodai Hokage; Secara harfiah berarti \"Bayangan Api pertama\") dari Konohagakure. Dia terkenal sebagai Dewa Shinobi (忍の神, Shinobi no Kami; TV Bahasa Inggris \"The Supreme Shinobi\") untuk kecakapan ninja tak tertandinginya. Meskipun demikian, Hashirama hanya ingin perdamaian, dan untuk itu mendirikan Konoha dengan teman masa kecilnya dan juga saingannya Madara Uchiha. Meskipun ia tidak mampu untuk mencapai perdamaian selama hidupnya, warisannya akan hidup, terus membentuk desa selama beberapa dekade setelah kematiannya");

        url.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQojKuORioL6kFRwGRiJs-0Z6vgfnjUT4FgpgRrFHhkifs_OPaq");
        Nama.add("Tobirama Senju");
        HK.add("Hokage Dosa Konoha Ke - 2");
        Desc.add("Tobirama Senju (千手扉间, Senju Tobirama) adalah anggota dari klan Senju, yang bersama dengan saudara tertuanya serta klan Uchiha, mendirikan desa shinobi pertama. Tobirama akan bekerja tanpa kenal lelah untuk mencapai stabilitas politik dan melaksanakan lembaga yang membuat sistem desa bekerja, sehingga memastikan kelangsungan dan kesejahteraan Konoha. Setelah kematian kakaknya, ia berhasil mendapat gelar Hokage Kedua (二代目火影, Nidaime Hokage; Secara harfiah berarti \"Bayangan Api Kedua\").");

        url.add("https://vignette.wikia.nocookie.net/naruto/images/e/e4/Hiruzen_Sarutobi.png/revision/latest?cb=20160125204719");
        Nama.add("Hiruzen Sarutobi");
        HK.add("Hokage Dosa Konoha Ke - 3");
        Desc.add("Hiruzen Sarutobi (猿飛ヒルゼン, Sarutobi Hiruzen) dahulu adalah Hokage Ketiga (三代目火影, Sandaime Hokage; Secara harfiah berarti \"Bayangan Api Ketiga\") dari Konohagakure. Sebagai seorang murid Hokage sebelumnya, Hiruzen adalah seorang ninja yang kuat, dipuji sebagai \"Dewa Shinobi\". Meskipun ia hanya menjadi guru dari Sannin, seluruh generasi ninja Konoha mendapat manfaat dari kebijaksanaannya selama hidupnya.");

        url.add("https://vignette.wikia.nocookie.net/narutoshippuuden/images/0/06/Namikaze_Minato.png/revision/latest?cb=20141113135424");
        Nama.add("Minato Namikaze");
        HK.add("Hokage Dosa Konoha Ke - 4");
        Desc.add("Minato Namikaze (波風ミナト, Namikaze Minato) dulunya adalah Hokage Keempat (四代目火影, Yondaime Hokage; Secara harfiah berarti \"Bayangan Api Keempat\") dari Konohagakure. Selama hidupnya ia sangat dikenal karena kecepatannya, membuatnya mendapat julukan Si Kilat Kuning Konoha (木ノ葉の黄色い閃光, Konoha no Kiiroi Senkō; TV Bahasa Inggris \"Yellow Flash of the Leaf\"). Dia gugur selama Serangan Ekor-Sembilan di Konoha, mempertaruhkan hidupnya untuk menyegel setengah Ekor-Sembilan kepada putranya yang baru lahir, Naruto Uzumaki.");

        url.add("https://vignette.wikia.nocookie.net/narutofanones/images/1/14/Tsunade_newshot.png/revision/latest?cb=20121006185148&path-prefix=es");
        Nama.add("Tsunade");
        HK.add("Hokage Dosa Konoha Ke - 5");
        Desc.add("sunade (綱手, Tsunade) adalah salah seorang Sannin dari Konohagakure. Dia mempunyai gelar Tsunade si Putri Siput dari Konoha (木ノ葉のナメクジ綱手姫, Konoha no Namekuji Tsunade-hime). Meskipun dinyatakan sebagai kunoichi terkuat dan Ninja Medis terhebat di dunia, hilangnya orang-orang yang dikasihinya berulang-ulang menyebabkan Tsunade untuk meninggalkan kehidupan shinobi selama bertahun-tahun. Dia akhirnya dibujuk untuk kembali ke Konoha dan dinobatkan sebagai Hokage Kelima (五代目火影, Godaime Hokage), di mana keterampilannya terbukti tak ternilai bagi desa");

        url.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3r4onAGabNwBINPt6XtjSWZY9_pN2YBmGG6-Xq_79Ga2pTCsN2A");
        Nama.add("Kakashi Hatake");
        HK.add("Hokage Dosa Konoha Ke - 6");
        Desc.add("Kakashi Hatake (はたけカカシ, Hatake Kakashi) adalah shinobi Konohagakure dari klan Hatake. Terkenal sebagai Kakashi si Sharingan (写輪眼のカカシ, Sharingan no Kakashi), dia adalah salah satu ninja Konoha yang paling berbakat; secara teratur tampak suka memberi nasihat dan berkepemimpinan meskipun dia tidak menyukai tanggung jawab pribadi. Untuk murid-muridnya di Tim 7, Kakashi mengajarkan pentingnya kerja sama tim, sebuah pelajaran yang dia terima, bersama dengan Sharingan, dari teman masa kecilnya, Obito Uchiha. Setelah Perang Dunia Shinobi Keempat, Kakashi menjadi Hokage Keenam (六代目火影, Rokudaime Hokage; Secara harfiah berarti \"Bayangan Api Keenam\").");

        url.add("https://i.ytimg.com/vi/DQu285OEB6Y/maxresdefault.jpg");
        Nama.add("Naruto Uzumaki");
        HK.add("Hokage Dosa Konoha Ke - 7");
        Desc.add("Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) adalah shinobi dari Konohagakure. Dia menjadi jinchūriki dari Ekor Sembilan pada hari kelahirannya — sebuah nasib yang menyebabkan dia dijauhi oleh sebagian besar penduduk Konoha sepanjang masa kecilnya. Setelah bergabung dengan Tim Kakashi, Naruto bekerja keras untuk mendapatkan pengakuan desa sambil mengejar mimpinya untuk menjadi Hokage");

        initrec();
    }

    private void initrec(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, url, Nama, HK, Desc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.myprof){
            startActivity(new Intent(this, Profile.class));
        }
        return true;
    }
}
