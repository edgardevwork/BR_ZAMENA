package io.ktor.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.updatesite.xml.UpdateSiteDigestParser;
import org.jetbrains.annotations.NotNull;

/* compiled from: HashFunction.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0082\u0004¨\u0006\t"}, m7105d2 = {UpdateSiteDigestParser.DigestHandler.DIGEST, "", "Lio/ktor/util/HashFunction;", "input", TypedValues.CycleType.S_WAVE_OFFSET, "", CacheFileMetadataIndex.COLUMN_LENGTH, "leftRotate", "bitCount", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class HashFunctionKt {
    public static final int leftRotate(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static /* synthetic */ byte[] digest$default(HashFunction hashFunction, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return digest(hashFunction, bArr, i, i2);
    }

    @NotNull
    public static final byte[] digest(@NotNull HashFunction hashFunction, @NotNull byte[] input, int i, int i2) {
        Intrinsics.checkNotNullParameter(hashFunction, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        hashFunction.update(input, i, i2);
        return hashFunction.digest();
    }
}
