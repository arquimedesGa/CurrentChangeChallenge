package org.current.challenge.utilities;

import org.current.challenge.models.ConversionRate;

public class Conversion {

    private String acronymCombination;
    private InitCodeCurrent initAcronym;
    private InitCodeCurrent initAcronym2;
    private double tazaDeCambio;

    public Conversion(ConversionRate conversionRate) {
        this.tazaDeCambio = conversionRate.conversion_rate();
    }

    public Conversion () {}



    public void setInitAcronym(int promptInt) {
        switch (promptInt) {
            case 1:
                initAcronym = InitCodeCurrent.USD;
                initAcronym2 = InitCodeCurrent.ARS;
                break;
            case 2:
                initAcronym = InitCodeCurrent.ARS;
                initAcronym2 = InitCodeCurrent.USD;
                break;
            case 3:
                initAcronym = InitCodeCurrent.USD;
                initAcronym2 = InitCodeCurrent.BRL;
                break;
            case 4:
                initAcronym = InitCodeCurrent.BRL;
                initAcronym2 = InitCodeCurrent.USD;
                break;
            case 5:
                initAcronym = InitCodeCurrent.USD;
                initAcronym2 = InitCodeCurrent.COP;
                break;
            case 6:
                initAcronym = InitCodeCurrent.COP;
                initAcronym2 = InitCodeCurrent.USD;
                break;
            default:
                System.out.println("Not Valid Option");
        }
    }

    public double getTazaDeCambio() {
        return tazaDeCambio;
    }

    public void setAcronymCombination(String s){
        this.acronymCombination = s;
    }

    public String getAcronymCombination(){
        return this.acronymCombination;
    }

    public String getInitAcronym() {
        return initAcronym.toString();
    }

    public String getInitAcronym2() {
        return initAcronym2.toString();
    }

    public double finalConversion(double taxa, double valor) {
        return taxa * valor;
    }
}
