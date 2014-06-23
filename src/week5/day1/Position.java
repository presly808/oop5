package week5.day1;

public enum Position {
	
	JUNIOR(Language.PYTHON), MIDDLE(Language.JAVA), SENIOR(Language.C);
	
	final Language language;

	private Position(Language language) {
		this.language = language;
	}
	
	
	
}
