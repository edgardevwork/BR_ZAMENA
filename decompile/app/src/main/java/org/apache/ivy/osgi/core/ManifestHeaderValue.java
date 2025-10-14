package org.apache.ivy.osgi.core;

import java.io.PrintStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class ManifestHeaderValue {
    public List<ManifestHeaderElement> elements = new ArrayList();

    public ManifestHeaderValue() {
    }

    public ManifestHeaderValue(String str) throws ParseException {
        if (str != null) {
            new ManifestHeaderParser(str).parse();
        }
    }

    public List<ManifestHeaderElement> getElements() {
        return this.elements;
    }

    public String getSingleValue() {
        if (this.elements.isEmpty()) {
            return null;
        }
        List<String> values = getElements().iterator().next().getValues();
        if (values.isEmpty()) {
            return null;
        }
        return values.iterator().next();
    }

    public List<String> getValues() {
        if (this.elements.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ManifestHeaderElement> it = getElements().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getValues());
        }
        return arrayList;
    }

    public void addElement(ManifestHeaderElement manifestHeaderElement) {
        this.elements.add(manifestHeaderElement);
    }

    public class ManifestHeaderParser {

        /* renamed from: c */
        public char f9972c;
        public final String header;
        public boolean isDirective;
        public int length;
        public String paramName;
        public boolean valuesParsed;
        public StringBuilder buffer = new StringBuilder();
        public int pos = 0;
        public ManifestHeaderElement elem = new ManifestHeaderElement();

        public ManifestHeaderParser(String str) {
            this.header = str;
            this.length = str.length();
        }

        public void parse() throws ParseException {
            do {
                this.elem = new ManifestHeaderElement();
                int i = this.pos;
                parseElement();
                if (this.elem.getValues().isEmpty()) {
                    error("No defined value", i);
                } else {
                    ManifestHeaderValue.this.addElement(this.elem);
                }
            } while (this.pos < this.length);
        }

        public final char readNext() {
            int i = this.pos;
            if (i == this.length) {
                this.f9972c = (char) 0;
            } else {
                String str = this.header;
                this.pos = i + 1;
                this.f9972c = str.charAt(i);
            }
            return this.f9972c;
        }

        public final void error(String str) throws ParseException {
            error(str, this.pos - 1);
        }

        public final void error(String str, int i) throws ParseException {
            throw new ParseException(str, i);
        }

        public final void parseElement() throws ParseException {
            this.valuesParsed = false;
            do {
                parseValueOrParameter();
                if (this.f9972c != ';') {
                    return;
                }
            } while (this.pos < this.length);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void parseValueOrParameter() throws ParseException {
            boolean z = false;
            do {
                char next = readNext();
                if (next != 0) {
                    if (next != '\r' && next != ' ') {
                        if (next != ',') {
                            if (next != '=') {
                                if (next != '\t' && next != '\n') {
                                    if (next != ':') {
                                        if (next != ';') {
                                            this.buffer.append(this.f9972c);
                                            z = true;
                                        }
                                    }
                                }
                            }
                            endParameterName();
                            parseSeparator();
                            parseParameterValue();
                            return;
                        }
                        endValue();
                        return;
                    }
                    if (z) {
                        this.buffer.append(this.f9972c);
                    }
                }
            } while (this.pos < this.length);
            endValue();
        }

        public final void endValue() throws ParseException {
            if (this.valuesParsed) {
                error("Early end of a parameter");
                this.buffer.setLength(0);
            } else {
                if (this.buffer.length() == 0) {
                    error("Empty value");
                }
                this.elem.addValue(this.buffer.toString());
                this.buffer.setLength(0);
            }
        }

        public final void endParameterName() throws ParseException {
            if (this.buffer.length() == 0) {
                error("Empty parameter name");
                this.paramName = null;
            }
            this.paramName = this.buffer.toString();
            this.buffer.setLength(0);
        }

        public final void parseSeparator() throws ParseException {
            if (this.f9972c == '=') {
                this.isDirective = false;
                return;
            }
            if (readNext() != '=') {
                error("Expecting '='");
                this.pos--;
                this.paramName = null;
            }
            this.isDirective = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void parseParameterValue() throws ParseException {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            do {
                char next = readNext();
                if (next != 0) {
                    if (next != '\r' && next != ' ') {
                        if (next == '\"') {
                            z3 = true;
                        } else if (next != '\'') {
                            if (next != ',') {
                                if (next == '=') {
                                    error("Illegal character '" + this.f9972c + "' in parameter value of " + this.paramName);
                                    this.paramName = null;
                                } else {
                                    if (next != '\\') {
                                        if (next != '\t' && next != '\n') {
                                            if (next != ':') {
                                                if (next != ';') {
                                                    if (z2 && this.paramName != null) {
                                                        error("Expecting the end of a parameter value");
                                                        this.paramName = null;
                                                    }
                                                    this.buffer.append(this.f9972c);
                                                }
                                            }
                                            error("Illegal character '" + this.f9972c + "' in parameter value of " + this.paramName);
                                            this.paramName = null;
                                        }
                                        if (z) {
                                        }
                                    } else {
                                        if (z2 && this.paramName != null) {
                                            error("Expecting the end of a parameter value");
                                            this.paramName = null;
                                        }
                                        appendEscaped();
                                    }
                                    z = true;
                                }
                            }
                            endParameterValue();
                            return;
                        }
                        if (z2 && this.paramName != null) {
                            error("Expecting the end of a parameter value");
                            this.paramName = null;
                        }
                        if (z) {
                            this.buffer.append(this.f9972c);
                        } else {
                            appendQuoted(z3);
                            z = true;
                            z2 = true;
                        }
                    } else if (z) {
                        z2 = true;
                    }
                }
            } while (this.pos < this.length);
            endParameterValue();
        }

        public final void endParameterValue() throws ParseException {
            if (this.paramName == null) {
                return;
            }
            if (this.buffer.length() == 0) {
                error("Empty parameter value");
                return;
            }
            String string = this.buffer.toString();
            if (this.isDirective) {
                this.elem.addDirective(this.paramName, string);
            } else {
                this.elem.addAttribute(this.paramName, string);
            }
            this.valuesParsed = true;
            this.buffer.setLength(0);
        }

        public final void appendQuoted(boolean z) {
            do {
                char next = readNext();
                if (next != 0) {
                    if (next != '\"') {
                        if (next != '\'') {
                            if (next != '\\') {
                                this.buffer.append(this.f9972c);
                            }
                        } else if (!z) {
                            return;
                        } else {
                            this.buffer.append(this.f9972c);
                        }
                    } else if (z) {
                        return;
                    } else {
                        this.buffer.append(this.f9972c);
                    }
                }
            } while (this.pos < this.length);
        }

        public final void appendEscaped() {
            if (this.pos < this.length) {
                this.buffer.append(readNext());
            } else {
                this.buffer.append(this.f9972c);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ManifestHeaderValue)) {
            return false;
        }
        ManifestHeaderValue manifestHeaderValue = (ManifestHeaderValue) obj;
        if (manifestHeaderValue.elements.size() != this.elements.size()) {
            return false;
        }
        Iterator<ManifestHeaderElement> it = this.elements.iterator();
        while (it.hasNext()) {
            if (!manifestHeaderValue.elements.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ManifestHeaderElement manifestHeaderElement : this.elements) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(manifestHeaderElement.toString());
        }
        return sb.toString();
    }

    public static void writeParseException(PrintStream printStream, String str, ParseException parseException) {
        printStream.println(parseException.getMessage());
        printStream.print("   " + str + "\n   ");
        for (int i = 0; i < parseException.getErrorOffset(); i++) {
            printStream.print(' ');
        }
        printStream.println('^');
    }
}
