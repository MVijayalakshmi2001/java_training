package com.example.dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {
	
	private Connection con;
	
	
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		
		int rowAdded=0;
		
		String sql="insert into viji_member101 values(?,?,?)";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			
			
		}catch (SQLException e) {
			
			 
		}
		return 0;
	}

	public List<Member> findAll() {
		
		List<Member> memberList = new ArrayList<Member>();
		
		String sql="select * from viji_member101 ";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int memberId=rs.getInt("membership_id");
				String memberName=rs.getString("membername");
				String memberAddress=rs.getString("member_address");
				Date accountOpenDate=rs.getDate("acc_open_date");
				LocalDate getDate= accountOpenDate.toLocalDate();
				String membershipType=rs.getString("membership_type");
				double feesPaid=rs.getDouble("fees_paid");
				int maxBookAllowed=rs.getInt("max_books_allowed");
				double penaltyAmount =rs.getDouble("penalty");
				
				Member mem=new Member(memberId, memberName, memberAddress, getDate, membershipType, feesPaid, maxBookAllowed, penaltyAmount);	
				
				memberList.add(mem);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return memberList;
		
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
