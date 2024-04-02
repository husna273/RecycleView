package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterBuku.OnItemClickListener {
    private RecyclerView recyclerView;
    private AdapterBuku adapterBuku;
    private ArrayList<Jbuku> judulbuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView =findViewById(R.id.RecycleV);
        adapterBuku = new AdapterBuku(judulbuku);

        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterBuku);

        adapterBuku.setOnItemClickListener(this);
    }

    private void getData() {
        judulbuku = new ArrayList<>();
        judulbuku.add(new Jbuku("Santri Pilihan Bunda", R.drawable.spb, "\"Novel Santri Pilihan Bunda mengangkat percintaaan sebagai tema besarnya. Dengan dibalut nuansa Islami, penulis yang lebih akrab dipanggil Acha ini mampu menyuguhkan kisah cinta yang tak hanya penuh letupan-letupan emosi tapi juga sarat akan nilai-nilai kehidupan."+"\n" +
                "Menikah memang tidak mudah, tetapi juga tidak sesulit yang dibayangkan. Itulah mengapa untuk sampai kepada keputusan menikah, sebaiknya sudah siap bekal mental, materi, dan spiritual. Bagaimana mempersiapkannya?"+
                "Detail Buku\n" +
                "Penulis : Salsyabila Falensia\n" +
                "Tipe buku: Novel\n" +
                "Tahun Terbit : 19 agustus 2021\n" +
                "Jumlah Halaman : 328 halaman\n", "Rp. 90.000"));
        judulbuku.add(new Jbuku("SHAF", R.drawable.shaf, "Novel Shaf mengisahkan tentang seorang gadis bernama Shafira. Suatu ketika, Shafira bertemu dengan seorang pria bernama Athaya Khalil Adnan. Selama ini, Shafira hidup dengan stigma bahwa profesi sekretaris hanya menjalankan tugas sebagai seorang yang akan selalu mengatakan “iya”"+
                "\n"+"Detail Buku\n" +
                "Penulis : Madani\n" +
                "Tipe buku: Novel\n" +
                "Tahun Terbit : 01 desember 2021\n" +
                "Jumlah Halaman : 448 halaman\n", "Rp. 110.000"));
        judulbuku.add(new Jbuku("Self Healing With Qur'an", R.drawable.selfhealingwithquran,"\"Buku Self Healing With Qur’an karya Ummu Kalsum IQT ini merangkum berbagai metode penyembuhan diri berdasarkan petunjuk yang berada di dalam Al-Qur’an. Metode penyembuhan dihadirkan dalam bentuk berbagai kisah yang berkaitan dengan berbagai kondisi pembaca.\"\n"+
                "\n"+"Detail Buku\n" +
                        "Penulis : Ummu Kalsum lqt\n" +
                        "Tipe buku: Novel\n" +
                        "Tahun Terbit : 07 april 2022\n" +
                        "Jumlah Halaman : 192 halaman\n", "Rp. 53.000"));
        judulbuku.add(new Jbuku("Atomic Habit", R.drawable.atomic_habit,"\"Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa adalah buku kategori self improvement karya James Clear. Pada umumnya, perubahan-perubahan kecil seringkali terkesan tak bermakna karena tidak langsung membawa perubahan nyata pada hidup suatu manusia.\"\n"
                +"\n"+"Detail Buku\n" +
                        "Penulis : James Clear\n" +
                        "Tipe buku: Self Improvement\n" +
                        "Tahun Terbit : 15 september 2019\n" +
                        "Jumlah Halaman : 365 halaman\n", "Rp.120.000"));
        judulbuku.add(new Jbuku("Azzamine", R.drawable.azzamine,"\"Novel Azzamine mengisahkan tentang perjalanan cinta Azzam dan Jasmine yang bermula dari perjodohan. Azzam merupakan seoarang pria yang sholeh, baik hati, lemah lembut, dan penyabar. Sedangkan, Jasmine merupakan seorang wanita yang lumayan tomboy dan kurang sopan."+
                "\n"+"Detail Buku\n" +
                "Penulis : Sophia Aulia\n" +
                "Tipe buku: Novel\n" +
                "Tahun Terbit : 27 februari 2022\n" +
                "Jumlah Halaman : 368 halaman\n", "Rp. 85.000"));
        judulbuku.add(new Jbuku("insecurity", R.drawable.insecurity,"\"Insecurity is My Middle Name merupakan buku self-healing yang ditulis oleh Alvi Syahrin. Melalui buku ini akan banyak menjawab pertanyaan-pertanyaan yang selama ini bersarang di dalam kepala. Pada buku ini, penulis akan mengajak pembaca untuk berdamai dengan ‘insecurity’ yang selama ini dialami dengan cara yang positif, terus bertumbuh, terus berkembang dan menjadi versi yang lebih baik dari diri kita sebelumnya\"\n"+
                "\n"+"Detail Buku\n" +
                "Penulis : Alfi Syahrin\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : 26 agustus 2021\n" +
                "Jumlah Halaman : 264 halaman\n", "Rp.93.000"));
        judulbuku.add(new Jbuku("Langkah Kaki", R.drawable.langkah_kaki,"\"Aku tahu sejak awal jika pernikahan yang kami jalani tidak akan mudah. Aku mencintainya, tapi tidak dengannya. Ia hanya yakin, jika kelak Allah akan menumbuhkan rasa itu di hatinya untukku. Hingga sebuah kejadian tak diinginkan akibat dari kecerobohanku, membuat ia yang belum dapat mencintaiku, menjadi membenciku.\"\n"+
                "\n"+"Detail Buku\n" +
                "Penulis : shineeminka\n" +
                "Tipe buku: Novel\n" +
                "Tahun Terbit : 14 maret 2020\n" +
                "Jumlah Halaman : 363 halaman\n", "Rp. 90.000"));
        judulbuku.add(new Jbuku("Love From A to Z", R.drawable.lovefrom_atoz,"\"Zara Nindiatama seorang anak perempuan yang lahir dikeluarga yang agamis. Akan tetapi ia memiliki penampilan yang sedikit menonjol, berbeda dengan kembarannya yaitu Fara Anindita seorang anak yang lemah lembut dan tentunya amat berbanding balik dengan Zara, namun keduanya sama sama memiliki akhlak yang baik.\"\n"+
                "\n"+"Detail Buku\n" +
                "Penulis : S.K.Ali\n" +
                "Tipe buku: Novel\n" +
                "Tahun Terbit : 14 juni 2022\n" +
                "Jumlah Halaman : 390 halaman\n", "Rp. 99.000"));
        judulbuku.add(new Jbuku("Filosofi teras", R.drawable.filosofi_teras,"\"Buku yang pertama kali diterbitkan pada 2019 ini mengajarkan kita tentang pengendalian emosi negatif yang ada dalam diri kita. Jauh dari kesan filsafat sebagai topik berat dan mengawang-awang, Filosofi Teras justru bersifat praktis dan relevan dengan kehidupan Generasi Milenial dan Gen-Z masa kini.\"\n"+
                "\n"+"Detail Buku\n" +
                "Penulis : Henry Manampiring\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : 18 desember 2018\n" +
                "Jumlah Halaman : 364 halaman\n", "Rp. 79.000"));
        judulbuku.add(new Jbuku("Pyschology of Money", R.drawable.pyschologyofmoney,"\"Dalam The Psychology of Money, penulis pemenang penghargaan, Morgan Housel membagikan 19 cerita pendek yang mengeksplorasi cara-cara aneh orang berpikir tentang uang dan mengajari Anda cara memahami salah satu topik terpenting dalam hidup dengan lebih baik.\"\n"+
                "\n"+"Detail Buku\n" +
                "Penulis : Morgan Housel\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : 28 desember 2021\n" +
                "Jumlah Halaman : 268 halaman\n", "Rp. 100.000"));
        judulbuku.add(new Jbuku("The Art of Halal", R.drawable.theartof_halal,"Deskripsi Buku\n" +
                "Saat putus dari pacar, tentu kita merasa sedih dan bertanya-tanya, mengapa putus. Lalu, ketika sudah banyak teman yang menikah, kita menjadi galau, sibuk berpikir mengapa jodoh belum kelihatan, apalagi sudah banyak yang bertanya, \"Kapan?\" Satu kata yang jika tidak disikapi dengan bijak bisa membuat kita grasah-grusuh perkara menikah. Padahal, menikah bukan hanya soal siapa yang paling cepat, melainkan siapa yang paling taat dan siapa yang menjemput jodoh dengan baik karena ia adalah sebuah keputusan besar dalam hidup.\n" +
                "\n" +
                "Menikah memang tidak mudah, tetapi juga tidak sesulit yang dibayangkan. Itulah mengapa untuk sampai kepada keputusan menikah, sebaiknya sudah siap bekal mental, materi, dan spiritual. Bagaimana mempersiapkannya?"+
                "\n"+"Detail Buku\n" +
                "Penulis : Jihan Sabira\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : Januari 2023\n" +
                "Jumlah Halaman : 228 halaman\n", "Rp. 82.000"));
        judulbuku.add(new Jbuku("The Art of Hijrah", R.drawable.theartof_hijrah,"Hijrah adalah berpindah dari keadaan yang semula buruk menjadi keadaan yang baik, dari kondisi yang sudah baik menjadi kondisi yang lebih baik. Jadi, hijrah adalah proses terus-menerus untuk memperbaiki diri, memperbaiki cara berpikir, dan memperbaiki cara berucap serta bersikap, ataupun Hijrah adalah sebuah proses perjalanan yang begitu jauhnya dan membutuhkan segala pengorbanan dalam hidup. Kebingungan di awal melaksanakan hijrah tentu menjadi halangan dan tantangan tersendiri, tetapi tanpa disadari Jannah telah menunggu kedatangan kita yakni seorang muslim untuk berubah agar keluar dari jurang kegelapan.\n" +
                "\n" +
                "Mendekat pada Allah adalah sesuatu yang harus selalu dilakukan oleh seorang muslim. Namun, terkadang kita dilanda kebingungan ketika mau hijrah, apa yang harus dilakukan pertama kali, jalan apa yang harus ditempuh, bagaimana cara mendekat sama Allah itu sendiri, dan kebingungan-kebingungan lainnya. Buku ini hadir untuk membantu mengurangi kebingungan-kebingungan itu. Hijrah bukanlah suatu jalan yang biasa. Hijrah ibarat proses perjalanan yang begitu jauhnya. Hijrah butuh segala pengorbanan dalam hidup sampai kita habiskan perjalanan setengah dari umur kita. Oleh karena itu, perlu arahan untuk melakukannya agar pijakan hijrah bisa mengakar kuat dan berbuah hikmah sehingga kebaikan yang dilakukan bisa istiqomah dan tidak mudah tergelincir kembali ke dalam jurang kegelapan.\n" +
                "\n" +
                "Detail Buku\n" +
                "Penulis : Creative Muslimah Id\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : 30 Januari 2020\n" +
                "Jumlah Halaman : 176 halaman\n", "Rp. 62.100"));
        judulbuku.add(new Jbuku("The Art of Istiqamah", R.drawable.theartof_istiqamah,"Buku ini berisi kumpulan motivasi bagi para muslimah yang dilengkapi dengan kisah-kisah inspiratif serta ulasan mengenai teladan yang dapat diambil dari kisah tersebut. Setiap materi berupa tulisan-tulisan lepas, tidak terikat bab, dan dikemas menyerupai jurnal harian mulai dari Senin hingga Minggu. Di setiap bagian akan dilengkapi pula dengan catatan ibadah harian yang dapat diisi sendiri oleh pembaca. Di bagian akhir buku ini, ada jurnal target mingguan selama satu bulan.\n" +
                "\n" +
                "Secara keseluruhan, buku ini cukup fun. Kita tidak hanya akan membaca nasihat-nasihat yang menggurui', tetapi juga diajak untuk turut serta melakukan aksi dan menuliskannya ke dalam jurnal' di buku ini. Selain itu, juga akan diajak untuk membuat target sendiri, menuliskannya, dan mencoba mewujudkannya." +
                "\n" +
                "Detail Buku\n" +
                "Penulis : Tristanti Tri Wahyuni\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : 06 februari 2023\n" +
                "Jumlah Halaman : 208 halaman\n", "Rp.67.500"));
        judulbuku.add(new Jbuku("Loneliness", R.drawable.lonelines,"Dan di sinilah kamu, menyentuh buku ini, sendiri saja, trying to feel something, trying to find a friend, dan kamu sudah ada di langkah yang tepat karena dengan buku ini akan membantumu berdamai dengan rasa sepi." +
                "\n" +
                "Detail Buku\n" +
                "Penulis : Alvi Syahrin\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : 20 september 2022\n" +
                "Jumlah Halaman : 306 halaman\n", "Rp.99.000"));
        judulbuku.add(new Jbuku("The Alpha Girl's", R.drawable.alphagirl,"Alpha Female adalah para perempuan yang menginspirasi, memimpin, menggerakkan orang sekitarnya, dan membawa perubahan. Mereka cerdas, percaya diri, dan independen. Bagaimana remaja dan perempuan muda bisa mengembangkan diri menjadi mereka? Buku ini adalah hasil pengamatan, riset artikel, wawancara langsung, dan diskusi dengan banyak perempuan di media sosial. Ditulis dengan ringan, penuh ilustrasi kocak, namun tetap blak-blakan dan menohok,The Alpha Girl’s Guide akan membuat kamu terinspirasi menjadi cewek smart, independen dan bebas galau!" +
                "\n" +
                "Detail Buku\n" +
                "Penulis : Henry manampiring\n" +
                "Tipe buku: Self Improvement\n" +
                "Tahun Terbit : 30 Januari 2020\n" +
                "Jumlah Halaman : 254 halaman\n", "Rp. 88.000"));
    }

    @Override
    public void onItemClick(int position) {
        Jbuku clickedItem = judulbuku.get(position);

        Intent intent= new Intent(MainActivity.this, detailActivity.class);
        intent.putExtra("foto", clickedItem.getCoverbuku());
        intent.putExtra("buku", clickedItem.getNameItem());
        intent.putExtra("harga", clickedItem.getPrice());
        intent.putExtra("sinopsis", clickedItem.getSinopsis());

        startActivity(intent);
    }
}