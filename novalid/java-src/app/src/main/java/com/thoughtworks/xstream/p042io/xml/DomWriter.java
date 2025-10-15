package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes8.dex */
public class DomWriter extends AbstractDocumentWriter {
    public final Document document;
    public boolean hasRootElement;

    public DomWriter(Document document) {
        this(document, new XmlFriendlyNameCoder());
    }

    public DomWriter(Element element) {
        this(element, new XmlFriendlyNameCoder());
    }

    public DomWriter(Document document, NameCoder nameCoder) {
        this(document.getDocumentElement(), document, nameCoder);
    }

    public DomWriter(Element element, Document document, NameCoder nameCoder) {
        super(element, nameCoder);
        this.document = document;
        this.hasRootElement = document.getDocumentElement() != null;
    }

    public DomWriter(Element element, NameCoder nameCoder) {
        this(element, element.getOwnerDocument(), nameCoder);
    }

    public DomWriter(Document document, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(document.getDocumentElement(), document, (NameCoder) xmlFriendlyReplacer);
    }

    public DomWriter(Element element, Document document, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(element, document, (NameCoder) xmlFriendlyReplacer);
    }

    public DomWriter(Element element, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(element, element.getOwnerDocument(), (NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractDocumentWriter
    public Object createNode(String str) throws DOMException {
        Element elementCreateElement = this.document.createElement(encodeNode(str));
        if (top() != null) {
            top().appendChild(elementCreateElement);
        } else if (!this.hasRootElement) {
            this.document.appendChild(elementCreateElement);
            this.hasRootElement = true;
        }
        return elementCreateElement;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void addAttribute(String str, String str2) throws DOMException {
        top().setAttribute(encodeAttribute(str), str2);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void setValue(String str) throws DOMException {
        top().appendChild(this.document.createTextNode(str));
    }

    public final Element top() {
        return (Element) getCurrent();
    }
}
