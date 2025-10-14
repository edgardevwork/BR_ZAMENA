package org.apache.ivy.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.ivy.util.url.URLHandlerRegistry;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes8.dex */
public abstract class XMLHelper {
    public static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    public static final String JAXP_SCHEMA_SOURCE = "http://java.sun.com/xml/jaxp/properties/schemaSource";
    public static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
    public static final String XERCES_LOAD_EXTERNAL_DTD = "http://apache.org/xml/features/nonvalidating/load-external-dtd";
    public static final String XML_NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    public static Boolean canDisableExternalDtds = null;
    public static boolean canUseSchemaValidation = true;

    public static SAXParser newSAXParser(URL url, InputStream inputStream, boolean z) throws ParserConfigurationException, SAXException {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        sAXParserFactoryNewInstance.setValidating(canUseSchemaValidation && url != null);
        if (!z && canDisableExternalDtds(sAXParserFactoryNewInstance)) {
            sAXParserFactoryNewInstance.setFeature(XERCES_LOAD_EXTERNAL_DTD, false);
        }
        SAXParser sAXParserNewSAXParser = sAXParserFactoryNewInstance.newSAXParser();
        if (canUseSchemaValidation && url != null) {
            try {
                sAXParserNewSAXParser.setProperty(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
                sAXParserNewSAXParser.setProperty(JAXP_SCHEMA_SOURCE, inputStream);
            } catch (SAXNotRecognizedException e) {
                Message.warn("problem while setting JAXP validating property on SAXParser... XML validation will not be done", e);
                canUseSchemaValidation = false;
                sAXParserFactoryNewInstance.setValidating(false);
                sAXParserNewSAXParser = sAXParserFactoryNewInstance.newSAXParser();
            }
        }
        sAXParserNewSAXParser.getXMLReader().setFeature(XML_NAMESPACE_PREFIXES, true);
        return sAXParserNewSAXParser;
    }

    public static boolean canDisableExternalDtds(SAXParserFactory sAXParserFactory) throws SAXNotRecognizedException, SAXNotSupportedException, ParserConfigurationException {
        if (canDisableExternalDtds == null) {
            try {
                sAXParserFactory.getFeature(XERCES_LOAD_EXTERNAL_DTD);
                canDisableExternalDtds = Boolean.TRUE;
            } catch (Exception unused) {
                canDisableExternalDtds = Boolean.FALSE;
            }
        }
        return canDisableExternalDtds.booleanValue();
    }

    public static String toSystemId(URL url) {
        try {
            return new URI(url.toExternalForm()).toASCIIString();
        } catch (URISyntaxException unused) {
            return url.toExternalForm();
        }
    }

    public static void parse(URL url, URL url2, DefaultHandler defaultHandler) throws ParserConfigurationException, SAXException, IOException {
        parse(url, url2, defaultHandler, (LexicalHandler) null);
    }

    public static void parse(URL url, URL url2, DefaultHandler defaultHandler, LexicalHandler lexicalHandler) throws ParserConfigurationException, SAXException, IOException {
        InputStream inputStreamOpenStream = URLHandlerRegistry.getDefault().openStream(url);
        try {
            InputSource inputSource = new InputSource(inputStreamOpenStream);
            inputSource.setSystemId(toSystemId(url));
            parse(inputSource, url2, defaultHandler, lexicalHandler);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
        } catch (Throwable th) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void parse(InputStream inputStream, URL url, DefaultHandler defaultHandler, LexicalHandler lexicalHandler) throws ParserConfigurationException, SAXException, IOException {
        parse(new InputSource(inputStream), url, defaultHandler, lexicalHandler);
    }

    public static void parse(InputSource inputSource, URL url, DefaultHandler defaultHandler, LexicalHandler lexicalHandler) throws ParserConfigurationException, SAXException, IOException {
        parse(inputSource, url, defaultHandler, lexicalHandler, true);
    }

    public static void parse(InputSource inputSource, URL url, DefaultHandler defaultHandler, LexicalHandler lexicalHandler, boolean z) throws ParserConfigurationException, SAXException, IOException {
        InputStream inputStreamOpenStream = null;
        if (url != null) {
            try {
                inputStreamOpenStream = URLHandlerRegistry.getDefault().openStream(url);
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        SAXParser sAXParserNewSAXParser = newSAXParser(url, inputStreamOpenStream, z);
        if (lexicalHandler != null) {
            try {
                sAXParserNewSAXParser.setProperty("http://xml.org/sax/properties/lexical-handler", lexicalHandler);
            } catch (SAXException e) {
                Message.warn("problem while setting the lexical handler property on SAXParser", e);
            }
        }
        sAXParserNewSAXParser.parse(inputSource, defaultHandler);
        if (inputStreamOpenStream != null) {
            try {
                inputStreamOpenStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    public static boolean canUseSchemaValidation() {
        return canUseSchemaValidation;
    }

    public static String escape(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if (c == '\"') {
                sb.append("&quot;");
            } else if (c == '<') {
                sb.append("&lt;");
            } else if (c == '&') {
                sb.append("&amp;");
            } else if (c == '\'') {
                sb.append("&apos;");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static Document parseToDom(InputSource inputSource, EntityResolver entityResolver) throws SAXException, IOException {
        return getDocBuilder(entityResolver).parse(inputSource);
    }

    public static DocumentBuilder getDocBuilder(EntityResolver entityResolver) throws ParserConfigurationException {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setValidating(false);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            if (entityResolver != null) {
                documentBuilderNewDocumentBuilder.setEntityResolver(entityResolver);
            }
            return documentBuilderNewDocumentBuilder;
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
