package structurePatterns.DecoratorPattern.Example;

class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	public void reportHighScore(){
		System.out.println("这次考试语文最高75，数学78，自然80");
	}
	
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
	}
	
}
