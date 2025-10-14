package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8379a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8403a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8415c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8429c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8445a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8450a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import ru.rustore.sdk.billingclient.C11403R;

@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/widgets/paymentways/PaymentWaysView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/sdkit/paylib/paylibnative/ui/widgets/paymentways/d;", "controller", "Lkotlinx/coroutines/CoroutineScope;", PomReader.SCOPE, "", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "", "selectedPosition", "Lcom/sdkit/paylib/paylibnative/ui/widgets/paymentways/d;", "paymentWaysController", "Lcom/sdkit/paylib/paylibnative/ui/widgets/paymentways/adapter/a;", "b", "Lcom/sdkit/paylib/paylibnative/ui/widgets/paymentways/adapter/a;", "paymentWaysAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", SegmentConstantPool.INITSTRING, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentWaysView extends RecyclerView implements DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    public InterfaceC8418d paymentWaysController;

    /* renamed from: b, reason: from kotlin metadata */
    public final C8413a paymentWaysAdapter;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.PaymentWaysView$a */
    /* loaded from: classes6.dex */
    public static final class C8408a implements C8413a.c {

        /* renamed from: a */
        public final InterfaceC8418d f3864a;

        /* renamed from: b */
        public final CoroutineScope f3865b;

        public C8408a(InterfaceC8418d controller, CoroutineScope scope) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f3864a = controller;
            this.f3865b = scope;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a.c
        /* renamed from: a */
        public CoroutineScope mo3631a() {
            return this.f3865b;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a.c
        /* renamed from: b */
        public InterfaceC8450a mo3632b() {
            return this.f3864a.mo3658b();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a.c
        /* renamed from: d */
        public InterfaceC8445a mo3633d() {
            return this.f3864a.mo3659d();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a.c
        /* renamed from: e */
        public InterfaceC8387d mo3634e() {
            return this.f3864a.mo3660e();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a.c
        /* renamed from: f */
        public InterfaceC8379a mo3635f() {
            return this.f3864a.mo3661f();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a.c
        /* renamed from: g */
        public InterfaceC8403a mo3636g() {
            return this.f3864a.mo3662g();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8413a.c
        /* renamed from: h */
        public InterfaceC8429c mo3637h() {
            return this.f3864a.mo3663h();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.PaymentWaysView$b */
    public static final class C8409b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3866a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8418d f3867b;

        /* renamed from: c */
        public final /* synthetic */ PaymentWaysView f3868c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.PaymentWaysView$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ PaymentWaysView f3869a;

            public a(PaymentWaysView paymentWaysView) {
                this.f3869a = paymentWaysView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                this.f3869a.paymentWaysAdapter.m3650a(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8409b(InterfaceC8418d interfaceC8418d, PaymentWaysView paymentWaysView, Continuation continuation) {
            super(2, continuation);
            this.f3867b = interfaceC8418d;
            this.f3868c = paymentWaysView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8409b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C8409b(this.f3867b, this.f3868c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3866a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowMo3664k = this.f3867b.mo3664k();
                a aVar = new a(this.f3868c);
                this.f3866a = 1;
                if (stateFlowMo3664k.collect(aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.PaymentWaysView$c */
    public static final class C8410c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3870a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8418d f3871b;

        /* renamed from: c */
        public final /* synthetic */ PaymentWaysView f3872c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.PaymentWaysView$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ PaymentWaysView f3873a;

            public a(PaymentWaysView paymentWaysView) {
                this.f3873a = paymentWaysView;
            }

            /* renamed from: a */
            public final Object m3641a(int i, Continuation continuation) {
                this.f3873a.m3629a(i);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m3641a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8410c(InterfaceC8418d interfaceC8418d, PaymentWaysView paymentWaysView, Continuation continuation) {
            super(2, continuation);
            this.f3871b = interfaceC8418d;
            this.f3872c = paymentWaysView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8410c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C8410c(this.f3871b, this.f3872c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3870a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMo3665m = this.f3871b.mo3665m();
                a aVar = new a(this.f3872c);
                this.f3870a = 1;
                if (flowMo3665m.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentWaysView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: b */
    public static final void m3627b(PaymentWaysView this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.smoothScrollToPosition(i);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        InterfaceC8418d interfaceC8418d = this.paymentWaysController;
        if (interfaceC8418d != null) {
            interfaceC8418d.onStart();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentWaysView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m3628a() {
        setAdapter(this.paymentWaysAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentWaysView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paymentWaysAdapter = new C8413a();
        m3628a();
    }

    /* renamed from: a */
    public final void m3629a(final int selectedPosition) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (iFindLastCompletelyVisibleItemPosition < selectedPosition || iFindFirstCompletelyVisibleItemPosition > selectedPosition) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.PaymentWaysView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentWaysView.m3627b(this.f$0, selectedPosition);
                }
            });
        }
    }

    public /* synthetic */ PaymentWaysView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public final void m3630a(InterfaceC8418d controller, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.paymentWaysController = controller;
        this.paymentWaysAdapter.m3649a(new C8408a(controller, scope));
        addItemDecoration(new C8415c(getContext().getResources().getDimensionPixelSize(C11403R.dimen.paylib_design_spacer_6x), getContext().getResources().getDimensionPixelSize(C11403R.dimen.paylib_design_spacer_2x)));
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C8409b(controller, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C8410c(controller, this, null), 3, null);
    }
}
