package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.io.IOException;
import java.io.Reader;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

/* loaded from: classes8.dex */
public class XppReader extends AbstractPullReader {
    public static /* synthetic */ Class class$org$xmlpull$v1$XmlPullParser;
    public final XmlPullParser parser;
    public final Reader reader;

    public XppReader(Reader reader, XmlPullParser xmlPullParser) {
        this(reader, xmlPullParser, new XmlFriendlyNameCoder());
    }

    public XppReader(Reader reader, XmlPullParser xmlPullParser, NameCoder nameCoder) {
        super(nameCoder);
        this.parser = xmlPullParser;
        this.reader = reader;
        try {
            xmlPullParser.setInput(reader);
            moveDown();
        } catch (XmlPullParserException e) {
            throw new StreamException(e);
        }
    }

    public XppReader(Reader reader) {
        this(reader, new XmlFriendlyReplacer());
    }

    public XppReader(Reader reader, XmlFriendlyReplacer xmlFriendlyReplacer) throws Throwable {
        super(xmlFriendlyReplacer);
        try {
            XmlPullParser xmlPullParserCreateParser = createParser();
            this.parser = xmlPullParserCreateParser;
            this.reader = reader;
            xmlPullParserCreateParser.setInput(reader);
            moveDown();
        } catch (XmlPullParserException e) {
            throw new StreamException(e);
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public XmlPullParser createParser() throws Throwable {
        try {
            Class clsClass$ = class$org$xmlpull$v1$XmlPullParser;
            if (clsClass$ == null) {
                clsClass$ = class$("org.xmlpull.v1.XmlPullParser");
                class$org$xmlpull$v1$XmlPullParser = clsClass$;
            }
            return (XmlPullParser) Class.forName("org.xmlpull.mxp1.MXParser", true, clsClass$.getClassLoader()).newInstance();
        } catch (ClassNotFoundException e) {
            e = e;
            throw new StreamException("Cannot create Xpp3 parser instance.", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new StreamException("Cannot create Xpp3 parser instance.", e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new StreamException("Cannot create Xpp3 parser instance.", e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractPullReader
    public int pullNextEvent() {
        try {
            int next = this.parser.next();
            if (next != 0) {
                if (next != 1) {
                    if (next != 2) {
                        if (next != 3) {
                            if (next != 4) {
                                return next != 9 ? 0 : 4;
                            }
                            return 3;
                        }
                    }
                }
                return 2;
            }
            return 1;
        } catch (IOException e) {
            throw new StreamException(e);
        } catch (XmlPullParserException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractPullReader
    public String pullElementName() {
        return this.parser.getName();
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractPullReader
    public String pullText() {
        return this.parser.getText();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(String str) {
        return this.parser.getAttributeValue(null, encodeAttribute(str));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(int i) {
        return this.parser.getAttributeValue(i);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public int getAttributeCount() {
        return this.parser.getAttributeCount();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttributeName(int i) {
        return decodeAttribute(this.parser.getAttributeName(i));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader, com.thoughtworks.xstream.converters.ErrorReporter
    public void appendErrors(ErrorWriter errorWriter) {
        errorWriter.add("line number", String.valueOf(this.parser.getLineNumber()));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void close() throws IOException {
        try {
            this.reader.close();
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }
}
