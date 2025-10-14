package coil.map;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileUriMapper.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m7105d2 = {"Lcoil/map/FileUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "Ljava/io/File;", "()V", "isApplicable", "", "data", "map", "options", "Lcoil/request/Options;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFileUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUriMapper.kt\ncoil/map/FileUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* loaded from: classes.dex */
public final class FileUriMapper implements Mapper<Uri, File> {
    @Override // coil.map.Mapper
    @Nullable
    public File map(@NotNull Uri data, @NotNull Options options) {
        if (!isApplicable(data)) {
            return null;
        }
        if (Intrinsics.areEqual(data.getScheme(), PomReader.PomProfileElement.FILE)) {
            String path = data.getPath();
            if (path != null) {
                return new File(path);
            }
            return null;
        }
        return new File(data.toString());
    }

    public final boolean isApplicable(Uri data) {
        if (Utils.isAssetUri(data)) {
            return false;
        }
        String scheme = data.getScheme();
        if (scheme != null && !Intrinsics.areEqual(scheme, PomReader.PomProfileElement.FILE)) {
            return false;
        }
        String path = data.getPath();
        if (path == null) {
            path = "";
        }
        return StringsKt__StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) && Utils.getFirstPathSegment(data) != null;
    }
}
