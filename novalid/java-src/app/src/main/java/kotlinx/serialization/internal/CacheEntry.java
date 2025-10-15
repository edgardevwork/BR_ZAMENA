package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.Nullable;

/* compiled from: Caching.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m7105d2 = {"Lkotlinx/serialization/internal/CacheEntry;", ExifInterface.GPS_DIRECTION_TRUE, "", "serializer", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class CacheEntry<T> {

    @JvmField
    @Nullable
    public final KSerializer<T> serializer;

    public CacheEntry(@Nullable KSerializer<T> kSerializer) {
        this.serializer = kSerializer;
    }
}
