package ru.rustore.sdk.reactive.subject;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SubjectExtensions.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"asStateSubject", "Lru/rustore/sdk/reactive/subject/StateSubject;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/subject/MutableStateSubject;", "asSubject", "Lru/rustore/sdk/reactive/subject/Subject;", "Lru/rustore/sdk/reactive/subject/MutableSubject;", "sdk-public-reactive_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class SubjectExtensionsKt {
    @NotNull
    public static final <T> Subject<T> asSubject(@NotNull MutableSubject<T> mutableSubject) {
        Intrinsics.checkNotNullParameter(mutableSubject, "<this>");
        return new ReadOnlySubject(mutableSubject);
    }

    @NotNull
    public static final <T> Subject<T> asSubject(@NotNull MutableStateSubject<T> mutableStateSubject) {
        Intrinsics.checkNotNullParameter(mutableStateSubject, "<this>");
        return new ReadOnlySubject(mutableStateSubject);
    }

    @NotNull
    public static final <T> StateSubject<T> asStateSubject(@NotNull MutableStateSubject<T> mutableStateSubject) {
        Intrinsics.checkNotNullParameter(mutableStateSubject, "<this>");
        return new ReadOnlyStateSubject(mutableStateSubject);
    }
}
