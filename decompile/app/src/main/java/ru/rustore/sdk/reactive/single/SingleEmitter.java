package ru.rustore.sdk.reactive.single;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleEmitter.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m7105d2 = {"Lru/rustore/sdk/reactive/single/SingleEmitter;", ExifInterface.GPS_DIRECTION_TRUE, "", "error", "", "", "isDisposed", "", "onFinish", "block", "Lkotlin/Function0;", FirebaseAnalytics.Param.SUCCESS, "value", "(Ljava/lang/Object;)V", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface SingleEmitter<T> {
    void error(@NotNull Throwable error);

    /* renamed from: isDisposed */
    boolean getDisposed();

    void onFinish(@NotNull Function0<Unit> block);

    void success(T value);
}
