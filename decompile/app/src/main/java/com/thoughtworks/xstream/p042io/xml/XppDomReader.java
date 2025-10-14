package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import com.thoughtworks.xstream.p042io.xml.xppdom.XppDom;

/* loaded from: classes8.dex */
public class XppDomReader extends AbstractDocumentReader {
    public XppDom currentElement;

    public XppDomReader(XppDom xppDom) {
        super(xppDom);
    }

    public XppDomReader(XppDom xppDom, NameCoder nameCoder) {
        super(xppDom, nameCoder);
    }

    public XppDomReader(XppDom xppDom, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(xppDom, (NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getNodeName() {
        return decodeNode(this.currentElement.getName());
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getValue() {
        String value;
        try {
            value = this.currentElement.getValue();
        } catch (Exception unused) {
            value = null;
        }
        return value == null ? "" : value;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(String str) {
        return this.currentElement.getAttribute(encodeAttribute(str));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(int i) {
        XppDom xppDom = this.currentElement;
        return xppDom.getAttribute(xppDom.getAttributeNames()[i]);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public int getAttributeCount() {
        return this.currentElement.getAttributeNames().length;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttributeName(int i) {
        return decodeAttribute(this.currentElement.getAttributeNames()[i]);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public Object getParent() {
        return this.currentElement.getParent();
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public Object getChild(int i) {
        return this.currentElement.getChild(i);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public int getChildCount() {
        return this.currentElement.getChildCount();
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public void reassignCurrentElement(Object obj) {
        this.currentElement = (XppDom) obj;
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractReader, com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamReader
    public String peekNextChild() {
        if (this.currentElement.getChildCount() == 0) {
            return null;
        }
        return decodeNode(this.currentElement.getChild(0).getName());
    }
}
