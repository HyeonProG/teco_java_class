package structure.ch03;

public class IntArrayQueue {

	private int[] array;
	private int front; // 큐의 시작점
	private int rear; // 큐의 끝지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수

	public IntArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어 보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo - 1 데이터 넣기 기능 구현
	public void enqueue(int item) {
		// 방어적 코드
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득 찼습니다.");
		} else {
			// rear
			rear++; // 0 <-- (첫 동작 시)
			array[rear] = item; // array[0] = item;
			size++;
		}
	}

	// todo - 2 데이터 꺼내기
	public int dequeue() {
		int item = -9999;
		
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
		} else {
			// 잠시 데이터 꺼내 보기
			item = array[front]; // 0 번째 요소에 접근
			// 임시 데이터 - 100, 200, 300
			// front = 0 (처음 꺼낼 시) 
			for (int i = front; i < rear; i++) { // 0 < 2
				// array[0] = array[1];
				// 200, 200, 300 --> for 1번 동작
				// 200, 300, 300 --> for 2번 동작
				array[i] = array[i + 1];
			}
			// 200, 300, 0
			// 마지막 요소를 초기화 처리 한다.
			array[rear] = 0;
			rear--;
			size--;
		}
		return item;
	}

	// todo - 3 데이터 찾기(peek)
	public int peek() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return -9999;
		} else {
			// peek --> 맨 앞에 데이터를 리턴 시켜주는 기능일 뿐
			return array[front];
		}
		
	}
	
	
	// 코드 테스트
	public static void main(String[] args) {
		IntArrayQueue queue = new IntArrayQueue(3);
		
		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		//queue.enqueue(400); // 메모리 공간이 가득 차서 안들어감
		
		// 데이터 꺼내고 삭제 처리
		// queue.dequeue(); // 맨 처음 들어온 요소 부터 꺼내지고 삭제 처리 된다.
		
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
	} // end of main
	
} // end of class
