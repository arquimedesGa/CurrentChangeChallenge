package org.current.challenge.utilities;

import com.google.gson.Gson;
import org.current.challenge.models.ConversionRate;

public class GsonSerialization {

    public static Gson gson;

    public static ConversionRate conversionRate;

    public GsonSerialization () {
        gson = new Gson();
    }
    public static ConversionRate deserialization(String json) {
       return conversionRate = gson.fromJson(json, ConversionRate.class);
    }
}
