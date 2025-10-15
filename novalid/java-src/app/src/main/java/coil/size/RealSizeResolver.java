package coil.size;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealSizeResolver.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0011\u0010\u0002\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"Lcoil/size/RealSizeResolver;", "Lcoil/size/SizeResolver;", "size", "Lcoil/size/Size;", "(Lcoil/size/Size;)V", "equals", "", "other", "", "hashCode", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class RealSizeResolver implements SizeResolver {

    @NotNull
    public final Size size;

    public RealSizeResolver(@NotNull Size size) {
        this.size = size;
    }

    @Override // coil.size.SizeResolver
    @Nullable
    public Object size(@NotNull Continuation<? super Size> continuation) {
        return this.size;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RealSizeResolver) && Intrinsics.areEqual(this.size, ((RealSizeResolver) other).size);
    }

    public int hashCode() {
        return this.size.hashCode();
    }
}
