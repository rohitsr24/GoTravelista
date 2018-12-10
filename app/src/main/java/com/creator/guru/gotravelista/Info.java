package com.creator.guru.gotravelista;

import android.content.Context;

import java.util.List;

public class Info {

    public static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.info_internet_name),
                context.getString(R.string.info_internet_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_konbini_name),
                context.getString(R.string.info_konbini_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_transport_name),
                context.getString(R.string.info_transport_description),
                null,
                null,
                null,
                null,
                -1
        ));
    }
}
