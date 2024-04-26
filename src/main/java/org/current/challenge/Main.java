package org.current.challenge;

import com.google.gson.Gson;
import org.current.challenge.connection.HttpConnectionApi;
import org.current.challenge.connection.UrlConnection;
import org.current.challenge.models.ConversionRate;
import org.current.challenge.utilities.Conversion;
import org.current.challenge.utilities.Messages;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        try {

            int promptInt = 0;

            double promptValue = 0.0;

            while (promptInt !=7) {

                System.out.println(Messages.getMainMessage());

                Scanner prompt = new Scanner(System.in);

                promptInt = prompt.nextInt();

                if (promptInt != 7) {
                    System.out.println("digite o valor que deseja converter");

                    Scanner promptV = new Scanner(System.in);

                    promptValue = promptV.nextDouble();

                    Conversion conversion = new Conversion();

                    conversion.setInitAcronym(promptInt);

                    conversion.setAcronymCombination(conversion.getInitAcronym() + "/" + conversion.getInitAcronym2());

                    String url = UrlConnection.getUrl() + UrlConnection.getApiKey() + "/pair/" + conversion.getAcronymCombination();

                    String httpConnectionApi = HttpConnectionApi.conecction(url);

                    Gson gson = new Gson();

                    ConversionRate deserialization = gson.fromJson(httpConnectionApi, ConversionRate.class);

                    Conversion convert = new Conversion(deserialization);

                    double conversionFinal = conversion.finalConversion(convert.getTazaDeCambio(), promptValue);

                    System.out.println("Valor " + promptValue + " " + conversion.getInitAcronym() + " Corresponde al valor dinal de =>> " + String.format("%.2f", conversionFinal) + " " + conversion.getInitAcronym2());
                }

            }
            System.out.println("obrigado por usar el conversor");

        } catch (NullPointerException e) {
            e.getMessage();
        }


    }
}