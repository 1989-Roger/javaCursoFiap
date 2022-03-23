package com.company;

import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        URL oracle = new URL("https://economia.uol.com.br/cotacoes/cambio/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}


