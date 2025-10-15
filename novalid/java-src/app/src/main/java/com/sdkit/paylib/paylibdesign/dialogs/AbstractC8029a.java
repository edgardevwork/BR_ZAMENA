package com.sdkit.paylib.paylibdesign.dialogs;

import android.os.Bundle;
import androidx.fragment.app.FragmentStateManager;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.C11403R;

@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdesign/dialogs/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "", "onCreate", "", "a", "I", "getStyle", "()I", "style", SegmentConstantPool.INITSTRING, "(I)V", "com-sdkit-assistant_paylib_design"}, m7106k = 1, m7107mv = {1, 8, 0})
/* renamed from: com.sdkit.paylib.paylibdesign.dialogs.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8029a extends BottomSheetDialogFragment {

    /* renamed from: a, reason: from kotlin metadata */
    public final int style;

    public AbstractC8029a() {
        this(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, this.style);
    }

    public AbstractC8029a(int i) {
        this.style = i;
    }

    public /* synthetic */ AbstractC8029a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C11403R.style.paylib_design_bottom_dialog : i);
    }
}
