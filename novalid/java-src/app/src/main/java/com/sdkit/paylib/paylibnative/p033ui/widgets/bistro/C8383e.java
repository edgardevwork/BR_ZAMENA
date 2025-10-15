package com.sdkit.paylib.paylibnative.p033ui.widgets.bistro;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sdkit.paylib.paylibnative.p033ui.common.view.WidgetCheckBoxView;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8175a0;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.e */
/* loaded from: classes6.dex */
public final class C8383e extends ConstraintLayout implements InterfaceC8425k {

    /* renamed from: a */
    public InterfaceC8379a f3716a;

    /* renamed from: b */
    public final C8175a0 f3717b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.e$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* renamed from: a */
        public final void m3506a() {
            InterfaceC8379a interfaceC8379a = C8383e.this.f3716a;
            if (interfaceC8379a != null) {
                interfaceC8379a.mo3488e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3506a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.e$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3719a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8379a f3720b;

        /* renamed from: c */
        public final /* synthetic */ C8383e f3721c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.e$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8383e f3722a;

            public a(C8383e c8383e) {
                this.f3722a = c8383e;
            }

            /* renamed from: a */
            public final Object m3508a(boolean z, Continuation continuation) {
                this.f3722a.f3717b.f2093e.setEnabled(!z);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m3508a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC8379a interfaceC8379a, C8383e c8383e, Continuation continuation) {
            super(2, continuation);
            this.f3720b = interfaceC8379a;
            this.f3721c = c8383e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f3720b, this.f3721c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3719a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowMo3487b = this.f3720b.mo3487b();
                a aVar = new a(this.f3721c);
                this.f3719a = 1;
                if (stateFlowMo3487b.collect(aVar, this) == coroutine_suspended) {
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
    public C8383e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        C8175a0 c8175a0M2106a = C8175a0.m2106a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8175a0M2106a, "inflate(LayoutInflater.from(context), this)");
        this.f3717b = c8175a0M2106a;
        m3504a();
        AbstractC8370g.m3466a(this, new a());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k
    public void setSelection(boolean z) {
        this.f3717b.f2093e.setSelected(z);
        setBackgroundResource(z ? C11403R.drawable.paylib_native_bg_widget_selected : C11403R.drawable.paylib_native_bg_widget_unselected);
        if (z) {
            WidgetCheckBoxView widgetCheckBoxView = this.f3717b.f2093e;
            Intrinsics.checkNotNullExpressionValue(widgetCheckBoxView, "binding.widgetCheckbox");
            AbstractC8364a.m3436a(widgetCheckBoxView);
        }
    }

    public /* synthetic */ C8383e(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* renamed from: a */
    public final void m3504a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* renamed from: a */
    public final void m3505a(InterfaceC8379a viewModel, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f3716a = viewModel;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(viewModel, this, null), 3, null);
    }
}
