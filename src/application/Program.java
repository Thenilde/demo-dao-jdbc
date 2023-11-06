package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Departament obj=new Departament(1 ," Books");
		
		Seller seller =new Seller( 1 ,"Thenilde", "thenilde@hotmail.com", new Date(),3000.0, obj);
		System.out.println(seller);
	}

}
