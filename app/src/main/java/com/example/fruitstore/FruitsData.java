package com.example.fruitstore;

import java.util.ArrayList;

public class FruitsData {
    private static String[] fruitNames = {
            "Apel",
            "Blackberry",
            "Buah Naga",
            "Jeruk",
            "Lemon",
            "Pear",
            "Pisang",
            "Raspberry",
            "Semangka",
            "Strawberry"
    };

    private static String[] fruitDetails = {
            "Buah ini memiliki karakteristik daging buah yang renyah. Jenisnya pun beragam, mulai dari apel merah, apel fuji, apel manalagi, hingga apel-apel lokal lainnya. Kulitnya mengandung mineral penting seperti potassium, kalsium, asam folat, zat besi dan fosforus. Tak jarang masyarakat mengonsumsinya dengan mengupasnya terlebih dahulu, namun hal ini dapat mempengaruhi warna daging buah apabila sudah dikupas namun tidak langsung dikonsumsi.",
            "Blackberry merupakan buah yang dapat dikonsumsi dan berasal dari suku Rosaceae. Buah ini sebenarnya bukanlah buah berry, secara botani disebut buah agregat. fisiknya memiliki ciri khas berupa drupelet kecil.",
            "Dihasilkan dari beberapa jenis tanaman kaktus dengan marga Hylocereus dan selenicereus. Buah ini berasal dari Meksiko, Amerika Selatan namun kini telah banyak dibudidayakan di Asia, salah satunya yaitu Indonesia. Buah naga ini juga memiliki beberapa jenis yaitu, buah naga putih, kuning, dan merahh. Jenis yang memiliki banyak penggemar yaitu buah naga putih.",
            "Tidak hanya daging buahnya saja yang dimanfaatkan, kulit jeruk juga banyak dimanfaatkan oleh masyarakat. Hal ini dikarenakan kulit jeruk memiliki wangi khas yang menyegarkn sehingga tak jarang diteui produk-produk parfume, lotion, bahkan hingga pengharum ruangan yang memiliki aroma wangi jeruk. Pada umumnya, jeruk diidentikan dengan buah yang berwarna orange menyala, padahal jeruk tidak hanya berwarna orange. Jeruk ada yang berwarna hijau tua, kuning, hingga perpdaduan antara keduanya.",
            "Lemon banyak dimanfaatkan sebagai produk minuman. Di samping rasanya yang segar dengan aroma yang menarik, lemon juga mengandung vitamin yang dipercaya dapat menjaga imunitas tubuh. Banyak ditemui minuman-minuman kesehatan yang melabeli dirinya sebagai minuman dengan sari lemon.",
            "Pear memiliki tekstur daging yang mirip dengan apel dengan bentuk buah seperti bel. Jenis pear yang sering dijumpai  di pasaran adalah pear yang berwarna kuning muda. Pear memiliki kandungan air yang banyak sehingga menyegarkan. ",
            "Pisang identik dengan buah yang memiliki kandungan kalium yang tinggi. Selain itu pisang memiliki banyak jenis dengan karakteristiknya yang berbeda-beda. Ada yang berukuran besar dengan bentuk memanjang seperti pisang tanduk, adapula yang berukuran kecil dan pendek seperti pisang susu. Buah pisang pada umunya tidak berbiji, kecuali pada pisang klutuk atau pisang batu.",
            "Raspberry dalam bahasa Indonesia dikenal sebagai buah frambos. Buah ini ada yang berwarna merah, hitam, ungu, dan kuning. Namnun, buah raspberry merah (Rubus idaeus) adalah jenis raspberry yang paling populer dan banyak dikonsumsi. Rasanya manis dan menyegarkan dengan tekstur yang lembut",
            "Semangka adalah buah yang dihasilkan oleh tanaman rambat yang berasal dari gurun di Afrika bagian selatan. Semangka memiliki kandungan air yang tinggi dengan biji berwarna hitam berukuran kecil-kecil. Biji semangka yang dikeringkan dan disangrai dapat dimakan isinya sebagai kuaci.",
            "Strawberry merupakan salah satu buah dengan tampilan yang cantik dan menarik. sebenarnya buah strawberry adalah buah semu atau bukan buah yang sebenarnya, melainkan merupakan pembesaran dari jaringan dasar bunga. Buah yang sebenarnya adalah biji-biji yang berwarna putih dan berukuran kecil yang disebut anchen. Buah ini memiliki rasa yang segar cenderung masam. Warnanya merah menyala dengan kulit buah yang mengkilap."
    };

    private static int[] fruitImages = {
            R.drawable.apel,
            R.drawable.blackberry,
            R.drawable.buah_naga,
            R.drawable.jeruk,
            R.drawable.lemon,
            R.drawable.pear,
            R.drawable.pisang,
            R.drawable.raspberry,
            R.drawable.semangka,
            R.drawable.strawberry
    };

    static ArrayList<Fruit> getListData() {
        ArrayList<Fruit> list = new ArrayList<>();
        for (int position = 0; position < fruitNames.length; position++) {
            Fruit hero = new Fruit();
            hero.setName(fruitNames[position]);
            hero.setDetail(fruitDetails[position]);
            hero.setPhoto(fruitImages[position]);
            list.add(hero);
        }
        return list;
    }
}
