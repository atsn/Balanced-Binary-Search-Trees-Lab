package Classes;

public class BinaryTreeEnglishSpanish<T extends Comparable<T>>
{
	Node<T> rootnode;

	public void AddToTree(Node<T> node)
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
			
			else if (CurrentNode.compareTo(node) <= 0)
			{
				if (CurrentNode.getLeftNode() != null)
				{
					CurrentNode.setleftNode(node);
					nodeplaced = true;
				}
				else CurrentNode = CurrentNode.getLeftNode();

			}

		}
	}
}
