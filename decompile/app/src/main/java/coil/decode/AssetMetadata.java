package coil.decode;

import coil.annotation.ExperimentalCoilApi;
import coil.decode.ImageSource;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageSource.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m7105d2 = {"Lcoil/decode/AssetMetadata;", "Lcoil/decode/ImageSource$Metadata;", "filePath", "", "(Ljava/lang/String;)V", "fileName", "getFileName$annotations", "()V", "getFileName", "()Ljava/lang/String;", "getFilePath", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@ExperimentalCoilApi
/* loaded from: classes3.dex */
public final class AssetMetadata extends ImageSource.Metadata {

    @NotNull
    public final String filePath;

    @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to filePath as it supports assets inside subfolders.")
    public static /* synthetic */ void getFileName$annotations() {
    }

    public AssetMetadata(@NotNull String str) {
        this.filePath = str;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final String getFileName() {
        return StringsKt__StringsKt.substringAfterLast$default(this.filePath, '/', (String) null, 2, (Object) null);
    }
}
