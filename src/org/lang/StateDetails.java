package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("DDD");
	}
	private void northIndia() {
	System.out.println("EEE");
}
	public static void main(String[] args) {
		StateDetails c = new StateDetails();
		c.southIndia();
		c.northIndia();
		LanguageInfo b = new LanguageInfo();
		b.tamilLanguage();
		b.englishLanguage();
		b.hindiLanguage();	
	}
}
