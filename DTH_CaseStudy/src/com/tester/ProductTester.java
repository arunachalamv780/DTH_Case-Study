package com.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.bean.Product;
import com.dao.ProductDAO;

public class ProductTester {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:derby:testdb2;create=true";
		Connection con = null;
		con = DriverManager.getConnection(jdbcURL);
		System.out.println("The connection is established");
		
		ProductDAO dao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		
		//dao.createTable(con);
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Display\n2.Insert\n3.Delete\n4.Update");
			
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				dao.displayRecords(con);
			break;
			
			case 2:
				System.out.println("Enter your ID:");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter your Set Top Box Type");
				String sbtype = sc.nextLine();
				System.out.println("Enter your Set Top Box Features");
				String sbfeature = sc.nextLine();
				System.out.println("Enter your Set Top Box Height");
				int height = Integer.parseInt(sc.nextLine());
				System.out.println("Enter your Set Top Box Width");
				int width = Integer.parseInt(sc.nextLine());
				System.out.println("Enter your Set Top Box Length");
				int length = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Price");
				int price = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Installation Charge");
				int ins_charge = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Upgardation Charge");
				int up_charge = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Discount");
				int discount = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Billing Type");
				String billtype = sc.nextLine();
				System.out.println("Enter the Refundable Deposit Amount");
				int deposit = Integer.parseInt(sc.nextLine());
				Product p1 = new Product(id, sbtype, sbfeature, height, width, length, price, ins_charge, up_charge, discount, billtype, deposit);
				dao.AddProduct(con, p1);
			break;
			case 3:
				System.out.println("Enter your ID: ");
				id = Integer.parseInt(sc.nextLine());
				dao.DeleteProduct(con, id);
			break;
			case 4:
				System.out.println("Enter your ID:");
				int nid = Integer.parseInt(sc.nextLine());
				System.out.println("Enter your Set Top Box Type");
				String nsbtype = sc.nextLine();
				System.out.println("Enter your Set Top Box Features");
				String nsbfeature = sc.nextLine();
				System.out.println("Enter your Set Top Box Height");
				int nheight = Integer.parseInt(sc.nextLine());
				System.out.println("Enter your Set Top Box Width");
				int nwidth = Integer.parseInt(sc.nextLine());
				System.out.println("Enter your Set Top Box Length");
				int nlength = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Price");
				int nprice = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Installation Charge");
				int nins_charge = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Upgardation Charge");
				int nup_charge = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Discount");
				int ndiscount = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Billing Type");
				String nbilltype = sc.nextLine();
				System.out.println("Enter the Refundable Deposit Amount");
				int ndeposit = Integer.parseInt(sc.nextLine());
				
				dao.UpdateProduct(con, nid, nsbtype, nsbfeature, nheight, nwidth, nlength, nprice, nins_charge, nup_charge, ndiscount, nbilltype, ndeposit);
			break;
			}
			System.out.println("Press e to exit!");
			if(sc.nextLine().equals("e"))
			{
				break;
			}
		}
		con.close();

	}

}

