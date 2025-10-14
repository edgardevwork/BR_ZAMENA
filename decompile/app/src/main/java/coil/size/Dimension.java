package coil.size;

import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Dimension.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m7105d2 = {"Lcoil/size/Dimension;", "", "()V", "Pixels", "Undefined", "Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension$Undefined;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public abstract class Dimension {
    public /* synthetic */ Dimension(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Dimension() {
    }

    /* compiled from: Dimension.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension;", "px", "", "(I)V", "equals", "", "other", "", "hashCode", "toString", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nDimension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dimension.kt\ncoil/size/Dimension$Pixels\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Pixels extends Dimension {

        @JvmField
        public final int px;

        public Pixels(@Px int i) {
            super(null);
            this.px = i;
            if (i <= 0) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pixels) && this.px == ((Pixels) other).px;
        }

        /* renamed from: hashCode, reason: from getter */
        public int getPx() {
            return this.px;
        }

        @NotNull
        public String toString() {
            return String.valueOf(this.px);
        }
    }

    /* compiled from: Dimension.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m7105d2 = {"Lcoil/size/Dimension$Undefined;", "Lcoil/size/Dimension;", "()V", "toString", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes.dex */
    public static final class Undefined extends Dimension {

        @NotNull
        public static final Undefined INSTANCE = new Undefined();

        public Undefined() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Dimension.Undefined";
        }
    }
}
