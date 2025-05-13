package day19;

import java.util.Scanner;

class AccountDetails {

	private int id;
	private String name;
	private int pin;
	private double balance;

	public static void main(String[] args) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance, int pin) {
		if (this.pin == pin)
			this.balance = balance;
		else
			System.out.println("Invalid Pin");
	}

	public AccountDetails(int id, String name, int pin, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.pin = pin;

		this.balance = balance;

	}

	@Override
	public String toString() {
		return "AccountDetail [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public AccountDetails() {

	}
}

public class UI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AccountDetails ad = new AccountDetails();
		Boolean iswork =true;

		while (iswork) {
			System.out.println("enter 1 for add the accontdetails");
			System.out.println("enter 2 for update the accontdetails");
			System.out.println("enter 3 for show the accontdetails");
			System.out.println("enter 0 for add exits");
			int key = sc.nextInt();
			sc.nextLine();

			if (key == 1) {
				System.out.println("Enter the accountdetail id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the accountdetail name");
				String name = sc.nextLine();
				System.out.println("Set a Pin");
				int pin = sc.nextInt();
				System.out.println("Enter the Amount ");
				double balance = sc.nextDouble();
				ad = new AccountDetails(id, name, pin, balance);
				
			} else if (key == 2) {
				System.out.println("Enter the Pin");
				int pin = sc.nextInt();
				sc.nextLine();
			
				System.out.println("Enter the Amount ");
				double balance = sc.nextDouble();
				ad.setBalance(balance,pin );

			} else if (key == 3) {
				System.out.println(ad);

			} else if (key == 0) {
				iswork = false;
				System.out.println("exist");

			}

			else {
				System.out.println("thank you");
			}

		}
	}
}
