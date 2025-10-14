package io.ktor.utils.p050io;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteWriteChannel.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"Lio/ktor/utils/io/ClosedWriteChannelException;", "Ljava/util/concurrent/CancellationException;", "Lio/ktor/utils/io/CancellationException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "(Ljava/lang/String;)V", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ClosedWriteChannelException extends CancellationException {
    public ClosedWriteChannelException(@Nullable String str) {
        super(str);
    }
}
