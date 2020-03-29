package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;

public class ExercicioFixacao {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int numero = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date dataContrato = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double valorContrato = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int numParcelas = sc.nextInt();
		
				
				
				
		sc.close();
	}

}
