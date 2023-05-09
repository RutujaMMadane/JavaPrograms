package Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.setAcc_no(123455678899L);
		acc.setName("Rutuja");
		acc.setEmail("Rutujamadane74728@gmail.com");
		acc.setAmount(689754f);
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getName());
		System.out.println(acc.getEmail());
		System.out.println(acc.getAmount());

	}

}
