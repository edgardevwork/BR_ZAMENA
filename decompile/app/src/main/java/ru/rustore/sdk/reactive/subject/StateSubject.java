package ru.rustore.sdk.reactive.subject;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: StateSubject.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"Lru/rustore/sdk/reactive/subject/StateSubject;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/subject/Subject;", "value", "getValue", "()Ljava/lang/Object;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface StateSubject<T> extends Subject<T> {
    T getValue();
}
