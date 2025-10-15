package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdData.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, m7105d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData;", "", "renderUri", "Landroid/net/Uri;", "metadata", "", "(Landroid/net/Uri;Ljava/lang/String;)V", "getMetadata", "()Ljava/lang/String;", "getRenderUri", "()Landroid/net/Uri;", "equals", "", "other", "hashCode", "", "toString", "ads-adservices_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class AdData {

    @NotNull
    public final String metadata;

    @NotNull
    public final Uri renderUri;

    public AdData(@NotNull Uri renderUri, @NotNull String metadata) {
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.renderUri = renderUri;
        this.metadata = metadata;
    }

    @NotNull
    public final Uri getRenderUri() {
        return this.renderUri;
    }

    @NotNull
    public final String getMetadata() {
        return this.metadata;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) other;
        return Intrinsics.areEqual(this.renderUri, adData.renderUri) && Intrinsics.areEqual(this.metadata, adData.metadata);
    }

    public int hashCode() {
        return (this.renderUri.hashCode() * 31) + this.metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + ExtendedMessageFormat.QUOTE;
    }
}
