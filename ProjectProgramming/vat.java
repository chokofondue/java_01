
public class vat {

	public static void main(String[] args) {
		
		double total = Double.parseDouble(args[0]);
		double vat = (total*0.1);
		double supplyvalue = (total - vat);
		
		double person1 = supplyvalue*0.5;
		double person2 = supplyvalue*0.3;
		double person3 = supplyvalue*0.2;
		
		System.out.println("�հ� : " + total);
		System.out.println("�ΰ���ġ�� : " + vat);
		System.out.println("���ް��� : " + supplyvalue);
		
		System.out.println("������1:"+person1);
		System.out.println("������2:"+person2);
		System.out.println("������3:"+person3);
		
		
		
	}

}
