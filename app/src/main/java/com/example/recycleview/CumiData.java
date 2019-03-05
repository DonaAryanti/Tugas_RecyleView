package com.example.recycleview;

import java.util.ArrayList;

public class CumiData {
    private static String[] menu = new String[]{"Cumi Sambal Ijo","Cumi Sambal Setan",
            "Cumi Sambal Pete","Cumi Sambal Balado",
            "Cumi Bakar Sambal Merah", "Cumi Tinta Legit"};

    private static int [] gambar = new int[]{R.drawable.ijoo,R.drawable.setan,
            R.drawable.pete,R.drawable.balado,R.drawable.cumibakar,R.drawable.sambalmerah,
            R.drawable.tintalegit};
    public static ArrayList<CumiModel> getListData(){

        CumiModel cumiModel = null;
        ArrayList<CumiModel> list = new ArrayList<>();
        for (int i=0; i<menu.length; i++ ){
            cumiModel = new CumiModel();
            cumiModel.setJumlahStok(gambar[i]);
            cumiModel.setNamaCumi(menu[i]);
            list.add(cumiModel);

        }

        return list;
    }
}
