package com.hewei.dp;

import javax.lang.model.element.Element;

public interface Visitor {
 
	abstract public void Visit(Element element);
}