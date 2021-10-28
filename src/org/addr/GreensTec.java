package org.addr;

public class GreensTec {
private void greensOmr(String street,int no) {
System.out.println("greens street: " +street+ "\tgreens number: " +no);


}
private void greensOmr(int no,String street) {
	System.out.println("greens number: " +no+ "\tgreens street: " +street);
}
private void greensOmr(int doorno) {
	System.out.println("greens doornumber: " +doorno);
}
public static void main(String[] args) {
	GreensTec g=new GreensTec();
	g.greensOmr("sainik",07);
	g.greensOmr(15,"bose");
	g.greensOmr(879);

}

}
