package behaviorPatterns.ChainOfResponsibility.Framework;

class ConcreteHandler1 extends Handler {

	@Override
	protected Level getHandlerLevel() {
		return null;
	}

	@Override
	protected Response echo(Request request) {
		return null;
	}

}
