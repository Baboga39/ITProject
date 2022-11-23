package com.sql.Control;
//Hai
import java.util.List;

import com.sql.Dao.DAO;
import com.sql.Model.Coment;
import com.sql.Model.Order;

public class Test {
	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}

	public static void main(String[] args) {
		try {
			DAO dao = new DAO();
			String Title = "1";
			int bId = 2;
			String Name = "1";
			String BlogImage =  "1";
			String BlogCon1 =  "1";
			String BlogCon2 =  "1";
			String BlogCon3 =  "1";
			String Quotes =  "1";
			String Author =  "1";
			String ImageDetail =  "1";
			String AuthorQuotes =  "1";
			dao.InsertBlog(Title, bId, BlogImage, BlogCon1, BlogCon2, BlogCon3, Quotes, Author, ImageDetail, AuthorQuotes, getCurrentDate(), Name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	}
