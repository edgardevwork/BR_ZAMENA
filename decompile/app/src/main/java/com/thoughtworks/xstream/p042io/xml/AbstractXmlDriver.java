package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.AbstractDriver;
import com.thoughtworks.xstream.p042io.naming.NameCoder;

/* loaded from: classes8.dex */
public abstract class AbstractXmlDriver extends AbstractDriver {
    public AbstractXmlDriver() {
        this(new XmlFriendlyNameCoder());
    }

    public AbstractXmlDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    public AbstractXmlDriver(XmlFriendlyReplacer xmlFriendlyReplacer) {
        this((NameCoder) xmlFriendlyReplacer);
    }

    public XmlFriendlyReplacer xmlFriendlyReplacer() {
        NameCoder nameCoder = getNameCoder();
        if (nameCoder instanceof XmlFriendlyReplacer) {
            return (XmlFriendlyReplacer) nameCoder;
        }
        return null;
    }
}
