package io.ktor.utils.p050io.core.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: CharArraySequence.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0086\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0016\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/utils/io/core/internal/CharArraySequence;", "", "array", "", TypedValues.CycleType.S_WAVE_OFFSET, "", CacheFileMetadataIndex.COLUMN_LENGTH, "([CII)V", "getLength", "()I", "get", "", FirebaseAnalytics.Param.INDEX, "indexOutOfBounds", "", "subSequence", "startIndex", "endIndex", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCharArraySequence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharArraySequence.kt\nio/ktor/utils/io/core/internal/CharArraySequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes5.dex */
public final class CharArraySequence implements CharSequence {

    @NotNull
    public final char[] array;
    public final int length;
    public final int offset;

    public CharArraySequence(@NotNull char[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
        this.offset = i;
        this.length = i2;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.length;
    }

    public final int getLength() {
        return this.length;
    }

    public final char get(int index) {
        if (index >= this.length) {
            indexOutOfBounds(index);
            throw new KotlinNothingValueException();
        }
        return this.array[index + this.offset];
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final CharSequence subSequence(int startIndex, int endIndex) {
        if (startIndex < 0) {
            throw new IllegalArgumentException(("startIndex shouldn't be negative: " + startIndex).toString());
        }
        int i = this.length;
        if (startIndex > i) {
            throw new IllegalArgumentException(("startIndex is too large: " + startIndex + " > " + this.length).toString());
        }
        if (startIndex + endIndex > i) {
            throw new IllegalArgumentException(("endIndex is too large: " + endIndex + " > " + this.length).toString());
        }
        if (endIndex < startIndex) {
            throw new IllegalArgumentException(("endIndex should be greater or equal to startIndex: " + startIndex + " > " + endIndex).toString());
        }
        return new CharArraySequence(this.array, this.offset + startIndex, endIndex - startIndex);
    }

    public final Void indexOutOfBounds(int index) {
        throw new IndexOutOfBoundsException("String index out of bounds: " + index + " > " + this.length);
    }
}
