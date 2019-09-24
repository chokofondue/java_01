
public class vat {

	public static void main(String[] args) {
		
		double total = Double.parseDouble(args[0]);
		double vat = (total*0.1);
		double supplyvalue = (total - vat);
		
		double person1 = supplyvalue*0.5;
		double person2 = supplyvalue*0.3;
		double person3 = supplyvalue*0.2;
		
		System.out.println("합계 : " + total);
		System.out.println("부가가치세 : " + vat);
		System.out.println("공급가액 : " + supplyvalue);
		
		System.out.println("동업자1:"+person1);
		System.out.println("동업자2:"+person2);
		System.out.println("동업자3:"+person3);
		
		
		
	}

}
