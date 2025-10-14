package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import nu.xom.Attribute;
import nu.xom.Element;

/* loaded from: classes8.dex */
public class XomWriter extends AbstractDocumentWriter {
    public XomWriter() {
        this(null);
    }

    public XomWriter(Element element) {
        this(element, new XmlFriendlyNameCoder());
    }

    public XomWriter(Element element, NameCoder nameCoder) {
        super(element, nameCoder);
    }

    public XomWriter(Element element, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(element, (NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentWriter
    public Object createNode(String str) {
        Element element = new Element(encodeNode(str));
        if (top() != null) {
            top().appendChild(element);
        }
        return element;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void addAttribute(String str, String str2) {
        top().addAttribute(new Attribute(encodeAttribute(str), str2));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void setValue(String str) {
        top().appendChild(str);
    }

    public final Element top() {
        return (Element) getCurrent();
    }
}
