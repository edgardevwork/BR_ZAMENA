package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;

/* loaded from: classes7.dex */
public class StandardStaxDriver extends StaxDriver {
    public StandardStaxDriver() {
    }

    public StandardStaxDriver(QNameMap qNameMap, XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(qNameMap, xmlFriendlyNameCoder);
    }

    public StandardStaxDriver(QNameMap qNameMap, NameCoder nameCoder) {
        super(qNameMap, nameCoder);
    }

    public StandardStaxDriver(QNameMap qNameMap) {
        super(qNameMap);
    }

    public StandardStaxDriver(XmlFriendlyNameCoder xmlFriendlyNameCoder) {
        super(xmlFriendlyNameCoder);
    }

    public StandardStaxDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLInputFactory createInputFactory() {
        try {
            Class staxInputFactory = JVM.getStaxInputFactory();
            if (staxInputFactory != null) {
                XMLInputFactory xMLInputFactory = (XMLInputFactory) staxInputFactory.newInstance();
                xMLInputFactory.setProperty("javax.xml.stream.isSupportingExternalEntities", Boolean.FALSE);
                return xMLInputFactory;
            }
            throw new StreamException("Java runtime has no standard XMLInputFactory implementation.", null);
        } catch (ClassNotFoundException e) {
            e = e;
            throw new StreamException("Cannot create standard XMLInputFactory instance of Java runtime.", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new StreamException("Cannot create standard XMLInputFactory instance of Java runtime.", e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new StreamException("Cannot create standard XMLInputFactory instance of Java runtime.", e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxDriver
    public XMLOutputFactory createOutputFactory() {
        try {
            Class staxOutputFactory = JVM.getStaxOutputFactory();
            if (staxOutputFactory != null) {
                return (XMLOutputFactory) staxOutputFactory.newInstance();
            }
            throw new StreamException("Java runtime has no standard XMLOutputFactory implementation.", null);
        } catch (ClassNotFoundException e) {
            e = e;
            throw new StreamException("Cannot create standard XMLOutputFactory instance of Java runtime.", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new StreamException("Cannot create standard XMLOutputFactory instance of Java runtime.", e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new StreamException("Cannot create standard XMLOutputFactory instance of Java runtime.", e);
        }
    }
}
