package test;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "MLPG3TH/A#8CAAT#iPhone#CAATLabel#D17#1";
		String s = "MLPG3TH/A#8CAAT";
//		String[] aa = s.split(",");
//		for(String a: aa)
//			System.out.println(a);
//		String str="";
		String product = s.substring(0, s.indexOf("#"));
//		str+=product+"#";
		System.out.println(product);
		String type = s.substring(product.length()+1);
//		int typeIndex = s.indexOf("#",str.length());
//		System.out.println(typeIndex);
//		String type = s.substring(str.length(),typeIndex);
		System.out.println(type);
//		str+=type+"#";
//		typeIndex = s.indexOf("#",str.length());
//		System.out.println(typeIndex);
//		String projectCode = s.substring(str.length(),typeIndex);
//		System.out.println(projectCode);
//		str+=projectCode+"#";
//		typeIndex = s.indexOf("#",str.length());
//		System.out.println(typeIndex);
//		String partNumber = s.substring(str.length(),typeIndex);
//		System.out.println(partNumber);
//		str+=partNumber+"#";
//		typeIndex = s.indexOf("#",str.length());
//		System.out.println(typeIndex);
//		String partner = s.substring(str.length(),typeIndex);
//		System.out.println(projectCode);
//		str+=partner+"#";
//		typeIndex = s.indexOf("#",str.length());
//		System.out.println(partner);
//		String version = s.substring(str.length());
//		System.out.println(version);
	}

}
