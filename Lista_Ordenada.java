package br.uft.edu.uft2023.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

	public class Lista_Ordenada {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> nomes = new ArrayList<>();

	        System.out.println("Digite os nomes (digite 'F' para encerrar a entrada):");
	        String nome;
	        
	        while (true) {
	            nome = scanner.nextLine();
	            if (nome.equals("F")) {
	                break;
	            }
	            nomes.add(nome);
	        }

	        scanner.close();

	        // Ordena a lista de nomes em ordem aflabetica
	        Collections.sort(nomes); 

	        System.out.println("Nomes em ordem alfabética:");
	        for (String nomeOrdenado : nomes) {
	            System.out.println(nomeOrdenado);
	        }
	    }
	}


