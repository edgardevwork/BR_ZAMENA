package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParcelableSnapshotMutableDoubleState.android.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroid/os/Parcelable;", "value", "", "(D)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableDoubleState extends MutableDoubleState implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableDoubleState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ParcelableSnapshotMutableDoubleState createFromParcel(@NotNull Parcel parcel) {
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ParcelableSnapshotMutableDoubleState[] newArray(int size) {
            return new ParcelableSnapshotMutableDoubleState[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableDoubleState(double d) {
        super(d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeDouble(getDoubleValue());
    }

    /* compiled from: ParcelableSnapshotMutableDoubleState.android.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "getCREATOR$annotations", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }
    }
}
