package week5.day2.struct;

public class MyStack implements IStack {

	private Object[] mas;
	private int counter;//0, 1
	
	public MyStack(int size) {
		super();
		mas = new Object[size];
	}

	@Override
	public void push(Object o) {
		mas[counter++] = o;
	}

	@Override
	public Object pop() {
		if(counter < 1){
			throw new EmptyStackException("Stack is empty");
		}
		Object temp = mas[--counter];
		mas[counter] = null;
		return temp;
	}
	
	
}
