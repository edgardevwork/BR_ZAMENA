package io.ktor.utils.p050io.jvm.javaio;

import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: Blocking.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\n\u001a\u00020\u000b*\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\"#\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"ADAPTER_LOGGER", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getADAPTER_LOGGER", "()Lorg/slf4j/Logger;", "ADAPTER_LOGGER$delegate", "Lkotlin/Lazy;", "CloseToken", "", "FlushToken", "toInputStream", "Ljava/io/InputStream;", "Lio/ktor/utils/io/ByteReadChannel;", "parent", "Lkotlinx/coroutines/Job;", "toOutputStream", "Ljava/io/OutputStream;", "Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class BlockingKt {

    @NotNull
    public static final Lazy ADAPTER_LOGGER$delegate = LazyKt__LazyJVMKt.lazy(new Function0<Logger>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt$ADAPTER_LOGGER$2
        @Override // kotlin.jvm.functions.Function0
        public final Logger invoke() {
            return LoggerFactory.getLogger((Class<?>) BlockingAdapter.class);
        }
    });

    @NotNull
    public static final Object CloseToken = new Object();

    @NotNull
    public static final Object FlushToken = new Object();

    public static final Logger getADAPTER_LOGGER() {
        return (Logger) ADAPTER_LOGGER$delegate.getValue();
    }

    @NotNull
    public static final InputStream toInputStream(@NotNull ByteReadChannel byteReadChannel, @Nullable Job job) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return new InputAdapter(job, byteReadChannel);
    }

    public static /* synthetic */ InputStream toInputStream$default(ByteReadChannel byteReadChannel, Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return toInputStream(byteReadChannel, job);
    }

    @NotNull
    public static final OutputStream toOutputStream(@NotNull ByteWriteChannel byteWriteChannel, @Nullable Job job) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        return new OutputAdapter(job, byteWriteChannel);
    }

    public static /* synthetic */ OutputStream toOutputStream$default(ByteWriteChannel byteWriteChannel, Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return toOutputStream(byteWriteChannel, job);
    }
}
