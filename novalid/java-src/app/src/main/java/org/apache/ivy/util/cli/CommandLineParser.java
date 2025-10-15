package org.apache.ivy.util.cli;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes8.dex */
public class CommandLineParser {
    public static final int MAX_SPEC_WIDTH = 30;
    public static final int MIN_DESC_WIDTH = 40;
    public Map<String, Option> options = new LinkedHashMap();
    public Map<String, List<Option>> categories = new LinkedHashMap();

    public CommandLineParser addCategory(String str) {
        this.categories.put(str, new ArrayList());
        return this;
    }

    public CommandLineParser addOption(Option option) {
        this.options.put(option.getName(), option);
        if (!this.categories.isEmpty()) {
            ((List) new LinkedList(this.categories.values()).getLast()).add(option);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r2 = r8.length - r1;
        r3 = new java.lang.String[r2];
        java.lang.System.arraycopy(r8, r1, r3, 0, r2);
        r0.setLeftOverArgs(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommandLine parse(String[] strArr) throws ParseException {
        CommandLine commandLine = new CommandLine();
        int length = strArr.length;
        ListIterator<String> listIterator = Arrays.asList(strArr).listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String next = listIterator.next();
            if ("--".equals(next)) {
                length = listIterator.nextIndex();
                break;
            }
            if (!next.startsWith("-")) {
                length = listIterator.previousIndex();
                break;
            }
            Option option = this.options.get(next.substring(1));
            if (option == null) {
                throw new ParseException("Unrecognized option: " + next);
            }
            commandLine.addOptionValues(next.substring(1), option.parse(listIterator));
        }
    }

    public void printHelp(PrintWriter printWriter, int i, String str, boolean z) {
        printWriter.println("usage: " + str);
        int iMin = 0;
        for (Option option : this.options.values()) {
            if (!option.isDeprecated() || z) {
                iMin = Math.min(30, Math.max(iMin, option.getSpec().length()));
            }
        }
        for (Map.Entry<String, List<Option>> entry : this.categories.entrySet()) {
            printWriter.println("==== " + entry.getKey());
            for (Option option2 : entry.getValue()) {
                if (!option2.isDeprecated() || z) {
                    String spec = option2.getSpec();
                    printWriter.print(" " + spec);
                    int length = spec.length() + 1;
                    printWriter.print(StringUtils.repeat(" ", iMin - length));
                    StringBuilder sb = new StringBuilder();
                    sb.append(option2.isDeprecated() ? "DEPRECATED: " : "");
                    sb.append(option2.getDescription());
                    StringBuilder sb2 = new StringBuilder(sb.toString());
                    int iMin2 = Math.min(sb2.length(), i - Math.max(length, iMin));
                    if (iMin2 > 40 || sb2.length() + length < i) {
                        printWriter.print(sb2.substring(0, iMin2));
                        sb2.delete(0, iMin2);
                    }
                    printWriter.println();
                    while (sb2.length() > 0) {
                        printWriter.print(StringUtils.repeat(" ", iMin));
                        int iMin3 = Math.min(sb2.length(), i - iMin);
                        printWriter.println(sb2.substring(0, iMin3));
                        sb2.delete(0, iMin3);
                    }
                }
            }
            printWriter.println();
        }
    }
}
