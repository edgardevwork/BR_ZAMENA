package com.blackhub.bronline.game.gui.familysystem;

import android.text.Html;
import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActionWithString.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class ActionWithString {
    public static final int $stable = 0;

    @NotNull
    public final Spanned convertStringToHtmlType(@NotNull String currentText) {
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = currentText.length();
        String str = "";
        String str2 = "";
        for (int i = 0; i < length; i++) {
            if (currentText.charAt(i) == '{') {
                arrayList.add(Integer.valueOf(i + 1));
            } else if (arrayList.size() == 0 && currentText.charAt(i) != '/' && currentText.charAt(i) != '\\') {
                str2 = str2 + currentText.charAt(i);
            }
        }
        if (!Intrinsics.areEqual(str2, "")) {
            arrayList3.add(str2);
            str2 = "";
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int length2 = currentText.length();
            String str3 = "";
            boolean z = false;
            for (int i2 = 0; i2 < length2; i2++) {
                Intrinsics.checkNotNull(num);
                int iIntValue = i2 - num.intValue();
                if (iIntValue >= 0 && iIntValue < 6) {
                    str3 = str3 + (currentText.charAt(i2) == '-' ? '0' : currentText.charAt(i2));
                } else if (i2 - num.intValue() > 6 && !z) {
                    if (currentText.charAt(i2) != '{') {
                        if (currentText.charAt(i2) != '/' && currentText.charAt(i2) != '\\') {
                            str2 = str2 + currentText.charAt(i2);
                        }
                    } else if (!Intrinsics.areEqual(str2, "")) {
                        arrayList3.add(str2);
                        str2 = "";
                        z = true;
                    }
                }
            }
            if (str3.length() == 6) {
                arrayList2.add(str3);
            }
        }
        if (!Intrinsics.areEqual(str2, "")) {
            arrayList3.add(str2);
        }
        if (arrayList3.size() > arrayList.size()) {
            Object obj = arrayList3.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            str = (String) obj;
            if (arrayList3.size() - 1 == arrayList2.size()) {
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    str = str + "<font color=\"" + obj2 + "\">" + arrayList3.get(i3) + "</font>";
                }
            }
        } else if (arrayList3.size() == arrayList2.size()) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                str = str + "<font color=\"#" + arrayList2.get(i4) + "\">" + arrayList3.get(i4) + "</font>";
            }
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        Intrinsics.checkNotNull(spannedFromHtml);
        return spannedFromHtml;
    }
}

