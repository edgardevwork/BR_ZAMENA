package coil.fetch;

import coil.decode.DataSource;
import coil.decode.ImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FetchResult.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m7105d2 = {"Lcoil/fetch/SourceResult;", "Lcoil/fetch/FetchResult;", "source", "Lcoil/decode/ImageSource;", "mimeType", "", "dataSource", "Lcoil/decode/DataSource;", "(Lcoil/decode/ImageSource;Ljava/lang/String;Lcoil/decode/DataSource;)V", "getDataSource", "()Lcoil/decode/DataSource;", "getMimeType", "()Ljava/lang/String;", "getSource", "()Lcoil/decode/ImageSource;", "copy", "equals", "", "other", "", "hashCode", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class SourceResult extends FetchResult {

    @NotNull
    public final DataSource dataSource;

    @Nullable
    public final String mimeType;

    @NotNull
    public final ImageSource source;

    @NotNull
    public final ImageSource getSource() {
        return this.source;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.dataSource;
    }

    public SourceResult(@NotNull ImageSource imageSource, @Nullable String str, @NotNull DataSource dataSource) {
        super(null);
        this.source = imageSource;
        this.mimeType = str;
        this.dataSource = dataSource;
    }

    public static /* synthetic */ SourceResult copy$default(SourceResult sourceResult, ImageSource imageSource, String str, DataSource dataSource, int i, Object obj) {
        if ((i & 1) != 0) {
            imageSource = sourceResult.source;
        }
        if ((i & 2) != 0) {
            str = sourceResult.mimeType;
        }
        if ((i & 4) != 0) {
            dataSource = sourceResult.dataSource;
        }
        return sourceResult.copy(imageSource, str, dataSource);
    }

    @NotNull
    public final SourceResult copy(@NotNull ImageSource source, @Nullable String mimeType, @NotNull DataSource dataSource) {
        return new SourceResult(source, mimeType, dataSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SourceResult) {
            SourceResult sourceResult = (SourceResult) other;
            if (Intrinsics.areEqual(this.source, sourceResult.source) && Intrinsics.areEqual(this.mimeType, sourceResult.mimeType) && this.dataSource == sourceResult.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.dataSource.hashCode();
    }
}
