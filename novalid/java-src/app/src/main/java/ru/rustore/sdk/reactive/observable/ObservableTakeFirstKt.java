package ru.rustore.sdk.reactive.observable;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ObservableTakeFirst.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m7105d2 = {"takeFirst", "Lru/rustore/sdk/reactive/observable/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "limit", "", "sdk-public-reactive_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ObservableTakeFirstKt {
    public static /* synthetic */ Observable takeFirst$default(Observable observable, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return takeFirst(observable, i);
    }

    @NotNull
    public static final <T> Observable<T> takeFirst(@NotNull Observable<T> observable, int i) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return new ObservableTakeFirst(observable, i);
    }
}
