/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.interpreter.ken;

import java.util.LinkedList;
import java.util.List;

public class Expression {
	private String word;
	private List<Expression> splitedWords = new LinkedList<Expression>();

	private Expression current;
	private Expression next;

	public Expression(String message) {
		this.word = message;

		if ((message != null) && message.contains(" ")) {
			String[] words = message.split(" ");
			Expression lastWord = null;
			for (String w : words) {
				Expression currentWord = new Expression(w);
				if (lastWord == null) {
					lastWord = currentWord;
					splitedWords.add(currentWord);
				} else {
					lastWord.setNext(currentWord);
					splitedWords.add(currentWord);
					lastWord = currentWord;
				}
			}
		} else {
			current = new Expression(message, false);
		}
	}

	private Expression(String message, boolean needSplit) {
		if (!needSplit) {
			word = message;
			current = this;
		}
	}

	public Expression getCurrent() {
		return current;
	}

	public void setCurrent(Expression current) {
		this.current = current;
	}

	public Expression getNext() {
		return next;
	}

	public void setNext(Expression next) {
		this.next = next;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public List<Expression> getSplitedWords() {
		return splitedWords;
	}

	public void setSplitedWords(List<Expression> splitedWords) {
		this.splitedWords = splitedWords;
	}

}
