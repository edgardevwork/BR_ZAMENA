package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.StreamException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;

/* loaded from: classes7.dex */
public class SjsxpDriver extends StaxDriver {
    public SjsxpDriver() {
    }

    public SjsxpDriver(QNameMap qNameMap, XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(qNameMap, xmlFriendlyNameCoder);
    }

    public SjsxpDriver(QNameMap qNameMap) {
        super(qNameMap);
    }

    public SjsxpDriver(XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(xmlFriendlyNameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLInputFactory createInputFactory() {
        try {
            XMLInputFactory xMLInputFactory = (XMLInputFactory) Class.forName("com.sun.xml.internal.stream.XMLInputFactoryImpl").newInstance();
            xMLInputFactory.setProperty("javax.xml.stream.isSupportingExternalEntities", Boolean.FALSE);
            return xMLInputFactory;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new StreamException("Cannot create SJSXP (Sun JDK 6 StAX) XMLInputFactory instance.", e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLOutputFactory createOutputFactory() {
        try {
            return (XMLOutputFactory) Class.forName("com.sun.xml.internal.stream.XMLOutputFactoryImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new StreamException("Cannot create SJSXP (Sun JDK 6 StAX) XMLOutputFactory instance.", e);
        }
    }
}
