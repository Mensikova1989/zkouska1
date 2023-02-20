package mensikova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mensikova
 * Record of insured persons app
 */
public class InsuredPersonsRecordApp { 
    Scanner sc = new Scanner(System.in);
    private boolean end = false;
    private ArrayList<Person> insuredPersonsList = new ArrayList<>();
    public void App() {
        showFirst();
        while (!end) {
            showMenu();
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1 ->
                    addRecord();
                case 2 ->
                    showinsuredPersonsList();
                case 3 -> 
                    searchPerson();
                case 4 ->
                    end = true;
                default ->
                    System.out.println();
            }
        }
    }
    
    /**
     * @param person
     * Add new person to list
     */
    public void addPerson(Person person) {
        insuredPersonsList.add(person);
    }

    /**
     * Welcome text
     */
    public void showFirst() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("\t ----------------------------- Evidence pojištěných -----------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
    }

    /**
     * Main menu of app
     */
    public void showMenu() {
        /** Welcome in our app **/
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Dobrý den, prosím vyberte jednu z níže uvedených možností:");
        System.out.println("1 - Nová pojištěná osoba");
        System.out.println("2 - Výpis pojištěných osob");
        System.out.println("3 - Hledat pojištěnou osobu");
        System.out.println("4 - Ukončit program");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
    }

    /**
     * Add person to insured persons list
     */
    public void addRecord() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Byla zvolena volba - přidání nové osoby");
        System.out.println("-----------------------------------------------------------------------------------");

        /** Getting data from user **/
        System.out.println();
        System.out.print("Nyní prosím uveďte jméno pojištěné osoby:");
        String namePojisteneho = sc.nextLine().trim();
        System.out.print("Dále prosím uveďte příjmení pojištěné osoby: ");
        String surnamePojisteneho = sc.nextLine().trim();
        System.out.print("Prosím zadejte věk pojištěné osoby: ");
        int agePojisteneho = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Prosíme Vás také o telefonní číslo pojištěné osoby: ");
        String phoneNumberPojisteneho = sc.nextLine().trim();

        /** Adding person to record **/
        addPerson(new Person(namePojisteneho, surnamePojisteneho, agePojisteneho, phoneNumberPojisteneho));

        /** Everything is OK - data have been saved **/
        System.out.println();
        System.out.println("Data byla uložena.");
    }

    /**
     * This function will return Persons list
     */
    public void showinsuredPersonsList() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Byla zvolena volba - výpis pojištěných osob");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        for (Person z : insuredPersonsList) {
            System.out.print(z.getname() + "\t" + z.getsurname() + "\t" + z.getage() + "\t" + z.getphoneNumber());
            System.out.println();
        }
    }

    /**
     * This function is for searchin persons
     */
    public void searchPerson() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Byla zvolena volba - vyhledávání osoby");
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("Zadejte hledané jméno: ");
        String searchname = sc.nextLine().trim();
        System.out.println("Zadejte hledané příjmení: ");
        String searchsurname = sc.nextLine().trim();
        System.out.println();
        
        for (Person g : insuredPersonsList) {
            if (g.getname().equals(searchname) && g.getsurname().equals(searchsurname)) {
                System.out.print(g.getname() + "\t" + g.getsurname() + "\t" + g.getage() + "\t" + g.getphoneNumber());
                System.out.println();
            }
        }
    }
}
