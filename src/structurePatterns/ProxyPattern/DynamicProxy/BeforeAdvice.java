package structurePatterns.ProxyPattern.DynamicProxy;

class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("I'm a notice and I'm being executing.");
	}

}
