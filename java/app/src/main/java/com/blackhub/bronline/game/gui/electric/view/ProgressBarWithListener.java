package com.blackhub.bronline.game.gui.electric.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProgressBarWithListener.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ProgressBarWithListener extends ProgressBar {
    public static final int $stable = 8;

    @Nullable
    public OnProgressChangeListener progressListener;

    /* compiled from: ProgressBarWithListener.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/view/ProgressBarWithListener$OnProgressChangeListener;", "", "onProgressChanged", "", "progress", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public interface OnProgressChangeListener {
        void onProgressChanged(int progress);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarWithListener(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void setOnProgressChangeListener(@Nullable OnProgressChangeListener listener) {
        this.progressListener = listener;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int progress) {
        super.setProgress(progress);
        OnProgressChangeListener onProgressChangeListener = this.progressListener;
        if (onProgressChangeListener != null) {
            onProgressChangeListener.onProgressChanged(progress);
        }
    }
}

