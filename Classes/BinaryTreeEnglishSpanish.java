package Classes;

import java.util.List;
import java.util.Stack;

public class BinaryTreeEnglishSpanish<T extends Comparable<T>>
{
	Node<T> rootnode;

	public boolean AddToTree(Node<T> node)
	{
		boolean nodeplaced = false;
		Node<T> CurrentNode = rootnode;
		if (rootnode == null) node = rootnode;
		while (!nodeplaced)
		{
			if (CurrentNode.compareTo(node) > 0)
			{
				if (CurrentNode.getRightNode() != null)
				{
					CurrentNode.setrightNode(node);
					nodeplaced = true;
				}
				else CurrentNode = CurrentNode.getLeftNode();
			}

			else if (CurrentNode.compareTo(node) < 0)
			{
				if (CurrentNode.getLeftNode() != null)
				{
					CurrentNode.setleftNode(node);
					nodeplaced = true;
				}
				else CurrentNode = CurrentNode.getLeftNode();

			}
			else
			{
				return false;
			}

		}
		return true;
	}

	public boolean deleteNode()
	{

		return true;
	}

	public Node<T> Getnodeinorder(T Item)
	{
		Stack<Node<T>> parents = new Stack<Node<T>>();
		Node<T> currentnode = rootnode;
		boolean AllTjeckt = false;

		while (!AllTjeckt)
		{
			if (currentnode.getLeftNode() != null )
			{
				parents.push(currentnode);
				currentnode = currentnode.getLeftNode();
			}
			else if (currentnode.Data.compareTo(Item) == 0)
			{
				return currentnode;
			}
			else if (currentnode.getRightNode() != null)
			{
				parents.push(currentnode);
				currentnode = currentnode.getRightNode();
			}
			else
			{
				currentnode = parents.pop();
			}
		}

		return null;
	}
}
