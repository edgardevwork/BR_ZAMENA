package org.apache.ivy.osgi.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.ivy.util.Message;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes5.dex */
public class DelegatingHandler extends DefaultHandler implements DTDHandler, ContentHandler, ErrorHandler {
    public static final String FALSE;
    public static final String TRUE;
    public boolean bufferingChar;
    public StringBuilder charBuffer;
    public Locator locator;
    public DelegatingHandler parent;
    public final String tagName;
    public DelegatingHandler delegate = null;
    public final Map<String, DelegatingHandler> saxHandlerMapping = new HashMap();
    public final Map<String, ChildElementHandler<?>> childHandlerMapping = new HashMap();
    public boolean started = false;
    public boolean skip = false;
    public boolean skipOnError = false;

    public interface SkipOnErrorCallback {
        void call() throws SAXException;
    }

    public void doEndDocument() throws SAXException {
    }

    public void doEndElement(String str, String str2, String str3) throws SAXException {
    }

    public void doEndPrefixMapping(String str) throws SAXException {
    }

    public void doError(SAXParseException sAXParseException) throws SAXException {
    }

    public void doFatalError(SAXParseException sAXParseException) throws SAXException {
    }

    public void doIgnorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    public void doNotationDecl(String str, String str2, String str3) throws SAXException {
    }

    public void doProcessingInstruction(String str, String str2) throws SAXException {
    }

    public void doSkippedEntity(String str) throws SAXException {
    }

    public void doStartDocument() throws SAXException {
    }

    public void doStartElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    public void doStartPrefixMapping(String str, String str2) throws SAXException {
    }

    public void doUnparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
    }

    public void doWarning(SAXParseException sAXParseException) throws SAXException {
    }

    public void handleAttributes(Attributes attributes) throws SAXException {
    }

    public DelegatingHandler(String str) {
        StringBuilder sb = new StringBuilder();
        this.charBuffer = sb;
        this.bufferingChar = false;
        this.tagName = str;
        sb.setLength(0);
    }

    public <DH extends DelegatingHandler> void addChild(DH dh, ChildElementHandler<DH> childElementHandler) {
        this.saxHandlerMapping.put(dh.getName(), dh);
        this.childHandlerMapping.put(dh.getName(), childElementHandler);
        dh.parent = this;
    }

    public String getName() {
        return this.tagName;
    }

    public DelegatingHandler getParent() {
        return this.parent;
    }

    public void setBufferingChar(boolean z) {
        this.bufferingChar = z;
    }

    public void setSkipOnError(boolean z) {
        this.skipOnError = z;
    }

    public boolean isBufferingChar() {
        return this.bufferingChar;
    }

    public String getBufferedChars() {
        return this.charBuffer.toString();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
        Iterator<DelegatingHandler> it = this.saxHandlerMapping.values().iterator();
        while (it.hasNext()) {
            it.next().setDocumentLocator(locator);
        }
    }

    public Locator getLocator() {
        return this.locator;
    }

    public String getCurrentElementIdentifier() {
        return "";
    }

    public void skip() {
        this.skip = true;
        Iterator<DelegatingHandler> it = this.saxHandlerMapping.values().iterator();
        while (it.hasNext()) {
            it.next().stopDelegating();
        }
    }

    public void stopDelegating() {
        this.parent.delegate = null;
        this.skip = false;
        this.started = false;
        Iterator<DelegatingHandler> it = this.saxHandlerMapping.values().iterator();
        while (it.hasNext()) {
            it.next().stopDelegating();
        }
    }

    public final void skipOnError(SkipOnErrorCallback skipOnErrorCallback) throws SAXException {
        try {
            skipOnErrorCallback.call();
        } catch (SAXException e) {
            if (this.skipOnError) {
                skip();
                log(0, e.getMessage(), e);
                return;
            }
            throw e;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.startDocument();
        } else {
            doStartDocument();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.endDocument();
        } else {
            doEndDocument();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(final String str, final String str2, final String str3, final Attributes attributes) throws SAXException {
        this.charBuffer.setLength(0);
        if (this.delegate != null) {
            skipOnError(new SkipOnErrorCallback() { // from class: org.apache.ivy.osgi.util.DelegatingHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.SkipOnErrorCallback
                public void call() throws SAXException {
                    DelegatingHandler.this.delegate.startElement(str, str2, str3, attributes);
                }
            });
            return;
        }
        if (!this.started) {
            if (this.parent == null && !str2.equals(this.tagName)) {
                throw new SAXException("The root element of the parsed document '" + str2 + "' didn't matched the expected one: '" + this.tagName + "'");
            }
            skipOnError(new SkipOnErrorCallback() { // from class: org.apache.ivy.osgi.util.DelegatingHandler.2
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.SkipOnErrorCallback
                public void call() throws SAXException {
                    DelegatingHandler.this.handleAttributes(attributes);
                }
            });
            this.started = true;
            return;
        }
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.saxHandlerMapping.get(str2);
        this.delegate = delegatingHandler;
        if (delegatingHandler != null) {
            skipOnError(new SkipOnErrorCallback() { // from class: org.apache.ivy.osgi.util.DelegatingHandler.3
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.SkipOnErrorCallback
                public void call() throws SAXException {
                    DelegatingHandler.this.delegate.startElement(str, str2, str3, attributes);
                }
            });
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(final String str, final String str2, final String str3) throws SAXException {
        final ChildElementHandler<?> childElementHandler;
        final DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            skipOnError(new SkipOnErrorCallback() { // from class: org.apache.ivy.osgi.util.DelegatingHandler.4
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.SkipOnErrorCallback
                public void call() throws SAXException {
                    DelegatingHandler.this.delegate.endElement(str, str2, str3);
                }
            });
            if (this.delegate != null || (childElementHandler = this.childHandlerMapping.get(str2)) == null) {
                return;
            }
            skipOnError(new SkipOnErrorCallback() { // from class: org.apache.ivy.osgi.util.DelegatingHandler.5
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.SkipOnErrorCallback
                public void call() throws SAXException {
                    childElementHandler._childHandled(delegatingHandler);
                }
            });
            return;
        }
        if (!this.skip) {
            doEndElement(str, str2, str3);
        }
        if (this.parent == null || !this.tagName.equals(str2)) {
            return;
        }
        stopDelegating();
    }

    public static abstract class ChildElementHandler<DH extends DelegatingHandler> {
        public abstract void childHandled(DH dh) throws SAXParseException;

        @Deprecated
        public void childHanlded(DH dh) throws SAXParseException {
            childHandled(dh);
        }

        public final void _childHandled(DelegatingHandler delegatingHandler) throws SAXParseException {
            childHandled(delegatingHandler);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.characters(cArr, i, i2);
        } else {
            doCharacters(cArr, i, i2);
        }
    }

    public void doCharacters(char[] cArr, int i, int i2) throws SAXException {
        if (this.bufferingChar) {
            this.charBuffer.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.startPrefixMapping(str, str2);
        } else {
            doStartPrefixMapping(str, str2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.endPrefixMapping(str);
        } else {
            doEndPrefixMapping(str);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.ignorableWhitespace(cArr, i, i2);
        } else {
            doIgnorableWhitespace(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public final void notationDecl(String str, String str2, String str3) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.notationDecl(str, str2, str3);
        } else {
            doNotationDecl(str, str2, str3);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.processingInstruction(str, str2);
        } else {
            doProcessingInstruction(str, str2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.skippedEntity(str);
        } else {
            doSkippedEntity(str);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public final void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.unparsedEntityDecl(str, str2, str3, str4);
        } else {
            doUnparsedEntityDecl(str, str2, str3, str4);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public final void warning(SAXParseException sAXParseException) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.warning(sAXParseException);
        } else {
            doWarning(sAXParseException);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public final void error(SAXParseException sAXParseException) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.error(sAXParseException);
        } else {
            doError(sAXParseException);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public final void fatalError(SAXParseException sAXParseException) throws SAXException {
        if (this.skip) {
            return;
        }
        DelegatingHandler delegatingHandler = this.delegate;
        if (delegatingHandler != null) {
            delegatingHandler.fatalError(sAXParseException);
        } else {
            doFatalError(sAXParseException);
        }
    }

    public void log(int i, String str, Throwable th) {
        Message.debug(th);
        log(i, str);
    }

    public void log(int i, String str) {
        Message.log(i, getLocation(getLocator()) + str);
    }

    public static String getLocation(Locator locator) {
        if (locator == null) {
            return "";
        }
        return "[line " + locator.getLineNumber() + " col. " + locator.getColumnNumber() + "] ";
    }

    public final void skipOnError(DelegatingHandler delegatingHandler, Class<? extends DelegatingHandler> cls, String str) {
        while (!cls.isAssignableFrom(delegatingHandler.getClass())) {
            delegatingHandler = delegatingHandler.getParent();
        }
        log(0, str + ". The '" + delegatingHandler.getName() + "' element " + getCurrentElementIdentifier() + " is then ignored.");
        delegatingHandler.skip();
    }

    public String getRequiredAttribute(Attributes attributes, String str) throws SAXParseException {
        String value = attributes.getValue(str);
        if (value != null) {
            return value;
        }
        throw new SAXParseException("Required attribute '" + str + "' not found", getLocator());
    }

    public String getOptionalAttribute(Attributes attributes, String str, String str2) {
        String value = attributes.getValue(str);
        return value == null ? str2 : value;
    }

    public int getRequiredIntAttribute(Attributes attributes, String str, Integer num) throws SAXParseException {
        return parseInt(str, getRequiredAttribute(attributes, str));
    }

    public Integer getOptionalIntAttribute(Attributes attributes, String str, Integer num) throws SAXParseException {
        String value = attributes.getValue(str);
        return value == null ? num : Integer.valueOf(parseInt(str, value));
    }

    public final int parseInt(String str, String str2) throws SAXParseException {
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            throw new SAXParseException("Attribute '" + str + "' is expected to be an integer but was '" + str2 + "' (" + e.getMessage() + ")", getLocator());
        }
    }

    public long getRequiredLongAttribute(Attributes attributes, String str) throws SAXParseException {
        return parseLong(str, getRequiredAttribute(attributes, str));
    }

    public Long getOptionalLongAttribute(Attributes attributes, String str, Long l) throws SAXParseException {
        String value = attributes.getValue(str);
        return value == null ? l : Long.valueOf(parseLong(str, value));
    }

    public final long parseLong(String str, String str2) throws SAXParseException {
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            throw new SAXParseException("Attribute '" + str + "' is expected to be an long but was '" + str2 + "' (" + e.getMessage() + ")", getLocator());
        }
    }

    public boolean getRequiredBooleanAttribute(Attributes attributes, String str) throws SAXParseException {
        return parseBoolean(str, getRequiredAttribute(attributes, str));
    }

    public Boolean getOptionalBooleanAttribute(Attributes attributes, String str, Boolean bool) throws SAXParseException {
        String value = attributes.getValue(str);
        return value == null ? bool : Boolean.valueOf(parseBoolean(str, value));
    }

    static {
        String string = Boolean.TRUE.toString();
        Locale locale = Locale.US;
        TRUE = string.toLowerCase(locale);
        FALSE = Boolean.FALSE.toString().toLowerCase(locale);
    }

    public final boolean parseBoolean(String str, String str2) throws SAXParseException {
        String lowerCase = str2.toLowerCase(Locale.US);
        if (lowerCase.equals(TRUE)) {
            return true;
        }
        if (lowerCase.equals(FALSE)) {
            return false;
        }
        throw new SAXParseException("Attribute '" + str + "' is expected to be a boolean but was '" + str2 + "'", getLocator());
    }
}
