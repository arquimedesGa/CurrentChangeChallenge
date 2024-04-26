package org.current.challenge.utilities;

public class Messages {
    private static String mainMessage = """
            *************************************************
            Seja bem-vindo/a ao Conversor de Moeda =)
            1) Dolár =>> Peso Argentino
            2) Peso Argentino =>> Dólar
            3) Dólar =>> Real Brasileiro
            4) Real Brasileiro =>> Dólar
            5) Dólar =>> Peso Colombiano
            6) Peso Colobiano =>> Dólar
            7) Sair
            Escolha uma opçao valida:
            *************************************************
            """;

    public static String getMainMessage() {
        return mainMessage;
    };


}
