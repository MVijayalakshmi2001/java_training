package com.example.demo.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.example.ifaces.CrudRepository;

public class Services implements CrudRepository<LoanApplication> {

	private Connection con;
	
	public Services(Connection con) {
		super();
		this.con = con;
	}

	
	public List<LoanApplication> findAll() {
		
		List<LoanApplication> loanList = new ArrayList<LoanApplication>();
		
		
		String sql="select vc.customer_id,vc.customer_name,vc.phone_number,vc.credit_score,vp.application_number,vp.customer_ref,vp.loan_amount from viji_customer vc , viji_loan_application vp where  vc.customer_id = vp.customer_ref ";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				int customerId=rs.getInt(1);
				String customerName = rs.getString(2);
				long phoneNumber = rs.getLong(3);
				double creditScore=rs.getDouble(4);

				int applicationNumber=rs.getInt(5);
				int customerRef=rs.getInt(6);
				double loanAmount =rs.getDouble(7);
				Customer cus= new Customer(customerId, customerName, phoneNumber, creditScore);
			
				LoanApplication loan=new LoanApplication(applicationNumber,cus , loanAmount);
				
				loanList.add(loan);
				
			}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return loanList;
		
	}

	public int add(LoanApplication obj) {
		
		int rowAdded=0;
		
		String sql1 = "insert into viji_loan_application values(?,?,? )";
		
		String sql2 = "insert into viji_customer values(?,?,?,?)";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql1); 
				PreparedStatement pstmt2=con.prepareStatement(sql2)){
			
			pstmt2.setInt(1, obj.getCustomer().getCustomerId());
			pstmt2.setString(2, obj.getCustomer().getCustomerName());
			pstmt2.setLong(3, obj.getCustomer().getPhoneNumber());
			pstmt2.setDouble(4, obj.getCustomer().getCreditScore());
			pstmt2.executeUpdate();


			pstmt.setInt(1, obj.getApplicationNumber());
			pstmt.setInt(2, obj.getCustomer().getCustomerId());
			pstmt.setDouble(3, obj.getLoanAmount());
			rowAdded=pstmt.executeUpdate();
			
			
			}catch (Exception e) {
			e.printStackTrace();		
		}
		return rowAdded;
	}



		
		public Optional<LoanApplication> findById(int id){
			
			Optional<LoanApplication> obj=Optional.empty();

			String sql="select vc.customer_id,vc.customer_name,vc.phone_number,vc.credit_score,vp.application_number,vp.customer_ref,vp.loan_amount from viji_customer vc , viji_loan_application vp where  vc.customer_id =? ";

			
			try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
				pstmt.setInt(1, id);
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					
					int customerId=rs.getInt(1);
					String customerName = rs.getString(2);
					long phoneNumber = rs.getLong(3);
					double creditScore=rs.getDouble(4);

					int applicationNumber=rs.getInt(5);
					int customerRef=rs.getInt(6);
					double loanAmount =rs.getDouble(7);
					
					Customer cus1= new Customer(customerId, customerName, phoneNumber, creditScore);
					
					LoanApplication loan1=new LoanApplication(applicationNumber,cus1 , loanAmount);
					
					obj=Optional.of(loan1);
				}


				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			return obj;
		}


		@Override
		public int remove(int id) {
			// TODO Auto-generated method stub
			
			int rowsDeleted=0;
			
			String sql="select vc.customer_id,vc.customer_name,vc.phone_number,vc.credit_score,vp.application_number,vp.customer_ref,vp.loan_amount from viji_customer vc , viji_loan_application vp where  vc.customer_id =?";
			
			try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
				pstmt.setInt(1,id);
				
				rowsDeleted=pstmt.executeUpdate();
				
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			return rowsDeleted;
		}
			


		@Override
		public int update(int Id, LoanApplication loan) {
			// TODO Auto-generated method stub
			return 0;
		}
}
			
		

	
