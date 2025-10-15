package ru.rustore.sdk.reactive.observable;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ObservableMap.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u0005¨\u0006\u0006"}, m7105d2 = {"map", "Lru/rustore/sdk/reactive/observable/Observable;", "R", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "sdk-public-reactive_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ObservableMapKt {
    @NotNull
    public static final <T, R> Observable<R> map(@NotNull Observable<T> observable, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new ObservableMap(observable, block);
    }
}
