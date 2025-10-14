package com.thoughtworks.xstream.converters;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.thoughtworks.xstream.XStreamException;
import com.thoughtworks.xstream.core.util.OrderRetainingMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ErrorWritingException extends XStreamException implements ErrorWriter {
    public static final String SEPARATOR = "\n-------------------------------";
    public final Map stuff;

    public ErrorWritingException(String str) {
        super(str);
        this.stuff = new OrderRetainingMap();
        addData(str, null);
    }

    public ErrorWritingException(Throwable th) {
        super(th);
        this.stuff = new OrderRetainingMap();
        addData(null, th);
    }

    public ErrorWritingException(String str, Throwable th) {
        super(str, th);
        this.stuff = new OrderRetainingMap();
        addData(str, th);
    }

    public final void addData(String str, Throwable th) {
        if (str != null) {
            add(ThrowableDeserializer.PROP_NAME_MESSAGE, str);
        }
        if (th != null) {
            add("cause-exception", th.getClass().getName());
            add("cause-message", th instanceof ErrorWritingException ? ((ErrorWritingException) th).getShortMessage() : th.getMessage());
        }
    }

    @Override // com.thoughtworks.xstream.converters.ErrorWriter
    public String get(String str) {
        return (String) this.stuff.get(str);
    }

    @Override // com.thoughtworks.xstream.converters.ErrorWriter
    public void add(String str, String str2) {
        int i = 0;
        String string = str;
        while (this.stuff.containsKey(string)) {
            if (str2.equals((String) this.stuff.get(string))) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append("[");
            i++;
            stringBuffer.append(i);
            stringBuffer.append("]");
            string = stringBuffer.toString();
        }
        this.stuff.put(string, str2);
    }

    @Override // com.thoughtworks.xstream.converters.ErrorWriter
    public void set(String str, String str2) {
        this.stuff.put(str, str2);
        int i = 0;
        String string = str;
        while (this.stuff.containsKey(string)) {
            if (i != 0) {
                this.stuff.remove(string);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append("[");
            i++;
            stringBuffer.append(i);
            stringBuffer.append("]");
            string = stringBuffer.toString();
        }
    }

    @Override // com.thoughtworks.xstream.converters.ErrorWriter
    public Iterator keys() {
        return this.stuff.keySet().iterator();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        if (super.getMessage() != null) {
            stringBuffer.append(super.getMessage());
        }
        if (!stringBuffer.toString().endsWith(SEPARATOR)) {
            stringBuffer.append("\n---- Debugging information ----");
        }
        Iterator itKeys = keys();
        while (itKeys.hasNext()) {
            String str = (String) itKeys.next();
            String str2 = get(str);
            stringBuffer.append('\n');
            stringBuffer.append(str);
            stringBuffer.append("                    ".substring(Math.min(20, str.length())));
            stringBuffer.append(": ");
            stringBuffer.append(str2);
        }
        stringBuffer.append(SEPARATOR);
        return stringBuffer.toString();
    }

    public String getShortMessage() {
        return super.getMessage();
    }
}
