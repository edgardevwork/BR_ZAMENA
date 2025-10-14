package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/* loaded from: classes8.dex */
public class StaxReader extends AbstractPullReader {

    /* renamed from: in */
    public final XMLStreamReader f5914in;
    public final QNameMap qnameMap;

    public StaxReader(QNameMap qNameMap, XMLStreamReader xMLStreamReader) {
        this(qNameMap, xMLStreamReader, new XmlFriendlyNameCoder());
    }

    public StaxReader(QNameMap qNameMap, XMLStreamReader xMLStreamReader, NameCoder nameCoder) {
        super(nameCoder);
        this.qnameMap = qNameMap;
        this.f5914in = xMLStreamReader;
        moveDown();
    }

    public StaxReader(QNameMap qNameMap, XMLStreamReader xMLStreamReader, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(qNameMap, xMLStreamReader, (NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractPullReader
    public int pullNextEvent() {
        try {
            int next = this.f5914in.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 4) {
                        return 3;
                    }
                    if (next == 5) {
                        return 4;
                    }
                    if (next != 7) {
                        if (next != 8) {
                            return next != 12 ? 0 : 3;
                        }
                    }
                }
                return 2;
            }
            return 1;
        } catch (XMLStreamException e) {
            throw new StreamException((Throwable) e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractPullReader
    public String pullElementName() {
        return this.qnameMap.getJavaClassName(this.f5914in.getName());
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractPullReader
    public String pullText() {
        return this.f5914in.getText();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(String str) {
        return this.f5914in.getAttributeValue((String) null, encodeAttribute(str));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(int i) {
        return this.f5914in.getAttributeValue(i);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public int getAttributeCount() {
        return this.f5914in.getAttributeCount();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttributeName(int i) {
        return decodeAttribute(this.f5914in.getAttributeLocalName(i));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader, com.thoughtworks.xstream.converters.ErrorReporter
    public void appendErrors(ErrorWriter errorWriter) {
        errorWriter.add("line number", String.valueOf(this.f5914in.getLocation().getLineNumber()));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void close() {
        try {
            this.f5914in.close();
        } catch (XMLStreamException e) {
            throw new StreamException((Throwable) e);
        }
    }
}
