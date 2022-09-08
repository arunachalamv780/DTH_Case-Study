package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.Product;



public class ProductDAO {
	
	public void createTable(Connection con) throws SQLException
	{
		String sql = "Create table Product( id int NOT NULL PRIMARY KEY,sbtype varchar(25),sbfeature varchar(25),height int,width int, length int, price int,ins_charge int,up_charge int,discount int,billtype varchar(25),deposit int)";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
	}
	
	public int AddProduct(Connection con,Product p) throws SQLException
	{
		int rows =0;
		String sql = "insert into Product values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, p.getId());
		ps.setString(2,p.getSbtype());
		ps.setString(3,p.getSbfeature());
		ps.setInt(4,p.getHeight());
		ps.setInt(5,p.getWidth());
		ps.setInt(6,p.getLength());
		ps.setInt(7,p.getPrice());
		ps.setInt(8,p.getIns_charge());
		ps.setInt(9, p.getUp_charge());
		ps.setInt(10, p.getDiscount());
		ps.setString(11, p.getBilltype());
		ps.setInt(12, p.getDeposit());
		rows = ps.executeUpdate();
		return rows;
		
	}
	
	public int UpdateProduct(Connection con,int id,String sbtype,String sbfeature,int height,int width,int length,int price,int ins_charge,int up_charge,int discount,String billtype,int deposit) throws SQLException
	{
		int updated=0;
		String sql ="update Product set sbtype=?,sbfeature=?,height=?,width=?,length=?,price=?,ins_charge=?,up_charge=?,discount=?,billtype=?,deposit=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sbtype);
		ps.setString(2, sbfeature);
		ps.setInt(3, height);
		ps.setInt(4, width);
		ps.setInt(5, length);
		ps.setInt(6, price);
		ps.setInt(7, ins_charge);
		ps.setInt(8, up_charge);
		ps.setInt(9, discount);
		ps.setString(10, billtype);
		ps.setInt(11,deposit);
		ps.setInt(12, id);
		updated = ps.executeUpdate();
		return updated;
	}

	public void DeleteProduct(Connection con,int id) throws SQLException
	{
		String sql = "delete from Product where id = ?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
	}
	
	public static void displayRecords(Connection con) throws SQLException
	{
		String sql = "select id ,sbtype ,sbfeature ,height ,width , length , price ,ins_charge ,up_charge ,discount ,billtype ,deposit from Product";
		Statement stmpt = con.createStatement();
		
		ResultSet resultObj = stmpt.executeQuery(sql);
		while(resultObj.next())
		{
			System.out.println(String.format("ID: %d",resultObj.getInt("id")));
			System.out.println(String.format("Set Top Box Type: %s",resultObj.getString("sbtype")));
			System.out.println(String.format("Set Top Box Features: %s",resultObj.getString("sbfeature")));
			System.out.println(String.format("Height: %d",resultObj.getInt("height")));
			System.out.println(String.format("Width: %d",resultObj.getInt("width")));
			System.out.println(String.format("Length: %d",resultObj.getInt("length")));
			System.out.println(String.format("Price: %d",resultObj.getInt("price")));
			System.out.println(String.format("Installation Charge: %d",resultObj.getInt("ins_charge")));
			System.out.println(String.format("Upgradation Charge: %d",resultObj.getInt("up_charge")));
			System.out.println(String.format("Discount: %d",resultObj.getInt("discount")));
			System.out.println(String.format("Billing Type: %s",resultObj.getString("billtype")));
			System.out.println(String.format("Refundable Deposit Amount: %d",resultObj.getInt("deposit")));
			
		}
	}
}
