public class TesteString {
	public static void main(String[] args) { 
		String s1 = "A";
		String s2 = "A";
		s2 = s2 + "";
		if (s1 == s2) { 
			System.out.println("S�o Iguais");
		} else { 
			System.out.println("S�o Diferentes");
		}
	}
}