package com.sdkit.paylib.paylibnative.p033ui.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sdkit.paylib.paylibnative.p033ui.common.AbstractC8102a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.C8127a;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8202w;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8359a;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8372g;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8374i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.C11403R;

@Metadata(m7104d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\u0010¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002J\"\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0002@BX\u0083\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0002@BX\u0083\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\"\u0010#*\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b(\u0010)*\u0004\b*\u0010%¨\u00063"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/common/view/PaylibButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "enabled", "", "setEnabled", "", "newText", "animate", "a", "Lcom/sdkit/paylib/paylibnative/ui/common/view/a;", "style", "animateChanges", "Lcom/sdkit/paylib/paylibnative/ui/databinding/w;", "Lcom/sdkit/paylib/paylibnative/ui/databinding/w;", "binding", "", "value", "b", "I", "setCurrentBackgroundColor", "(I)V", "currentBackgroundColor", "c", "setCurrentTextColor", "currentTextColor", "Lcom/sdkit/paylib/paylibnative/ui/common/view/a$b;", "d", "Lcom/sdkit/paylib/paylibnative/ui/common/view/a$b;", "currentIcon", "e", "Ljava/lang/CharSequence;", "currentText", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "getTextView$delegate", "(Lcom/sdkit/paylib/paylibnative/ui/common/view/PaylibButton;)Ljava/lang/Object;", "textView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "getIconView$delegate", "iconView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", SegmentConstantPool.INITSTRING, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PaylibButton extends ConstraintLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final C8202w binding;

    /* renamed from: b, reason: from kotlin metadata */
    public int currentBackgroundColor;

    /* renamed from: c, reason: from kotlin metadata */
    public int currentTextColor;

    /* renamed from: d, reason: from kotlin metadata */
    public C8127a.b currentIcon;

    /* renamed from: e, reason: from kotlin metadata */
    public CharSequence currentText;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibButton$a */
    /* loaded from: classes6.dex */
    public static final class C8113a extends Lambda implements Function0 {

        /* renamed from: b */
        public final /* synthetic */ CharSequence f1896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8113a(CharSequence charSequence) {
            super(0);
            this.f1896b = charSequence;
        }

        /* renamed from: a */
        public final void m1950a() {
            PaylibButton.this.getTextView().setText(this.f1896b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1950a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibButton$b */
    /* loaded from: classes6.dex */
    public static final class C8114b extends Lambda implements Function1 {
        public C8114b() {
            super(1);
        }

        /* renamed from: a */
        public final void m1951a(float f) {
            PaylibButton.this.getTextView().setAlpha(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1951a(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibButton$c */
    /* loaded from: classes6.dex */
    public static final class C8115c extends Lambda implements Function1 {
        public C8115c() {
            super(1);
        }

        /* renamed from: a */
        public final void m1952a(int i) {
            PaylibButton.this.setCurrentBackgroundColor(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1952a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibButton$d */
    /* loaded from: classes6.dex */
    public static final class C8116d extends Lambda implements Function1 {
        public C8116d() {
            super(1);
        }

        /* renamed from: a */
        public final void m1953a(int i) {
            PaylibButton.this.setCurrentTextColor(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1953a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibButton$e */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C8117e extends FunctionReferenceImpl implements Function0 {
        public C8117e(Object obj) {
            super(0, obj, PaylibButton.class, "updateIconView", "updateIconView()V", 0);
        }

        /* renamed from: a */
        public final void m1954a() {
            ((PaylibButton) this.receiver).m1947a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1954a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.view.PaylibButton$f */
    /* loaded from: classes6.dex */
    public static final class C8118f extends Lambda implements Function1 {
        public C8118f() {
            super(1);
        }

        /* renamed from: a */
        public final void m1955a(float f) {
            PaylibButton.this.getIconView().setAlpha(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1955a(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaylibButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getIconView() {
        return this.binding.f2252b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTextView() {
        return this.binding.f2253c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentBackgroundColor(int i) {
        this.currentBackgroundColor = i;
        setBackgroundColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentTextColor(int i) {
        this.currentTextColor = i;
        this.binding.f2253c.setTextColor(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setAlpha(enabled ? 1.0f : 0.4f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaylibButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m1947a() {
        String string;
        Integer numM1973a;
        ImageView iconView = getIconView();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C8127a.b bVar = this.currentIcon;
        iconView.setImageDrawable(AbstractC8372g.m3475a(context, bVar != null ? Integer.valueOf(bVar.m1974b()) : null));
        ImageView iconView2 = getIconView();
        C8127a.b bVar2 = this.currentIcon;
        if (bVar2 == null || (numM1973a = bVar2.m1973a()) == null) {
            string = null;
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            string = context2.getString(numM1973a.intValue());
        }
        iconView2.setContentDescription(string);
        ImageView iconView3 = getIconView();
        Intrinsics.checkNotNullExpressionValue(iconView3, "iconView");
        C8127a.b bVar3 = this.currentIcon;
        iconView3.setVisibility((bVar3 != null ? Integer.valueOf(bVar3.m1974b()) : null) != null ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaylibButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C8202w c8202wM2161a = C8202w.m2161a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8202wM2161a, "inflate(LayoutInflater.from(context), this)");
        this.binding = c8202wM2161a;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C11403R.styleable.PaylibButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…eable.PaylibButton, 0, 0)");
        Integer numM3428a = AbstractC8359a.m3428a(typedArrayObtainStyledAttributes, C11403R.styleable.PaylibButton_paylib_button_background_color);
        setCurrentBackgroundColor(numM3428a != null ? numM3428a.intValue() : 0);
        Integer numM3428a2 = AbstractC8359a.m3428a(typedArrayObtainStyledAttributes, C11403R.styleable.PaylibButton_paylib_button_text_color);
        setCurrentTextColor(numM3428a2 != null ? numM3428a2.intValue() : 0);
        Integer numM3429b = AbstractC8359a.m3429b(typedArrayObtainStyledAttributes, C11403R.styleable.PaylibButton_paylib_button_icon);
        this.currentIcon = numM3429b != null ? new C8127a.b(numM3429b.intValue(), AbstractC8359a.m3429b(typedArrayObtainStyledAttributes, C11403R.styleable.PaylibButton_paylib_button_desc)) : null;
        m1947a();
        m1943a(this, typedArrayObtainStyledAttributes.getString(C11403R.styleable.PaylibButton_android_text), false, 2, null);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C11403R.styleable.PaylibButton_android_enabled, true));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new C8374i(getResources().getDimension(C11403R.dimen.paylib_native_payment_button_corner_radius)));
        setClipToOutline(true);
    }

    public /* synthetic */ PaylibButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m1942a(PaylibButton paylibButton, CharSequence charSequence, C8127a c8127a, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        paylibButton.m1948a(charSequence, c8127a, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m1943a(PaylibButton paylibButton, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        paylibButton.m1949a(charSequence, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1948a(CharSequence newText, C8127a style, boolean animateChanges) {
        boolean z;
        Intrinsics.checkNotNullParameter(style, "style");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iM3474a = AbstractC8372g.m3474a(context, style.m1968c());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int iM3474a2 = AbstractC8372g.m3474a(context2, style.m1970e());
        C8127a.b bVarM1969d = style.m1969d();
        Integer numValueOf = bVarM1969d != null ? Integer.valueOf(bVarM1969d.m1974b()) : null;
        if (animateChanges) {
            if (iM3474a == this.currentBackgroundColor && iM3474a2 == this.currentTextColor) {
                C8127a.b bVar = this.currentIcon;
                if (!Intrinsics.areEqual(numValueOf, bVar != null ? Integer.valueOf(bVar.m1974b()) : null)) {
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.currentIcon = style.m1969d();
        if (z) {
            AbstractC8102a.m1861a(this.currentBackgroundColor, iM3474a, (Function1) new C8115c());
            AbstractC8102a.m1861a(this.currentTextColor, iM3474a2, (Function1) new C8116d());
            AbstractC8102a.m1862a(new C8117e(this), new C8118f());
        } else {
            setCurrentBackgroundColor(iM3474a);
            setCurrentTextColor(iM3474a2);
            m1947a();
        }
        m1949a(newText, z);
    }

    /* renamed from: a */
    public final void m1949a(CharSequence newText, boolean animate) {
        if (animate) {
            AbstractC8102a.m1862a(new C8113a(newText), new C8114b());
        } else {
            getTextView().setText(newText);
        }
        getTextView().setContentDescription(getContext().getString(C11403R.string.paylib_native_payment_button_description, newText));
        this.currentText = newText;
    }
}
