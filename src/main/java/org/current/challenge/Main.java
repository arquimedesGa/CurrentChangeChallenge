package org.current.challenge;

import com.google.gson.Gson;
import org.current.challenge.connection.HttpConnectionApi;
import org.current.challenge.connection.UrlConnection;
import org.current.challenge.models.ConversionRate;
import org.current.challenge.utilities.Conversion;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        System.out.println("Digite uma opcao para convertir");

        Scanner prompt = new Scanner(System.in);

         int promptInt = prompt.nextInt();

        System.out.println("digite o valor a Convertir");

        Scanner promptV = new Scanner(System.in);

        int promptValue = promptV.nextInt();

        Conversion conversion = new Conversion();

        conversion.setInitAcronym(promptInt);

         conversion.setAcronymCombination(conversion.getInitAcronym() + "/" + conversion.getInitAcronym2());

         String url = UrlConnection.getUrl() + UrlConnection.getApiKey() + "/pair/" + conversion.getAcronymCombination();

         String httpConnectionApi = HttpConnectionApi.conecction(url);

        Gson gson = new Gson();

        ConversionRate deserialization = gson.fromJson(httpConnectionApi, ConversionRate.class);

        Conversion convert = new Conversion(deserialization);

        double d = conversion.finalConversion(convert.getTazaDeCambio(), promptValue);

        System.out.println(d);




    }
}