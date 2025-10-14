package com.thoughtworks.xstream.p042io.xml.xppdom;

import java.io.Reader;
import org.xmlpull.mxp1.MXParser;

/* loaded from: classes5.dex */
public class Xpp3DomBuilder {
    public static Xpp3Dom build(Reader reader) throws Exception {
        MXParser mXParser = new MXParser();
        mXParser.setInput(reader);
        try {
            return (Xpp3Dom) XppDom.build(mXParser);
        } finally {
            reader.close();
        }
    }
}
