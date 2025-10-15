package org.apache.ivy.util;

import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes8.dex */
public class ContextualSAXHandler extends DefaultHandler {
    public Stack<String> contextStack = new Stack<>();
    public StringBuilder buffer = new StringBuilder();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        this.buffer.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        this.contextStack.push(str3);
        this.buffer.setLength(0);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        this.contextStack.pop();
        this.buffer.setLength(0);
    }

    public String getContext() {
        Stack<String> stack = this.contextStack;
        return StringUtils.joinArray((String[]) stack.toArray(new String[stack.size()]), "/");
    }

    public String getText() {
        return this.buffer.toString();
    }
}
