package replaceConditionalWithPolymorphism;

public class Main {
	public static void main(String[] args) throws Exception {
		ViajanteFinal viajante1 = new Alemao();
		ViajanteFinal viajante2 = new Brasileiro();
		
		System.out.println(viajante1.getBebida());
		System.out.println(viajante2.getBebida());
	}
}
