package com.pragya;

import com.sun.source.tree.Tree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode drink = new TreeNode("Drink");
        TreeNode hot = new TreeNode("Hotdrink");
        TreeNode cold = new TreeNode("Colddrink");
        drink.addChildren(hot);
        drink.addChildren(cold);
        TreeNode tea= new TreeNode("Tea");
        TreeNode beer = new TreeNode("beer");
        hot.addChildren(tea);
        cold.addChildren(beer);
        System.out.println(drink.print(0));

    }
}
