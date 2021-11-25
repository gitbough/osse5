import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
	@Test
	public void testQueue() {
		
		//versuche leeren Queue mit Länge 0 anzulegen
		try {
			new Queue(0);
			fail("Erwartete Exception wurde nicht geworfen");
		} catch (IllegalArgumentException ignored) {}
		
		//Lege Queue it Länge 3 an
		Queue q = new Queue(3);
		
		
		//Fülle Queue
		assertEquals(q.head, 0);
		assertEquals(q.tail, -1);
		
		q.enqueue(1);
		assertEquals(q.head, 0);
		assertEquals(q.tail, 0);
		
		q.enqueue(2);
		assertEquals(q.head, 0);
		assertEquals(q.tail, 1);
		
		q.enqueue(3);
		assertEquals(q.head, 0);
		assertEquals(q.tail, 2);
		
		//Füge vollem Queue weiter Elemente hinzu
		q.enqueue(4);
		assertEquals(q.head, 0);
		assertEquals(q.tail, 2);
		
		q.enqueue(5);
		assertEquals(q.head, 0);
		assertEquals(q.tail, 2);
		
		//Dequeue
		assertEquals(q.dequeue(), 1);
		assertEquals(q.head, 1);
		assertEquals(q.tail, 2);
		
		assertEquals(q.dequeue(), 2);
		assertEquals(q.head, 2);
		assertEquals(q.tail, 2);
		
		assertEquals(q.dequeue(), 5);
		assertEquals(q.head, 3);
		assertEquals(q.tail, 2);
		
		//Versuche leeren Queue zu dequeuen
		try {
			q.dequeue();
			fail("Erwartete Exception wurde nicht geworfen");
		} catch (IllegalStateException ignored) {}
		
		//Fülle leeren Queue
		q.enqueue(10);
		assertEquals(q.head, 3);
		assertEquals(q.tail, 3);
		
		q.enqueue(20);
		assertEquals(q.head, 3);
		assertEquals(q.tail, 4);
		
		q.enqueue(30);
		assertEquals(q.head, 3);
		assertEquals(q.tail, 5);
		
		//Fülle vollen Queue weiter
		q.enqueue(40);
		assertEquals(q.head, 3);
		assertEquals(q.tail, 5);
		
		//Dequeue
		assertEquals(q.dequeue(), 10);
		assertEquals(q.head, 4);
		assertEquals(q.tail, 5);
		
		assertEquals(q.dequeue(), 20);
		assertEquals(q.head, 5);
		assertEquals(q.tail, 5);
		
		//Queue mit 1 Element (von Länge 3) befüllen
		q.enqueue(50);
		assertEquals(q.head, 5);
		assertEquals(q.tail, 6);
		
		//Dequeue bis Queue leer ist
		assertEquals(q.dequeue(), 40);
		assertEquals(q.head, 6);
		assertEquals(q.tail, 6);
		
		assertEquals(q.dequeue(), 50);
		assertEquals(q.head, 7);
		assertEquals(q.tail, 6);
		
		//Versuche leeren Queue zu dequeuen
		try {
			q.dequeue();
			fail("Erwartete Exception wurde nicht geworfen");
		} catch (IllegalStateException ignored) {}
		
	}

}
