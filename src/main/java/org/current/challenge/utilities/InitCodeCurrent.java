package org.current.challenge.utilities;

public enum InitCodeCurrent {
    ARS(1), BOB(2), BRL(3), CLP(4), COP(5), USD(6);

    private Integer code;

    InitCodeCurrent(int i) {
        this.code = i;
    }

    public Integer getCode() {
        return code;
    }

    public static InitCodeCurrent fromNumber(int number){
        for (InitCodeCurrent item : InitCodeCurrent.values()) {
            if(item.code == number) {
                return item;
            }
        }
        throw new IllegalArgumentException("Número inválido: " + number);
    }
}
