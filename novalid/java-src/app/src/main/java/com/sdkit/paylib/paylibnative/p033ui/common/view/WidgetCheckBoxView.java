package com.sdkit.paylib.paylibnative.p033ui.common.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.C11403R;

@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0002R$\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/common/view/WidgetCheckBoxView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "isSelected", "selected", "", "setSelected", "a", "value", "Z", "setChecked", "(Z)V", "checked", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", SegmentConstantPool.INITSTRING, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class WidgetCheckBoxView extends AppCompatImageView {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean checked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetCheckBoxView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setChecked(boolean z) {
        this.checked = z;
        m1965a();
    }

    /* renamed from: a */
    public final void m1965a() {
        String string = getContext().getString(this.checked ? C11403R.string.paylib_native_selected : C11403R.string.paylib_native_not_selected);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(textDescriptionRes)");
        setContentDescription(string);
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.checked;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean selected) {
        setChecked(selected);
        super.setSelected(selected);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetCheckBoxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetCheckBoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WidgetCheckBoxView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
