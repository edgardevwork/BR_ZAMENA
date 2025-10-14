package com.sdkit.paylib.paylibnative.p033ui.widgets.tbank;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sdkit.paylib.paylibnative.p033ui.common.view.WidgetCheckBoxView;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8183e0;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.d */
/* loaded from: classes6.dex */
public final class C8448d extends ConstraintLayout implements InterfaceC8425k {

    /* renamed from: a */
    public InterfaceC8445a f4066a;

    /* renamed from: b */
    public final C8183e0 f4067b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.d$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* renamed from: a */
        public final void m3767a() {
            InterfaceC8445a interfaceC8445a = C8448d.this.f4066a;
            if (interfaceC8445a != null) {
                interfaceC8445a.mo3745e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3767a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f4069a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8445a f4070b;

        /* renamed from: c */
        public final /* synthetic */ C8448d f4071c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.d$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8448d f4072a;

            public a(C8448d c8448d) {
                this.f4072a = c8448d;
            }

            /* renamed from: a */
            public final Object m3769a(boolean z, Continuation continuation) {
                this.f4072a.f4067b.f2140e.setEnabled(!z);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m3769a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC8445a interfaceC8445a, C8448d c8448d, Continuation continuation) {
            super(2, continuation);
            this.f4070b = interfaceC8445a;
            this.f4071c = c8448d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f4070b, this.f4071c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f4069a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowMo3744b = this.f4070b.mo3744b();
                a aVar = new a(this.f4071c);
                this.f4069a = 1;
                if (stateFlowMo3744b.collect(aVar, this) == coroutine_suspended) {
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
    public C8448d(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        C8183e0 c8183e0M2123a = C8183e0.m2123a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8183e0M2123a, "inflate(LayoutInflater.from(context), this)");
        this.f4067b = c8183e0M2123a;
        m3765a();
        AbstractC8370g.m3466a(this, new a());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k
    public void setSelection(boolean z) {
        this.f4067b.f2140e.setSelected(z);
        setBackgroundResource(z ? C11403R.drawable.paylib_native_bg_widget_selected : C11403R.drawable.paylib_native_bg_widget_unselected);
        if (z) {
            WidgetCheckBoxView widgetCheckBoxView = this.f4067b.f2140e;
            Intrinsics.checkNotNullExpressionValue(widgetCheckBoxView, "binding.widgetCheckbox");
            AbstractC8364a.m3436a(widgetCheckBoxView);
        }
    }

    public /* synthetic */ C8448d(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* renamed from: a */
    public final void m3765a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* renamed from: a */
    public final void m3766a(InterfaceC8445a viewModel, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f4066a = viewModel;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(viewModel, this, null), 3, null);
    }
}
