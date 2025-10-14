package com.blackhub.bronline.game.gui;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.caverock.androidsvg.SVG;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Useful.kt */
@SourceDebugExtension({"SMAP\nUseful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Useful.kt\ncom/blackhub/bronline/game/gui/UsefulKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,360:1\n13365#2,2:361\n*S KotlinDebug\n*F\n+ 1 Useful.kt\ncom/blackhub/bronline/game/gui/UsefulKt\n*L\n346#1:361,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UsefulKt {
    @NotNull
    public static final String getPriceWithSpaces(@Nullable Number number) {
        if (number == null) {
            number = 0;
        }
        String str = new DecimalFormat("#,###,###", new DecimalFormatSymbols(Locale.getDefault())).format(number);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getPriceWithDot(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormatSymbols.setGroupingSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(number).toString();
    }

    @NotNull
    public static final Spanned transformColors(@Nullable String str) {
        int i;
        if (str == null) {
            str = "random text";
        }
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 != str.length() && str.charAt(i3) == '{' && (i = i3 + 7) < str.length()) {
                String str2 = new String() + "#";
                int i4 = i3 + 1;
                String strSubstring = str.substring(i4, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                linkedList.addLast(str2 + strSubstring);
                String strSubstring2 = str.substring(0, i4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                String strSubstring3 = str.substring(i, str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                str = strSubstring2 + "repl" + i2 + strSubstring3;
                i2++;
            }
        }
        Iterator it = linkedList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (i5 == 0) {
                String strQuote = Pattern.quote(new String() + "{repl" + i5 + WebvttCssParser.RULE_END);
                Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
                str = new Regex(strQuote).replace(str, "<font color='" + str3 + "'>");
            } else {
                String strQuote2 = Pattern.quote(new String() + "{repl" + i5 + WebvttCssParser.RULE_END);
                Intrinsics.checkNotNullExpressionValue(strQuote2, "quote(...)");
                str = new Regex(strQuote2).replace(str, "</font><font color='" + str3 + "'>");
            }
            i5++;
        }
        if (linkedList.size() >= 1) {
            str = str + "</font>";
        }
        String strQuote3 = Pattern.quote(StringUtils.f9903LF);
        Intrinsics.checkNotNullExpressionValue(strQuote3, "quote(...)");
        Spanned spannedFromHtml = Html.fromHtml(new Regex(strQuote3).replace(str, "<br>"), 0);
        Intrinsics.checkNotNull(spannedFromHtml);
        return spannedFromHtml;
    }

    public static final int getTextLength(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        textPaint.setTypeface(textView.getTypeface());
        return (int) textPaint.measureText(textView.getText().toString());
    }

    public static final void hideSystemUIWindow(@Nullable Window window) {
        hideSystemUI(window != null ? window.getDecorView() : null);
    }

    public static final void hideSystemUI(@Nullable View view) {
        WindowInsetsController windowInsetsController;
        if (Build.VERSION.SDK_INT < 30) {
            if (view == null) {
                return;
            }
            view.setSystemUiVisibility(7942);
        } else {
            if (view == null || (windowInsetsController = view.getWindowInsetsController()) == null) {
                return;
            }
            windowInsetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars() | WindowInsets.Type.systemBars());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void setCustomTouchInterceptor(@NotNull PopupWindow window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.setTouchInterceptor(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.UsefulKt$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return UsefulKt.setCustomTouchInterceptor$lambda$1(view, motionEvent);
            }
        });
    }

    public static final boolean setCustomTouchInterceptor$lambda$1(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return motionEvent.getX() < 0.0f || motionEvent.getX() > ((float) view.getWidth()) || motionEvent.getY() < 0.0f || motionEvent.getY() > ((float) view.getHeight());
        }
        return false;
    }

    public static final boolean isActivityValid(@NotNull ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return !activity.isFinishing() && !activity.isDestroyed() && activity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && activity.getWindow().getDecorView().getWindowVisibility() == 0;
    }

    public static final boolean isValidCharField(char c, @NotNull char[] validationChars) {
        Intrinsics.checkNotNullParameter(validationChars, "validationChars");
        boolean z = false;
        for (char c2 : validationChars) {
            if (c == c2) {
                z = true;
            }
        }
        return z;
    }
}

