package Estudos.ExerciciosExceptions.solutionC.main;

import Estudos.ExerciciosExceptions.solutionC.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main (String[] arg) throws ParseException { // propaga a excecao
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room Number: ");
        int num = sc.nextInt();
        System.out.println("Ckeck-In (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next()); //Parse() analisa e converte dados complexos, normalmente representados como uma String, para um tipo estruturado.
        System.out.println("Ckeck-Out (dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if(checkin.after(checkout)) {
            System.out.println("Check-Out date must be ater Check-In date");
        }
        else {
            Reservation reservation = new Reservation(num,checkin,checkout);
            System.out.println("Rservation: " + reservation);

            System.out.println();
            System.out.println("Update data");
            System.out.println("Ckeck-In (dd/MM/yyyy): ");
            Date checkin2 = sdf.parse(sc.next());
            System.out.println("Ckeck-Out (dd/MM/yyyy): ");
            Date checkout2 = sdf.parse(sc.next());
            Date now = new Date();
            if(checkin2.after(checkout2)) {
                System.out.println("Check-Out date must be after Check-In date");
            } else if (!checkin2.after(now)) {
                System.out.println("Check-In date must be a future date");
            }
            else {
                reservation.updateDates(checkin2, checkout2);
            }
        }


        sc.close();
    }
}
