package com.sdkit.paylib.paylibnative.p033ui.widgets.mobile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sdkit.paylib.paylibnative.p033ui.common.view.WidgetCheckBoxView;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8179c0;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.e */
/* loaded from: classes6.dex */
public final class C8407e extends ConstraintLayout implements InterfaceC8425k {

    /* renamed from: a */
    public InterfaceC8403a f3855a;

    /* renamed from: b */
    public final C8179c0 f3856b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.e$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* renamed from: a */
        public final void m3622a() {
            InterfaceC8403a interfaceC8403a = C8407e.this.f3855a;
            if (interfaceC8403a != null) {
                interfaceC8403a.mo3605e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3622a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.e$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3858a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8403a f3859b;

        /* renamed from: c */
        public final /* synthetic */ C8407e f3860c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.e$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8407e f3861a;

            public a(C8407e c8407e) {
                this.f3861a = c8407e;
            }

            /* renamed from: a */
            public final Object m3624a(boolean z, Continuation continuation) {
                this.f3861a.f3856b.f2113d.setEnabled(!z);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m3624a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC8403a interfaceC8403a, C8407e c8407e, Continuation continuation) {
            super(2, continuation);
            this.f3859b = interfaceC8403a;
            this.f3860c = c8407e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f3859b, this.f3860c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3858a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowMo3604b = this.f3859b.mo3604b();
                a aVar = new a(this.f3860c);
                this.f3858a = 1;
                if (stateFlowMo3604b.collect(aVar, this) == coroutine_suspended) {
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
    public C8407e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        C8179c0 c8179c0M2115a = C8179c0.m2115a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8179c0M2115a, "inflate(LayoutInflater.from(context), this)");
        this.f3856b = c8179c0M2115a;
        m3620a();
        AbstractC8370g.m3466a(this, new a());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k
    public void setSelection(boolean z) {
        this.f3856b.f2113d.setSelected(z);
        setBackgroundResource(z ? C11403R.drawable.paylib_native_bg_widget_selected : C11403R.drawable.paylib_native_bg_widget_unselected);
        if (z) {
            WidgetCheckBoxView widgetCheckBoxView = this.f3856b.f2113d;
            Intrinsics.checkNotNullExpressionValue(widgetCheckBoxView, "binding.widgetCheckbox");
            AbstractC8364a.m3436a(widgetCheckBoxView);
        }
    }

    public /* synthetic */ C8407e(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* renamed from: a */
    public final void m3620a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* renamed from: a */
    public final void m3621a(InterfaceC8403a viewModel, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f3855a = viewModel;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(viewModel, this, null), 3, null);
    }
}
