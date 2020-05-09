package com.dsprep;

public class BinaryTree {

	Node root;

	public BinaryTree(int data) {
		root = new Node(data);
	}

	public BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {

		int arr[] = {1,2,3,-2,5};

		// int arr[] = {1,8,6,2,5,4,8,3,7};

		int arra[] = { 1, 2, 2, 3, 5, 6, 6, 17 };

		String str = "aaaabbeddccccc";

		BinaryTree bTree = new BinaryTree();

		bTree.root = new Node(1);
		bTree.root.left = new Node(2);
		bTree.root.right = new Node(3);
		bTree.root.left.left = new Node(4);
		bTree.root.left.right = new Node(5);
		bTree.root.right.left = new Node(6);
		bTree.root.right.right = new Node(7);

		/*
		 * System.out.println("-------DFS-----");
		 * System.out.println("<-------Pre Order-------->");
		 * PreOrder.preOrder(bTree.root);
		 * System.out.println("\n"+"<-------Post Order----->");
		 * PostOrder.postOrder(bTree.root);
		 * System.out.println("\n"+"<-------In Order----->");
		 * InOrder.inOrder(bTree.root);
		 * 
		 * System.out.println("\nBFS");
		 * 
		 * BFSearch.bfSearch(bTree.root);
		 * 
		 * //heap implementation HeapOp.heapify(arr, arr.length, 0);
		 * HeapOp.printArr(arr);
		 */

		/*
		 * MirrorTree mTree = new MirrorTree(); BFSearch.bfSearch(bTree.root);
		 * //PrintSpiralTree.spiralTree(bTree.root); System.out.println("\n");
		 * 
		 * Node node = mTree.mirrorTree(bTree.root);
		 * 
		 * BFSearch.bfSearch(node);
		 */

		/*
		 * ElementInInfiniteArray eAr = new ElementInInfiniteArray();
		 * System.out.println("index is :"+ eAr.findElem(arra, 20));
		 */

		/*
		 * MatchParenthesis mp = new MatchParenthesis();
		 * System.out.println(mp.matchParenthesis(str));
		 */

		/*
		 * PreviousGreaterElement prvElm = new PreviousGreaterElement();
		 * prvElm.prevGtElem(arra);
		 * 
		 * System.out.println("\nNext greater element");
		 * 
		 * 
		 * 
		 * NextGrtElement nxElm = new NextGrtElement(); nxElm.nxtGtElem(arra);
		 */

		/*
		 * KstackInArray karr = new KstackInArray(3, 3);
		 * 
		 * 
		 * for(int i = 0; i < 3; i++) {
		 * 
		 * for(int j = 0; j < 3; j++) { karr.push(j+i, i); }
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * while(!karr.isEmpty(i)) {
		 * 
		 * System.out.print(karr.pop(i));
		 * 
		 * } System.out.println("\n********");
		 * 
		 * }
		 */

		/*
		 * SquareRoot sRoot = new SquareRoot(); System.out.println(sRoot.sqRoot(543));
		 */
		/*
		 * KlargestElem kel = new KlargestElem(); kel.kLargestElem(arr, 2);
		 */

		/*
		 * TwoSum toSum = new TwoSum(); int[] aa = toSum.twoSum(arr, -8); for(int i =0;
		 * i<2;i++) { System.out.println(aa[i]);
		 * 
		 * }
		 */

		/*
		 * Median med = new Median(); System.out.println(med.median(arr));
		 * 
		 * System.out.println(med.median(arra));
		 */

		/*
		 * MedianOfTwoSortedArray medArr = new MedianOfTwoSortedArray();
		 * 
		 * System.out.println(medArr.medianOfTwoArray(arr, arra));
		 */

		/*
		 * SetiFy set = new SetiFy(); set.makeSet(100, "3", "4");
		 */

		/*
		 * TripletUnsortedArray trp = new TripletUnsortedArray();
		 * trp.findTriplet(arr,0);
		 */

		/*
		 * LMIndex lmi = new LMIndex(); System.out.println(lmi.lmIndex(arra, 4, 0, 10));
		 */

		/*
		 * PowerOfTen pot = new PowerOfTen();
		 * 
		 * for (int i = 10; i <= 20; i++) {
		 * 
		 * pot.isPowerof((i - 2*i));
		 * 
		 * }
		 */

		/*
		 * pot.isPowerof(-1); pot.isPowerof(0); pot.isPowerof(500);
		 * pot.isPowerof(-1000);
		 */
		/*
		 * pot.isPowerof(2800); pot.isPowerof(0);
		 */
		/*
		 * LargestRectangle lrg = new LargestRectangle(); lrg.findLargestRect(arr, 1);
		 */

		
		/*
		 * QuickSort qsrt = new QuickSort();
		 * 
		 * qsrt.quickSort(arr, 0, arr.length);
		 * 
		 * for (int i : arr) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 * 
		 * System.out.println("***********");
		 * 
		 * MergeSort mer = new MergeSort(); int[] n2arra = mer.mergeSort(arr, 0,
		 * arr.length - 1);
		 * 
		 * for (int i : n2arra) { System.out.println(i); }
		 */
		
		
		/*
		 * GGame game = new GGame(); game.play(arr);
		 * 
		 * 
		 * 
		 * LongestSubstring lst = new LongestSubstring(); lst.findLongestSubString(str);
		 */
		
		/*
		 * ReverseString rst = new ReverseString(); String strk = null;
		 * rst.reverseString(strk );
		 */
		
		
		
		// NOT IMPLEMENTED
		
		/*
		 * LinkedList llist = new LinkedList(); for(int i = 0 ; i < 10; i++) {
		 * 
		 * llist.insert(i+10);
		 * 
		 * }
		 * 
		 * 
		 * llist.printList();
		 */
		
		/*
		 * ContiguousSubArray carr = new ContiguousSubArray(); carr.findSubArray(arr);
		 */
		
		FirstNonRepeatble fis = new FirstNonRepeatble();
		fis.findFirstNonRepeat(str);

	}

}
