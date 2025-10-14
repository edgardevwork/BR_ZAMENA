package com.blackhub.bronline.game.gui.brdialogwindow;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: dialogWindowUseful.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"changeTextViewWidth", "", "textView", "Landroid/widget/TextView;", "makeAllViewsVisible", "root", "Landroid/view/ViewGroup;", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DialogWindowUsefulKt {
    public static final void changeTextViewWidth(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.post(new Runnable() { // from class: com.blackhub.bronline.game.gui.brdialogwindow.DialogWindowUsefulKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DialogWindowUsefulKt.changeTextViewWidth$lambda$1(textView);
            }
        });
    }

    public static final void changeTextViewWidth$lambda$1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "$textView");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        textPaint.setTypeface(textView.getTypeface());
        textPaint.measureText(textView.getText().toString());
        StaticLayout staticLayout = new StaticLayout(textView.getText(), textPaint, 100000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        float lineWidth = staticLayout.getLineWidth(0);
        for (int i = 0; i < lineCount; i++) {
            if (staticLayout.getLineWidth(i) >= lineWidth) {
                lineWidth = staticLayout.getLineWidth(i) + 5.0f;
            }
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) lineWidth;
        textView.setLayoutParams(layoutParams);
    }

    public static final void makeAllViewsVisible(@NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        root.setVisibility(0);
        int childCount = root.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (root.getChildAt(i) instanceof ViewGroup) {
                View childAt = root.getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                makeAllViewsVisible((ViewGroup) childAt);
            } else {
                root.getChildAt(i).setVisibility(0);
            }
        }
    }
}
