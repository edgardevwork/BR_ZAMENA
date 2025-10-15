package coil.size;

import androidx.annotation.Px;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r\u001a\u0018\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b\u001a\u001a\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\r\"\u001a\u0010\u0000\u001a\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u000e"}, m7105d2 = {"OriginalSize", "Lcoil/size/Size;", "getOriginalSize$annotations", "()V", "getOriginalSize", "()Lcoil/size/Size;", "isOriginal", "", "(Lcoil/size/Size;)Z", "Size", "width", "Lcoil/size/Dimension;", "height", "", "coil-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "-Sizes")
/* renamed from: coil.size.-Sizes, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Sizes {
    @Deprecated(message = "Migrate to 'coil.size.Size.ORIGINAL'.", replaceWith = @ReplaceWith(expression = "Size.ORIGINAL", imports = {"coil.size.Size"}))
    public static /* synthetic */ void getOriginalSize$annotations() {
    }

    @NotNull
    public static final Size Size(@Px int i, @NotNull Dimension dimension) {
        return new Size(Dimensions.Dimension(i), dimension);
    }

    @NotNull
    public static final Size Size(@NotNull Dimension dimension, @Px int i) {
        return new Size(dimension, Dimensions.Dimension(i));
    }

    @NotNull
    public static final Size Size(@Px int i, @Px int i2) {
        return new Size(Dimensions.Dimension(i), Dimensions.Dimension(i2));
    }

    public static final boolean isOriginal(@NotNull Size size) {
        return Intrinsics.areEqual(size, Size.ORIGINAL);
    }

    @NotNull
    public static final Size getOriginalSize() {
        return Size.ORIGINAL;
    }
}
