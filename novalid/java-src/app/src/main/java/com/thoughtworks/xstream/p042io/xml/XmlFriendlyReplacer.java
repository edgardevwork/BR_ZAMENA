package com.thoughtworks.xstream.p042io.xml;

import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorBuilder;

/* loaded from: classes8.dex */
public class XmlFriendlyReplacer extends XmlFriendlyNameCoder {
    public XmlFriendlyReplacer() {
        this("_-", PomModuleDescriptorBuilder.EXTRA_INFO_DELIMITER);
    }

    public XmlFriendlyReplacer(String str, String str2) {
        super(str, str2);
    }

    public String escapeName(String str) {
        return super.encodeNode(str);
    }

    public String unescapeName(String str) {
        return super.decodeNode(str);
    }
}
