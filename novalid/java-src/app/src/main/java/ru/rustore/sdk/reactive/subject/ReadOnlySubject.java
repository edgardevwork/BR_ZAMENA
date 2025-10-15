package ru.rustore.sdk.reactive.subject;

import androidx.core.net.MailTo;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.observable.Observable;

/* compiled from: ReadOnlySubject.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0096\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lru/rustore/sdk/reactive/subject/ReadOnlySubject;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/subject/Subject;", MailTo.SUBJECT, "(Lru/rustore/sdk/reactive/subject/Subject;)V", "observe", "Lru/rustore/sdk/reactive/observable/Observable;", "backpressureStrategy", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ReadOnlySubject<T> implements Subject<T> {

    @NotNull
    public final Subject<T> subject;

    @Override // ru.rustore.sdk.reactive.subject.Subject
    @NotNull
    public Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return this.subject.observe(backpressureStrategy);
    }

    public ReadOnlySubject(@NotNull Subject<T> subject) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        this.subject = subject;
    }
}
