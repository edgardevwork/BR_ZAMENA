package io.ktor.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import kotlin.Metadata;
import org.apache.ivy.osgi.updatesite.xml.UpdateSiteDigestParser;
import org.jetbrains.annotations.NotNull;

/* compiled from: HashFunction.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH&¨\u0006\n"}, m7105d2 = {"Lio/ktor/util/HashFunction;", "", UpdateSiteDigestParser.DigestHandler.DIGEST, "", "update", "", "input", TypedValues.CycleType.S_WAVE_OFFSET, "", CacheFileMetadataIndex.COLUMN_LENGTH, "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface HashFunction {
    @NotNull
    byte[] digest();

    void update(@NotNull byte[] input, int offset, int length);

    /* compiled from: HashFunction.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void update$default(HashFunction hashFunction, byte[] bArr, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            hashFunction.update(bArr, i, i2);
        }
    }
}
