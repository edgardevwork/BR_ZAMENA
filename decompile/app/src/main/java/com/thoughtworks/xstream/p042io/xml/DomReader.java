package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/* loaded from: classes8.dex */
public class DomReader extends AbstractDocumentReader {
    public List childElements;
    public Element currentElement;
    public StringBuffer textBuffer;

    public DomReader(Element element) {
        this(element, new XmlFriendlyNameCoder());
    }

    public DomReader(Document document) {
        this(document.getDocumentElement());
    }

    public DomReader(Element element, NameCoder nameCoder) {
        super(element, nameCoder);
        this.textBuffer = new StringBuffer();
    }

    public DomReader(Document document, NameCoder nameCoder) {
        this(document.getDocumentElement(), nameCoder);
    }

    public DomReader(Element element, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(element, (NameCoder) xmlFriendlyReplacer);
    }

    public DomReader(Document document, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(document.getDocumentElement(), (NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getNodeName() {
        return decodeNode(this.currentElement.getTagName());
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getValue() {
        NodeList childNodes = this.currentElement.getChildNodes();
        this.textBuffer.setLength(0);
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem instanceof Text) {
                this.textBuffer.append(((Text) nodeItem).getData());
            }
        }
        return this.textBuffer.toString();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(String str) {
        Attr attributeNode = this.currentElement.getAttributeNode(encodeAttribute(str));
        if (attributeNode == null) {
            return null;
        }
        return attributeNode.getValue();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(int i) {
        return ((Attr) this.currentElement.getAttributes().item(i)).getValue();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public int getAttributeCount() {
        return this.currentElement.getAttributes().getLength();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttributeName(int i) {
        return decodeAttribute(((Attr) this.currentElement.getAttributes().item(i)).getName());
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public Object getParent() {
        return this.currentElement.getParentNode();
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public Object getChild(int i) {
        return this.childElements.get(i);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public int getChildCount() {
        return this.childElements.size();
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentReader
    public void reassignCurrentElement(Object obj) {
        Element element = (Element) obj;
        this.currentElement = element;
        NodeList childNodes = element.getChildNodes();
        this.childElements = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem instanceof Element) {
                this.childElements.add(nodeItem);
            }
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractReader, com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamReader
    public String peekNextChild() {
        NodeList childNodes = this.currentElement.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem instanceof Element) {
                return decodeNode(((Element) nodeItem).getTagName());
            }
        }
        return null;
    }
}
