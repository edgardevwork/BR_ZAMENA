package org.apache.ivy.util;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class MessageLoggerHelper {
    public static void sumupProblems(MessageLogger messageLogger) {
        if (messageLogger.getProblems().isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(messageLogger.getWarns());
        ArrayList arrayList2 = new ArrayList(messageLogger.getErrors());
        messageLogger.info("");
        if (!arrayList2.isEmpty()) {
            messageLogger.log(":: problems summary ::", 0);
        } else {
            messageLogger.log(":: problems summary ::", 1);
        }
        if (arrayList.size() > 0) {
            messageLogger.log(":::: WARNINGS", 1);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                messageLogger.log("\t" + ((String) it.next()) + org.apache.commons.lang3.StringUtils.f9903LF, 1);
            }
        }
        if (arrayList2.size() > 0) {
            messageLogger.log(":::: ERRORS", 0);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                messageLogger.log("\t" + ((String) it2.next()) + org.apache.commons.lang3.StringUtils.f9903LF, 0);
            }
        }
        messageLogger.info("\n:: USE VERBOSE OR DEBUG MESSAGE LEVEL FOR MORE DETAILS");
    }
}
