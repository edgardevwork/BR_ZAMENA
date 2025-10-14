package com.sdkit.paylib.paylibnative.p033ui.widgets.webpay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sdkit.paylib.paylibnative.p033ui.common.view.WidgetCheckBoxView;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8185f0;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8364a;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.b */
/* loaded from: classes6.dex */
public final class C8451b extends ConstraintLayout implements InterfaceC8425k {

    /* renamed from: a */
    public InterfaceC8450a f4076a;

    /* renamed from: b */
    public final C8185f0 f4077b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.b$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* renamed from: a */
        public final void m3779a() {
            InterfaceC8450a interfaceC8450a = C8451b.this.f4076a;
            if (interfaceC8450a != null) {
                interfaceC8450a.mo3774e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3779a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f4079a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8450a f4080b;

        /* renamed from: c */
        public final /* synthetic */ C8451b f4081c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.b$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8451b f4082a;

            public a(C8451b c8451b) {
                this.f4082a = c8451b;
            }

            /* renamed from: a */
            public final Object m3781a(boolean z, Continuation continuation) {
                this.f4082a.f4077b.f2154d.setEnabled(!z);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m3781a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC8450a interfaceC8450a, C8451b c8451b, Continuation continuation) {
            super(2, continuation);
            this.f4080b = interfaceC8450a;
            this.f4081c = c8451b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f4080b, this.f4081c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f4079a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowMo3773b = this.f4080b.mo3773b();
                a aVar = new a(this.f4081c);
                this.f4079a = 1;
                if (stateFlowMo3773b.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8451b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        C8185f0 c8185f0M2127a = C8185f0.m2127a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8185f0M2127a, "inflate(LayoutInflater.from(context), this)");
        this.f4077b = c8185f0M2127a;
        m3777a();
        AbstractC8370g.m3466a(this, new a());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k
    public void setSelection(boolean z) {
        this.f4077b.f2154d.setSelected(z);
        setBackgroundResource(z ? C11403R.drawable.paylib_native_bg_widget_selected : C11403R.drawable.paylib_native_bg_widget_unselected);
        if (z) {
            WidgetCheckBoxView widgetCheckBoxView = this.f4077b.f2154d;
            Intrinsics.checkNotNullExpressionValue(widgetCheckBoxView, "binding.widgetCheckbox");
            AbstractC8364a.m3436a(widgetCheckBoxView);
        }
    }

    public /* synthetic */ C8451b(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* renamed from: a */
    public final void m3777a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* renamed from: a */
    public final void m3778a(InterfaceC8450a controller, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f4076a = controller;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(controller, this, null), 3, null);
    }
}
