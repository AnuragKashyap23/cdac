package com.sunbeam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Account {
	private int accountNumber; 
	private String accountType; 
	private double balance; 
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accountNumber, String accountType, double balance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Account))
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber;
	}

	@Override
	public String toString() {
		return String.format("%-15d%-10s%.2f",this.accountNumber,this.accountType,this.balance); 
	}

	
	
}
class Customer{
	private String name; 
	private String address; 
	private String email; 
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-10s%-5s",this.name,this.address,this.email); 
	}
}
public class Program {
	private static Map<Account,Customer> map = new HashMap<Account, Customer>();
	//private static Map<Account,Customer> map = new LinkedHashMap<Account, Customer>();
	//private static Map<Account,Customer> map = new TreeMap<Account, Customer>();
	private static Scanner sc = new Scanner(System.in); 
	public static Account[] getAccounts( ) {
		Account[] arr = new Account[3];
		arr[0] = new Account(1003, "Saving", 50000);
		arr[1] = new Account(1004, "Current", 750000);
		arr[2] = new Account(1001, "Loan", 100000);
		return arr;

	}
	public static Customer[] getCustomer( ) {
		Customer[] arr = new Customer[3];
		arr[0] = new Customer("Sagar", "Pune", "sagar@gmail.com");
		arr[1] = new Customer("Prashant", "Satara", "prashant@yahoo.com");
		arr[2] = new Customer("Amit", "Mumbai", "amit@rediffmail.com");
		return arr; 
	}
	public static void addRecord(Account[] account, Customer[] customer) {
		for(int i = 0 ; i< 3 ; i++) {
			map.put(account[i], customer[i]); 
		}
	}
	public static Customer findRecord(int accountNumber) {
		Account key = new Account();
		key.setAccountNumber(accountNumber);
		if(map.containsKey(key)) {
			Customer c = map.get(key); 
			return c; 
		}
		return null; 
		
	}
	public static void printRecord(Customer c ) {
		if(c!=null) {
			System.out.println(c.toString());
		}
		else 
			System.out.println("Record not found");
	}
	public static void acceptRecord(int[] accountNumber) {
		System.out.println("Enter the accountNumber");
		accountNumber[0] = sc.nextInt(); 
	}
	public static boolean removeRecord(int accountNumber) {
		Account key = new Account(); 
		key.setAccountNumber(accountNumber);
		if(map.containsKey(key)) {
			map.remove(key); 
			return true; 
		}
		return false; 
	}
	public static void printRecord( ) {
		if(map!=null) {
			Set<Entry<Account, Customer>> entries = map.entrySet(); 
			for (Entry<Account, Customer> en : entries) {
				Account acc = en.getKey(); 
				Customer cus = en.getValue(); 
				System.out.println(acc + "" + cus);
			}
		}
	}
	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.Add Record");
		System.out.println("2.Find Record");
		System.out.println("3.Remove Record");
		System.out.println("4.Print Record");
		System.out.print("Ennter choice	:	");
		return sc.nextInt();
	}	 

	public static void main(String[] args) {
		int[] accountNumber = new int[1]; 
		int choice; 
		while((choice = menuList())!=0) {
			switch (choice) {
			case 1:
				
				Account[] acc = Program.getAccounts(); 
				Customer[] cus = Program.getCustomer();
				Program.addRecord(acc, cus);
				break;
			case 2: 
				Program.acceptRecord(accountNumber);
				Customer c = Program.findRecord(accountNumber[0]); 
				Program.printRecord(c);
				break; 
			case 3: 
				Program.acceptRecord(accountNumber);
				boolean removedstatus = Program.removeRecord(accountNumber[0]); 
				System.out.println(removedstatus ? "Record removed" : "Record not removed");
				break; 
			case 4: 
				Program.printRecord(); 
				break; 
			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}

}
