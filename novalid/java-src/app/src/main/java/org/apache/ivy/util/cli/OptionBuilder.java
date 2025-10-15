package org.apache.ivy.util.cli;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class OptionBuilder {
    public final String name;
    public final List<String> args = new ArrayList();
    public String description = "";
    public boolean required = false;
    public boolean countArgs = true;
    public boolean deprecated = false;

    public OptionBuilder(String str) {
        this.name = str;
    }

    public OptionBuilder required(boolean z) {
        this.required = z;
        return this;
    }

    public OptionBuilder description(String str) {
        this.description = str;
        return this;
    }

    public OptionBuilder arg(String str) {
        this.args.add(str);
        return this;
    }

    public OptionBuilder countArgs(boolean z) {
        this.countArgs = z;
        return this;
    }

    public OptionBuilder deprecated() {
        this.deprecated = true;
        return this;
    }

    public Option create() {
        String str = this.name;
        List<String> list = this.args;
        return new Option(str, (String[]) list.toArray(new String[list.size()]), this.description, this.required, this.countArgs, this.deprecated);
    }
}
