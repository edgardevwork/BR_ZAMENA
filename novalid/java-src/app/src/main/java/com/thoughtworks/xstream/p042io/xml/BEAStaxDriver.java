package com.thoughtworks.xstream.p042io.xml;

import com.bea.xml.stream.MXParserFactory;
import com.bea.xml.stream.XMLOutputFactoryBase;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;

/* loaded from: classes7.dex */
public class BEAStaxDriver extends StaxDriver {
    public BEAStaxDriver() {
    }

    public BEAStaxDriver(QNameMap qNameMap, XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(qNameMap, xmlFriendlyNameCoder);
    }

    public BEAStaxDriver(QNameMap qNameMap, NameCoder nameCoder) {
        super(qNameMap, nameCoder);
    }

    public BEAStaxDriver(QNameMap qNameMap) {
        super(qNameMap);
    }

    public BEAStaxDriver(XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(xmlFriendlyNameCoder);
    }

    public BEAStaxDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLInputFactory createInputFactory() {
        MXParserFactory mXParserFactory = new MXParserFactory();
        mXParserFactory.setProperty("javax.xml.stream.isSupportingExternalEntities", Boolean.FALSE);
        return mXParserFactory;
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLOutputFactory createOutputFactory() {
        return new XMLOutputFactoryBase();
    }
}
