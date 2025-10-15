package org.apache.ivy.util.cli;

import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public class Option {
    public String[] args;
    public boolean countArgs;
    public boolean deprecated;
    public String description;
    public String name;
    public boolean required;

    public Option(String str, String[] strArr, String str2, boolean z, boolean z2, boolean z3) {
        this.name = str;
        this.args = strArr;
        this.description = str2;
        this.required = z;
        this.countArgs = z2;
        this.deprecated = z3;
        if (z) {
            throw new UnsupportedOperationException("required option not supported yet");
        }
    }

    public String getName() {
        return this.name;
    }

    public String[] getArgs() {
        return this.args;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isRequired() {
        return this.required;
    }

    public boolean isCountArgs() {
        return this.countArgs;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public String[] parse(ListIterator<String> listIterator) throws ParseException {
        if (isCountArgs()) {
            int length = this.args.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                if (!listIterator.hasNext()) {
                    missingArgument(i);
                }
                String next = listIterator.next();
                strArr[i] = next;
                if (next.startsWith("-")) {
                    missingArgument(i);
                }
            }
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String next2 = listIterator.next();
            if (next2.startsWith("-")) {
                listIterator.previous();
                break;
            }
            arrayList.add(next2);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final void missingArgument(int i) throws ParseException {
        if (i == 0) {
            throw new ParseException("no argument for: " + this.name);
        }
        throw new ParseException("missing argument for: " + this.name + ". Expected: " + getArgsSpec());
    }

    public String getSpec() {
        return "-" + this.name + " " + getArgsSpec();
    }

    public final String getArgsSpec() {
        if (this.args.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.args) {
            sb.append("<");
            sb.append(str);
            sb.append("> ");
        }
        return sb.toString();
    }
}
