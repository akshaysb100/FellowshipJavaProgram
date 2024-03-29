/******************************************************************************
 *  Purpose : Stock program
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   22-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.oop;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class NewPractice {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException{
		boolean isExit = false;
		int choice;
		int indexOfCustomer = 0;
		int indexOfCompany = 0;

		int customerId;
		int companySymbol;
		int numOfCompanyShareToBuy;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HHmmss");

		CompanysharesModel compModel = new CompanysharesModel();
		CustomerinfoModel custModel = new CustomerinfoModel();
		TransactionModel transModel = new TransactionModel();

		// paths of files
		String pathOfCompanyShares = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/companyshare.json";
		String pathOfCustomerInfo = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/customer_info.json";
		String pathOfCompanyShares2 = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/companyshare2.json";
		String pathOfCustomerInfo2 = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/customer_info2.json";
		String pathOfTransaction = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockacount.json";
		// code for fetching json data and put it into models

		// code for fetching the company shares
		compModel = (CompanysharesModel) JsonUtility.readMapper(pathOfCompanyShares, compModel);

		// code for fetching the customer info
		custModel = (CustomerinfoModel) JsonUtility.readMapper(pathOfCustomerInfo, custModel);

		File file = new File(pathOfTransaction);
		if (file.length() != 0) {
			transModel = (TransactionModel) JsonUtility.readMapper(pathOfTransaction, transModel);
		}

		ArrayList<Customerinfo> custList = new ArrayList<Customerinfo>();
		ArrayList<Companyshares> compList = new ArrayList<Companyshares>();
		ArrayList<Transactions> transList = new ArrayList<Transactions>();

		custList.addAll(custModel.getCustomerinfo());
		compList.addAll(compModel.getCompanyshares());

		if (!transModel.getTransactions().isEmpty()) {
			transList.addAll(transModel.getTransactions());
		}

		System.out.println("Welcome!!");
		System.out.println("Please enter customer id");
		customerId = Utility.scanInt();
		boolean isCustomerFound = false;
		for (int i = 0; i < custList.size(); i++) {
			if (customerId == custList.get(i).getCustomer_symbol()) {
				isCustomerFound = true;
				indexOfCustomer = i;
				break;
			}
		}
		if (isCustomerFound) {
			while (!isExit) {
				System.out.println("Welcome: ");
				System.out.println("Please select options\n" + "1. buy shares\n" + "2. sell shares\n"
						+ "3. print report\n" + "4. exit");
				choice = Utility.scanInt();
				switch (choice) {
				case 1:
					// buy

					System.out.println("****************buy***************");

					System.out.println("Please enter company symbol: ");
					companySymbol = Utility.scanInt();

					System.out.println("Validating...");
					boolean isCompanyFound = false;
					for (int i = 0; i < compList.size(); i++) {
						if (companySymbol == compList.get(i).getCompany_symbol()) {
							isCompanyFound = true;
							indexOfCompany = i;
							break;
						}
					}
					int customerBalance = custList.get(indexOfCustomer).getCustomer_balance();
					if (isCompanyFound) {
						System.out.println("Please enter how much shares to buy: ");
						numOfCompanyShareToBuy = Utility.scanInt();

						// checking whether amount to buy whether user has that much amount or not
						if (numOfCompanyShareToBuy < compList.get(indexOfCompany).getCompany_shares()) {
							// checking user has that much amount or not
							if (customerBalance > (numOfCompanyShareToBuy
									* compList.get(indexOfCompany).getCompany_share_price())) {
								int newCustomerBalance = customerBalance - numOfCompanyShareToBuy
										* compList.get(indexOfCompany).getCompany_share_price();

								// deducting customer balance
								custList.get(indexOfCustomer).setCustomer_balance(newCustomerBalance);
								// adding customer shares
								custList.get(indexOfCustomer).setCustomer_shares(
										custList.get(indexOfCustomer).getCustomer_shares() + numOfCompanyShareToBuy);
								// deducting the company share
								compList.get(indexOfCompany).setCompany_shares(
										compList.get(indexOfCompany).getCompany_shares() - numOfCompanyShareToBuy);
								// calculating new total value of company
								compList.get(indexOfCompany)
										.setCompany_total_value(compList.get(indexOfCompany).getCompany_share_price()
												* compList.get(indexOfCompany).getCompany_shares());

								// code reflecting transaction
								Transactions trans = new Transactions();
								LocalDateTime now = LocalDateTime.now();

								String transId = dateTimeFormatter2.format(now)
										+ custList.get(indexOfCustomer).getCustomer_symbol()
										+ compList.get(indexOfCompany).getCompany_symbol();
								trans.setTransaction_id(transId);
							trans.setBuyer(custList.get(indexOfCustomer).getCustomer_name());
								trans.setSeller(compList.get(indexOfCompany).getCompany_name());
								trans.setTransaction_amount(
										numOfCompanyShareToBuy * compList.get(indexOfCompany).getCompany_share_price());
								trans.setDatetime(dateTimeFormatter.format(now));

								transList.add(trans);
							int saveOrNot;
								System.out.println("Press\n" + "1. for save \n2. for not save");
								saveOrNot = Utility.scanInt();
								if (saveOrNot == 1) {
									JsonUtility.writeMapper(pathOfCompanyShares2, compModel.getCompanyshares());
									JsonUtility.writeMapper(pathOfCustomerInfo2, custModel.getCustomerinfo());
									transModel.setTransactions(transList);
									transModel.setTransaction("Transactions");
									JsonUtility.writeMapper(pathOfTransaction, transModel);
									System.out.println("Transaction has saved");
								} else if (saveOrNot == 2) {
									System.out.println("Transaction not saved");
								} else
									System.out.println("Transaction get void");

							} else
								System.out.println("You dont have enough balance");
						} else {
							System.out.println("Company don't have that much shares");
						}

					} else {
						System.out.println("Company not identified please try again...");
					}
					System.out.println("****************buy***************");
					break;
				case 2:
					// sell
					System.out.println("****************sell***************");

					System.out.println("Enter number of share you want to sell");

					int share = Utility.scanInt();

					System.out.println("Please enter company symbol to who you want to sell: ");
					companySymbol = Utility.scanInt();

					System.out.println("Validating...");
					boolean isCompanyFound2 = false;
					for (int i = 0; i < compList.size(); i++) {
						if (companySymbol == compList.get(i).getCompany_symbol()) {
							isCompanyFound2 = true;
							indexOfCompany = i;
							break;
						}
					}

					// if company is valid
					if (isCompanyFound2) {
						int amountToGet = share * compList.get(indexOfCompany).getCompany_share_price();
						// company share increase
						if (share <= custList.get(indexOfCustomer).getCustomer_shares()) {
							compList.get(indexOfCompany)
									.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() + share);
							// company value increase
							compList.get(indexOfCompany)
									.setCompany_total_value(compList.get(indexOfCompany).getCompany_share_price()
											* compList.get(indexOfCompany).getCompany_shares());

							// customer share decrease
							custList.get(indexOfCustomer)
									.setCustomer_shares(custList.get(indexOfCustomer).getCustomer_shares() + share);

							// customer balance increase

							custList.get(indexOfCustomer).setCustomer_balance(
									custList.get(indexOfCustomer).getCustomer_balance() + amountToGet);

							// code reflecting transaction
							Transactions trans = new Transactions();
							LocalDateTime now = LocalDateTime.now();

							String transId = dateTimeFormatter2.format(now)
									+ custList.get(indexOfCustomer).getCustomer_symbol()
									+ compList.get(indexOfCompany).getCompany_symbol();

							
							trans.setTransaction_id(transId);
							trans.setBuyer(compList.get(indexOfCompany).getCompany_name());
							trans.setSeller(custList.get(indexOfCustomer).getCustomer_name());
							trans.setTransaction_amount(share * compList.get(indexOfCompany).getCompany_share_price());
							trans.setDatetime(dateTimeFormatter.format(now));

					     	transList.add(trans);

							int saveOrNot;
							System.out.println("Press\n" + "1. for save \n2. for not save");
							saveOrNot = Utility.scanInt();
							if (saveOrNot == 1) {
								JsonUtility.writeMapper(pathOfCompanyShares2, compModel.getCompanyshares());
								JsonUtility.writeMapper(pathOfCustomerInfo2, custModel.getCustomerinfo());
								transModel.setTransactions(transList);
								transModel.setTransaction("Transactions");
								JsonUtility.writeMapper(pathOfTransaction, transModel);
								System.out.println("Transaction has saved");
							} else if (saveOrNot == 2) {
								System.out.println("Transaction not saved");
							} else
								System.out.println("Transaction get void");

						} else {
							System.out.println("You dont have that much shares to sell");
						}

					} else
						System.out.println("Company not found please try again");

					System.out.println("****************sell***************");
					break;
//				case 3:
//					// save
//					System.out.println("****************save***************");
//
//					System.out.println("****************save***************");
//					break;
				case 3:
					// print report
					System.out.println("****************report***************");
					System.out.println();
					System.out.println();
					System.out.print("Transaction_ID\t");
					System.out.print("Buyer\t\t");
					System.out.print("Seller\t\t\t");
					System.out.print("Trans_Amt\t");
					System.out.println("DateTime\t");
					
					
					for (int i = 0; i < transList.size(); i++) {
						System.out.print(transList.get(i).getTransaction_id() + "\t");
						System.out.print(transList.get(i).getBuyer() + "\t\t");
						System.out.print(transList.get(i).getSeller() + "\t\t");
						System.out.print(transList.get(i).getTransaction_amount() + "\t");
						System.out.println(transList.get(i).getDatetime() + "\t");
					}
					
					System.out.println();
					System.out.println();
					System.out.println("****************report***************");
					break;
				case 4:
					isExit = true;
					System.out.println("Thank you for using service");
					break;
				default:
					System.out.println("Please select valid option");
				}// end of switch loop

			} // end of while loop

		} else {
			System.out.println("Invalid customer id");
		}
	}
}
