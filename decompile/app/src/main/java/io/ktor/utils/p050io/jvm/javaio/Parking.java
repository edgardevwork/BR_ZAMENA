package io.ktor.utils.p050io.jvm.javaio;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pollers.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\r\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/utils/io/jvm/javaio/Parking;", ExifInterface.GPS_DIRECTION_TRUE, "", "park", "", "timeNanos", "", "token", "()Ljava/lang/Object;", "unpark", "(Ljava/lang/Object;)V", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface Parking<T> {
    void park(long timeNanos);

    @NotNull
    T token();

    void unpark(@NotNull T token);
}
