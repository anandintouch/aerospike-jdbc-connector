package com.aerospike.aql.grammar;

import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.UnwantedTokenException;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;

public class AQLTreeErrorNode extends AQLTree {
	public IntStream input;
	public Token start;
	public Token stop;
	public RecognitionException trappedException;

	public AQLTreeErrorNode(TokenStream input, Token start,
			Token stop, RecognitionException e) {
		if ( stop==null ||
				 (stop.getTokenIndex() < start.getTokenIndex() &&
				  stop.getType()!=Token.EOF) )
			{
				// sometimes resync does not consume a token (when LT(1) is
				// in follow set.  So, stop will be 1 to left to start. adjust.
				// Also handle case where start is the first token and no token
				// is consumed during recovery; LT(-1) will return null.
				stop = start;
			}
			this.input = input;
			this.start = start;
			this.stop = stop;
			this.trappedException = e;
	}
	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public int getType() {
		return Token.INVALID_TOKEN_TYPE;
	}

	@Override
	public String getText() {
		String badText;
		if ( start instanceof Token ) {
			int i = start.getTokenIndex();
			int j = stop.getTokenIndex();
			if ( stop.getType() == Token.EOF ) {
				j = ((TokenStream)input).size();
			}
			badText = ((TokenStream)input).toString(i, j);
		}
		else if ( start instanceof Tree ) {
			badText = ((TreeNodeStream)input).toString(start, stop);
		}
		else {
			// people should subclass if they alter the tree type so this
			// next one is for sure correct.
			badText = "<unknown>";
		}
		return badText;
	}

	@Override
	public String toString() {
		if ( trappedException instanceof MissingTokenException ) {
			return "<missing type: "+
				   ((MissingTokenException)trappedException).getMissingType()+
				   ">";
		}
		else if ( trappedException instanceof UnwantedTokenException ) {
			return "<extraneous: "+
				   ((UnwantedTokenException)trappedException).getUnexpectedToken()+
				   ", resync="+getText()+">";
		}
		else if ( trappedException instanceof MismatchedTokenException ) {
			return "<mismatched token: "+trappedException.token+", resync="+getText()+">";
		}
		else if ( trappedException instanceof NoViableAltException ) {
			return "<unexpected: "+trappedException.token+
				   ", resync="+getText()+">";
		}
		return "<error: "+getText()+">";
	}


}
