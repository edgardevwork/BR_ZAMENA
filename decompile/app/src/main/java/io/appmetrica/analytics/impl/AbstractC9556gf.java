package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.gf */
/* loaded from: classes5.dex */
public abstract class AbstractC9556gf {
    /* renamed from: a */
    public static final String m6184a(C9475d9 c9475d9) {
        String string;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c9475d9.f7933c;
        String str = c9475d9.f7934d;
        byte[] bArr = c9475d9.f7935e;
        if (i == 1) {
            string = "Attribution";
        } else if (i == 2) {
            string = "Session start";
        } else if (i == 4) {
            if (str == null) {
                str = "null";
            }
            StringBuilder sb2 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, Charsets.UTF_8);
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append(" with value ");
                    sb2.append(str2);
                }
            }
            string = sb2.toString();
        } else if (i == 5) {
            string = "Referrer";
        } else if (i == 7) {
            string = "Session heartbeat";
        } else if (i == 13) {
            string = "The very first event";
        } else if (i == 35) {
            string = "E-Commerce";
        } else if (i == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i == 42) {
            string = "External attribution";
        } else if (i == 16) {
            string = "Open";
        } else if (i == 17) {
            string = "Update";
        } else if (i == 20) {
            string = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    string = "ANR";
                    break;
                case 26:
                    string = "Crash: " + str;
                    break;
                case 27:
                    string = "Error: " + str;
                    break;
                default:
                    string = "type=" + i;
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb.append(string);
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m6185a(String str, EnumC9329Xa enumC9329Xa, String str2, String str3) {
        if (!AbstractC9875t9.f9108d.contains(EnumC9329Xa.m5744a(enumC9329Xa.f7518a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC9329Xa.name());
        if (AbstractC9875t9.f9110f.contains(enumC9329Xa) && !TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (AbstractC9875t9.f9109e.contains(enumC9329Xa) && !TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
