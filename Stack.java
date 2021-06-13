public class Stack {
int max=10;
int arr[]=new int[max];
int top;
Stack()
{
	top=-1;
}
int push(int x)
{
	if(top>=max-1)
	{
		System.out.println("Bucket is Full");
	}
	else
	{
		arr[++top]=x;
	}
	return 0;
}
int pop()
{
	if(top<0)
	{
		System.out.println("Bucket is empty");
	}
	else
	{
		top--;
	}
	return 0;
}
int peek()
{
	System.out.println(arr[top]);
	return 0;
}
boolean isEmpty()
{
	return (top<0);	
}
int display()
{
	
	int c=0;
	if(isEmpty())
	{
		System.out.println("Bucket is Empty");
	}
	else
	{
	while(c<=top)
	{
		System.out.print(arr[c]+ " ");
		c++;
	}
	}
	return 0;
}
int reverse()
{
	if(isEmpty())
	{
		System.out.println("Bucket is Empty");
	}
	else
	{
	int c=top;
	while(c>=0)
	{
		System.out.print(arr[c]+ " ");
		c--;
	}
	}
	return 0;
}
}
class Main
{
	public static void main(String [] args)
	{
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		s.pop();
		System.out.println();
		s.display();
		System.out.println();
		s.peek();
		s.reverse();
	}
}
