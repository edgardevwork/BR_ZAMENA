package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.logger.common.impl.e */
/* loaded from: classes8.dex */
public final class C10073e {

    /* renamed from: a */
    public final Pattern f9498a = Pattern.compile("[\\p{Space},;]");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r3 == (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r3 == (-1)) goto L8;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m7050a(Matcher matcher, int i, int i2) {
        int iStart;
        int iM7050a;
        if (i2 < i) {
            return -1;
        }
        int i3 = ((i2 - i) / 2) + i;
        matcher.region(i3, i2);
        if (matcher.find()) {
            iStart = matcher.start();
            iM7050a = m7050a(matcher, iStart + 1, i2);
        } else {
            matcher.region(i, i3);
            if (!matcher.find()) {
                return -1;
            }
            iStart = matcher.start();
            iM7050a = m7050a(matcher, iStart + 1, i3);
        }
    }
}
