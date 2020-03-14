package com.wangyuqi;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            TreeLinkNode root = new TreeLinkNode(4);
            TreeLinkNode node2 = new TreeLinkNode(6);
            TreeLinkNode node3 = new TreeLinkNode(2);
            TreeLinkNode node4 = new TreeLinkNode(7);
            TreeLinkNode node5 = new TreeLinkNode(5);
            TreeLinkNode node6 = new TreeLinkNode(1);
            TreeLinkNode node7 = new TreeLinkNode(3);
            root.left = node2;
            root.right = node3;
            node2.left = node4;
            node2.right = node5;
            node3.left = node7;
            node3.right = node6;

            Scanner scanner = new Scanner(System.in);

            int i = scanner.nextInt();


            TreeLinkNode kMax = findKMax(root, i);
            System.out.println(kMax.val);
        }

        static TreeLinkNode findKMax(TreeLinkNode pRoot, int k) {
            //中序遍历的第k-1个节点就是第k大的节点
            if (pRoot == null || k <= 0)
                return null;
            ArrayList<TreeLinkNode> aList = new ArrayList();
            inOrderRecursive(pRoot, aList);
            int len = aList.size();
            if (len < k)
                return null;
            else
                return aList.get(k - 1);
        }

        static void inOrderRecursive(TreeLinkNode root, ArrayList<TreeLinkNode> al) {
            if (root == null) {
                return;
            }
            inOrderRecursive(root.left, al);
            al.add(root);
            //System.out.println(root.val);
            inOrderRecursive(root.right, al);
        }


        static class TreeLinkNode{

            private TreeLinkNode left;
            private TreeLinkNode right;

            private  int val;

            public TreeLinkNode(int val) {
                this.val = val;
            }
        }
    }


