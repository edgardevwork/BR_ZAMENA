package org.apache.ivy.util.cli;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class CommandLine {
    public String[] leftOverArgs;
    public final Map<String, String[]> optionValues = new HashMap();

    public void addOptionValues(String str, String[] strArr) {
        this.optionValues.put(str, strArr);
    }

    public void setLeftOverArgs(String[] strArr) {
        this.leftOverArgs = strArr;
    }

    public boolean hasOption(String str) {
        return this.optionValues.containsKey(str);
    }

    public String getOptionValue(String str) {
        String[] optionValues = getOptionValues(str);
        if (optionValues == null || optionValues.length == 0) {
            return null;
        }
        return optionValues[0];
    }

    public String getOptionValue(String str, String str2) {
        String optionValue = getOptionValue(str);
        return optionValue == null ? str2 : optionValue;
    }

    public String[] getOptionValues(String str) {
        return this.optionValues.get(str);
    }

    public String[] getLeftOverArgs() {
        return this.leftOverArgs;
    }
}
