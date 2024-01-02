package de_23671;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	ArrayList<SachGiaoTrinh> listSach = new ArrayList<>() ; 
	public ArrayList<SachGiaoTrinh> taoDuLieu() {
		String[] tieude = {"truyen","tho","kham pha","kinh di", "hai huoc", "sau lang","bay bong","kinh te","khoa hoc","van hoa"}; 
		String[] author = {"tay du ki", "tet o lang dia nguc","conan", "doremon","cau truc du lieu va giai thuat", "OOP java"};
		String[] years = {"2000","1999","1981","2004","2002"};
 		for(int i = 0 ; i < 11 ; i ++ ) {
			SachGiaoTrinh p = new SachGiaoTrinh(); 
			p.setTitle(tieude[(int)(Math.random()*(tieude.length))]);
			p.setAuthor(author[(int)(Math.random()*(author.length))]);
			p.setYear(years[(int)(Math.random()*(years.length))]);
			p.setPrice((int)(Math.random()*1000));
			listSach.add(p);
		}
 		Collections.sort(listSach,Comparator.comparing(SachGiaoTrinh::getPrice));
 		return listSach ; 
	}
	public void printList(ArrayList<SachGiaoTrinh> listSach) {
		listSach.forEach(go->{
			System.out.println(go);
		});
	}
	public boolean timKiem(String tieude){
		boolean find = false ;
		for(SachGiaoTrinh i : this.listSach) {
			if(i.getTitle().contains(tieude)) {
				find = true ;
				Scanner sn = new Scanner(System.in);
				System.out.print("Nhap tieu de:");
				i.setTitle(sn.nextLine());
				System.out.print("Nhap tac gia:");
				i.setAuthor(sn.nextLine());
				System.out.print("Nhap nam:");
				i.setYear(sn.nextLine()) ;
				System.out.print("Nhap gia:");
				i.setPrice(sn.nextDouble());
			}
		}
		Collections.sort(listSach,Comparator.comparing(SachGiaoTrinh::getYear));
		return find ; 
	}
	
	public static void main(String[] args) {
		Test t1 = new Test() ; 
		ArrayList<SachGiaoTrinh> listSach = t1.taoDuLieu();
		t1.printList(listSach);
		Scanner sn = new Scanner(System.in);
		System.out.print("Nhap tieu de muon tim:");
		String tieude = sn.nextLine();
		t1.timKiem(tieude);
		System.out.println("sau khi sua");
		t1.printList(listSach);
	}
}
