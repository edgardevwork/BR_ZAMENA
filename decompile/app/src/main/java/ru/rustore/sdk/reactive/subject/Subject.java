package ru.rustore.sdk.reactive.subject;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.observable.Observable;

/* compiled from: Subject.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/reactive/subject/Subject;", ExifInterface.GPS_DIRECTION_TRUE, "", "observe", "Lru/rustore/sdk/reactive/observable/Observable;", "backpressureStrategy", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface Subject<T> {
    @NotNull
    Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy);

    /* compiled from: Subject.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable observe$default(Subject subject, BackpressureStrategy backpressureStrategy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observe");
            }
            if ((i & 1) != 0) {
                backpressureStrategy = new BackpressureStrategy.BufferDropLast(128);
            }
            return subject.observe(backpressureStrategy);
        }
    }
}
