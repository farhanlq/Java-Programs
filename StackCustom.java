package arrays;

public class StackCustom {

	int size;
	int arr[];
	int top;

	public StackCustom(int size) {
		super();
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println(element + " is pushed onto the stack");
		} else {
			System.out.println("Stack is Full");
		}

	}

	public int pop() {
		if (!isEmpty()) {
			int retTop = top;
			top--;
			System.out.println("Popped element is " + arr[retTop]);
			return arr[retTop];
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int peek() {
		return arr[top];
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		StackCustom sc = new StackCustom(5);
		sc.push(23);
		sc.push(355);
		sc.push(78);
		sc.pop();
		System.out.println("Element at the peek is " + sc.peek());
	}
}
