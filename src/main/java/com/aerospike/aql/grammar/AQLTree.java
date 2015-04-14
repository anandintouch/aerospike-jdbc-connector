package com.aerospike.aql.grammar;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
/**
 * This class extends CommonTree include the original source 
 * @author peter
 *
 */
public class AQLTree extends CommonTree {

	protected String source;

	public AQLTree() {
		super();
	}

	public AQLTree(CommonTree node) {
		super(node);
	}

	public AQLTree(Token t) {
		super(t);
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public static Token findTokenByOffset(AQLTree tree, int lineInFile, int positionOffset){
		if (tree == null)
			return null;
		
		Token token = tree.getToken();

		if (token != null){
			int line = token.getLine();
			String text = token.getText();
			int length = text.length();
			int pos = token.getCharPositionInLine();
			if (lineInFile == line && 
					(positionOffset >= pos && positionOffset <= (pos + length))){
				return token;
			}
		}
		if (tree.getChildCount() > 0){
			for (Object kid : tree.children){
				Token kidToken = findTokenByOffset((AQLTree)kid, lineInFile, positionOffset);
				if (kidToken != null){
					return kidToken;
				}
			}
		} 
		return null;
	}
}
