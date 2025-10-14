package com.thoughtworks.xstream.p042io.xml;

import com.ctc.wstx.stax.WstxInputFactory;
import com.ctc.wstx.stax.WstxOutputFactory;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;

/* loaded from: classes7.dex */
public class WstxDriver extends StaxDriver {
    public WstxDriver() {
    }

    public WstxDriver(QNameMap qNameMap, XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(qNameMap, xmlFriendlyNameCoder);
    }

    public WstxDriver(QNameMap qNameMap, NameCoder nameCoder) {
        super(qNameMap, nameCoder);
    }

    public WstxDriver(QNameMap qNameMap) {
        super(qNameMap);
    }

    public WstxDriver(XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(xmlFriendlyNameCoder);
    }

    public WstxDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLInputFactory createInputFactory() {
        WstxInputFactory wstxInputFactory = new WstxInputFactory();
        wstxInputFactory.setProperty("javax.xml.stream.isSupportingExternalEntities", Boolean.FALSE);
        return wstxInputFactory;
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLOutputFactory createOutputFactory() {
        return new WstxOutputFactory();
    }
}
