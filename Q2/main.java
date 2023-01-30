package com.greatlearning.Q2;

	import com.greatlearning.Q2.FindSumPair;
	import com.greatlearning.Q2.Node;

	public class main {

		public static void main(String[] args) {
			Node root=null;
			
			FindSumPair pair=new FindSumPair();
			root=pair.insert(root,40);
			root=pair.insert(root,20);
			root=pair.insert(root,60);
			root=pair.insert(root,10);
			root=pair.insert(root,30);
			root=pair.insert(root,80);
			root=pair.insert(root,70);
			
			int sum=150;
			pair.findPairWithGivenSum(root,sum);

		}
}
