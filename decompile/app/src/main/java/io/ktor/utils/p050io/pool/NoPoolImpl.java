package io.ktor.utils.p050io.pool;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.utils.p050io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pool.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m7105d2 = {"Lio/ktor/utils/io/pool/NoPoolImpl;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/ktor/utils/io/pool/ObjectPool;", "()V", "capacity", "", "getCapacity", "()I", "dispose", "", "recycle", "instance", "(Ljava/lang/Object;)V", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public abstract class NoPoolImpl<T> implements ObjectPool<T> {
    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public void dispose() {
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public int getCapacity() {
        return 0;
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool
    public void recycle(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // io.ktor.utils.p050io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }
}
