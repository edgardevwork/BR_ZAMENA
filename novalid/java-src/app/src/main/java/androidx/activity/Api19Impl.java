package androidx.activity;

import android.view.View;
import androidx.annotation.RequiresApi;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PipHintTracker.kt */
@RequiresApi(19)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Landroidx/activity/Api19Impl;", "", "()V", "isAttachedToWindow", "", SVG.View.NODE_NAME, "Landroid/view/View;", "activity-ktx_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class Api19Impl {

    @NotNull
    public static final Api19Impl INSTANCE = new Api19Impl();

    public final boolean isAttachedToWindow(@NotNull View view) {
        return view.isAttachedToWindow();
    }
}
