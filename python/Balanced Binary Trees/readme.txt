	BALANCED BINARY TREES(AVL TREES)

	A binary tree is said to be balanced when the height difference between left subtree 
	and right subtree is -1,0,1. If not then it is called as unbalanced bianary
	tree.

	AVL trees are self balanced Binary Search Tree. A BST is a tree where left 
	subtree is smaller than root node and right subtree is greater than root node.

	Balance Factor:
		The balance factor in AVL Trees is an additional value associated with each node
		of the tree that represents the height difference between the left and the right
		subtree of a given node. The balance factor of a given node can be represented as:
	
	Balance_factor = (Height of left sub_tree) - (Height of right sub_tree)

	Tree Rotation
	
	It is the process of changing the structure of the tree by moving smaller subtrees down
	and larger subtrees up, withour interfering with the order of the elements.

	There are Two types of Rotation:
	
		1) Single Rotation
			
			a) LL Rotation
			b) RR Rotation

		2) Double Rotation
			
			a) RL Rotation
			b) LR Rotation
	LL Rotation:

		It is a type of single rotation that is performed when the tree gets 
		unbalanced, upon insertion of a node into the left subtree of the left 
		child of the imbalance node i.e., upon Left-Left (LL) insertion. This 
		imbalance indicates that the tree is heavy on the left side. Hence, a 
		right rotation (or clockwise rotation) is applied such that this left 
		heaviness imbalance is countered and the tree becomes a balanced tree. 
	
	RR Rotation:

		It is similar to that of LL Rotation but in this case, the tree gets 
		unbalanced, upon insertion of a node into the right subtree of the right 
		child of the imbalance node i.e., upon Right-Right (RR) insertion instead 
		of the LL insertion. In this case, the tree becomes right heavy and a left 
		rotation (or anti-clockwise rotation) is performed along the edge of the 
		imbalanced node to counter this right skewness caused by the insertion 
		operation. 

	LR Rotaton:
		
		LR rotation = RR rotation + LL rotation, i.e., first RR rotation is 
		performed on subtree and then LL rotation is performed on full tree, 
		by full tree we mean the first node from the path of inserted node whose 
		balance factor is other than -1, 0, or 1.

	RL Rotation:
		R L rotation = LL rotation + RR rotation, i.e., first LL rotation is 
		performed on subtree and then RR rotation is performed on full tree, by 
		full tree we mean the first node from the path of inserted node whose 
		balance factor is other than -1, 0, or 1.
