package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface IParamsAppender<T> {
    void appendParams(@NonNull Uri.Builder builder, @NonNull T t);
}
