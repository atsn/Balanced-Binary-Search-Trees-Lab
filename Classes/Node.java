package Classes;

public class Node<T extends Comparable<T>>
{
	private Node<T> left;
	private Node<T> right;
	public T Data;


	public Node(Node<T> rightnode, Node<T> Leftnode, T data)
	{
		Data = data;
		setleftNode(Leftnode);
		setrightNode(rightnode);
	}

	public boolean setrightNode(Node<T> rightNode)
	{
		if (rightNode == null) right = null;
		if (rightNode.compareTo(this) > 0)
		{
			right = rightNode;
			return true;
		}
		return false;
	}

	public boolean setleftNode(Node<T> leftNode)
	{
		if (leftNode == null) left = null;
		if (leftNode.compareTo(this) < 0)
		{
			left = leftNode;
			return true;
		}
		else return false;
	}

	public Node<T> getLeftNode()
	{
		return left;
	}

	public Node<T> getRightNode()
	{
		return right;
	}

	public int compareTo(Node<T> node)
	{
		return Data.compareTo(node.Data);
	}

}
