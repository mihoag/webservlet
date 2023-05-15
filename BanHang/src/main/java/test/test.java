package test;
import model.*;

import java.util.List;

import DAO.*;
public class test {
   public static void main(String[] args) {
	banhang b1 = new banhang("minhhoang","123456","0523727610","xem phim","toi muon tro thanh software engineer");
	banhang b2 = new banhang("admin","123456zz","0523721239","nghe nhac","toi muon tro thanh frontend");
	
	DAObanhang d = DAObanhang.getInstance();
	d.insert(b1);
	d.insert(b2);
	
    List<banhang> ls = d.selectAll();
    for(banhang b : ls)
    {
    	System.out.println(b.getUsername());
    }
   }
}
