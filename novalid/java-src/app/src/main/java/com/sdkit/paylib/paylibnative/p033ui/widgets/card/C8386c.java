package com.sdkit.paylib.paylibnative.p033ui.widgets.card;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.paylibnative.p033ui.common.view.WidgetCheckBoxView;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8177b0;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8201v;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8364a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8396b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8399e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c */
/* loaded from: classes6.dex */
public final class C8386c extends LinearLayout implements InterfaceC8425k {

    /* renamed from: f */
    public static final b f3724f = new b(null);

    /* renamed from: a */
    public InterfaceC8387d f3725a;

    /* renamed from: b */
    public CoroutineDispatchers f3726b;

    /* renamed from: c */
    public final Lazy f3727c;

    /* renamed from: d */
    public final C8177b0 f3728d;

    /* renamed from: e */
    public final C8201v f3729e;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$a */
    public static final class a {

        /* renamed from: a */
        public final float f3730a;

        /* renamed from: b */
        public final float f3731b;

        public a(float f, float f2) {
            this.f3730a = f;
            this.f3731b = f2;
        }

        /* renamed from: a */
        public final float m3529a() {
            return this.f3730a;
        }

        /* renamed from: b */
        public final float m3530b() {
            return this.f3731b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f3730a, aVar.f3730a) == 0 && Float.compare(this.f3731b, aVar.f3731b) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f3731b) + (Float.hashCode(this.f3730a) * 31);
        }

        public String toString() {
            return "AnimationCoords(start=" + this.f3730a + ", stop=" + this.f3731b + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$c */
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function0 f3732a;

        public c(Function0 function0) {
            this.f3732a = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f3732a.invoke();
            super.onAnimationStart(animation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        /* renamed from: a */
        public final void m3531a() {
            FrameLayout frameLayout = C8386c.this.f3729e.f2249f;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "loyaltyBinding.loyaltyRoot");
            frameLayout.setVisibility(8);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3531a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Context f3734a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.f3734a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(this.f3734a);
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(context)");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3735a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8387d f3736b;

        /* renamed from: c */
        public final /* synthetic */ C8386c f3737c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$f$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8386c f3738a;

            public a(C8386c c8386c) {
                this.f3738a = c8386c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C8395a c8395a, Continuation continuation) {
                this.f3738a.m3525a(c8395a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC8387d interfaceC8387d, C8386c c8386c, Continuation continuation) {
            super(2, continuation);
            this.f3736b = interfaceC8387d;
            this.f3737c = c8386c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f3736b, this.f3737c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3735a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow selectedCard = this.f3736b.getSelectedCard();
                a aVar = new a(this.f3737c);
                this.f3735a = 1;
                if (selectedCard.collect(aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$g */
    /* loaded from: classes7.dex */
    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3739a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8387d f3740b;

        /* renamed from: c */
        public final /* synthetic */ C8386c f3741c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$g$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8386c f3742a;

            public a(C8386c c8386c) {
                this.f3742a = c8386c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C8399e c8399e, Continuation continuation) {
                this.f3742a.m3527a(c8399e);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC8387d interfaceC8387d, C8386c c8386c, Continuation continuation) {
            super(2, continuation);
            this.f3740b = interfaceC8387d;
            this.f3741c = c8386c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f3740b, this.f3741c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3739a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowMo3546j = this.f3740b.mo3546j();
                a aVar = new a(this.f3741c);
                this.f3739a = 1;
                if (stateFlowMo3546j.collect(aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$h */
    /* loaded from: classes7.dex */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3743a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8387d f3744b;

        /* renamed from: c */
        public final /* synthetic */ C8386c f3745c;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$h$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a implements FlowCollector, FunctionAdapter {

            /* renamed from: a */
            public final /* synthetic */ C8386c f3746a;

            public a(C8386c c8386c) {
                this.f3746a = c8386c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C8396b c8396b, Continuation continuation) {
                Object objM3538b = h.m3538b(this.f3746a, c8396b, continuation);
                return objM3538b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM3538b : Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f3746a, C8386c.class, "renderCardWidgetState", "renderCardWidgetState(Lcom/sdkit/paylib/paylibnative/ui/widgets/card/viewobjects/CardWidgetStateVO;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC8387d interfaceC8387d, C8386c c8386c, Continuation continuation) {
            super(2, continuation);
            this.f3744b = interfaceC8387d;
            this.f3745c = c8386c;
        }

        /* renamed from: b */
        public static final /* synthetic */ Object m3538b(C8386c c8386c, C8396b c8396b, Continuation continuation) {
            c8386c.m3526a(c8396b);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f3744b, this.f3745c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3743a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowMo3543e = this.f3744b.mo3543e();
                a aVar = new a(this.f3745c);
                this.f3743a = 1;
                if (stateFlowMo3543e.collect(aVar, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$i */
    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        /* renamed from: a */
        public final void m3541a() {
            FrameLayout frameLayout = C8386c.this.f3729e.f2249f;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "loyaltyBinding.loyaltyRoot");
            frameLayout.setVisibility(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3541a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.c$j */
    public static final class j extends Animatable2.AnimationCallback {

        /* renamed from: a */
        public final /* synthetic */ AnimatedVectorDrawable f3748a;

        public j(AnimatedVectorDrawable animatedVectorDrawable) {
            this.f3748a = animatedVectorDrawable;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            this.f3748a.start();
            super.onAnimationEnd(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8386c(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3727c = LazyKt__LazyJVMKt.lazy(new e(context));
        C8177b0 c8177b0M2111a = C8177b0.m2111a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8177b0M2111a, "inflate(LayoutInflater.from(context), this)");
        this.f3728d = c8177b0M2111a;
        C8201v c8201vM2159a = C8201v.m2159a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8201vM2159a, "inflate(LayoutInflater.from(context), this)");
        this.f3729e = c8201vM2159a;
        setOrientation(1);
        c8177b0M2111a.f2100c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.widgets.card.c$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8386c.m3515a(this.f$0, view);
            }
        });
        c8177b0M2111a.f2105h.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.widgets.card.c$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8386c.m3519b(this.f$0, view);
            }
        });
        c8201vM2159a.f2245b.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.widgets.card.c$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8386c.m3520c(this.f$0, view);
            }
        });
    }

    /* renamed from: c */
    public static final void m3520c(C8386c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC8387d interfaceC8387d = this$0.f3725a;
        if (interfaceC8387d != null) {
            interfaceC8387d.mo3544g();
        }
    }

    private final RequestManager getRequestManager() {
        return (RequestManager) this.f3727c.getValue();
    }

    /* renamed from: a */
    public final AnimatorSet m3521a(a aVar, a aVar2, Function0 function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3729e.f2249f, "alpha", aVar.m3529a(), aVar.m3530b());
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f3729e.f2249f, "translationY", aVar2.m3529a(), aVar2.m3530b());
        objectAnimatorOfFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.play(objectAnimatorOfFloat2);
        animatorSet.addListener(new c(function0));
        return animatorSet;
    }

    /* renamed from: b */
    public final void m3528b() {
        m3521a(new a(0.0f, 1.0f), new a(-100.0f, 0.0f), new i()).start();
    }

    public final CoroutineDispatchers getCoroutineDispatchers$com_sdkit_assistant_paylib_native() {
        CoroutineDispatchers coroutineDispatchers = this.f3726b;
        if (coroutineDispatchers != null) {
            return coroutineDispatchers;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineDispatchers");
        return null;
    }

    public final void setCoroutineDispatchers$com_sdkit_assistant_paylib_native(CoroutineDispatchers coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "<set-?>");
        this.f3726b = coroutineDispatchers;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k
    public void setSelection(boolean z) {
        StateFlow stateFlowMo3546j;
        C8399e c8399e;
        this.f3728d.f2104g.setSelected(z);
        this.f3728d.f2100c.setBackgroundResource(z ? C11403R.drawable.paylib_native_bg_widget_selected : C11403R.drawable.paylib_native_bg_widget_unselected);
        if (z) {
            WidgetCheckBoxView widgetCheckBoxView = this.f3728d.f2104g;
            Intrinsics.checkNotNullExpressionValue(widgetCheckBoxView, "cardBinding.cardViewRadiobutton");
            AbstractC8364a.m3436a(widgetCheckBoxView);
        }
        InterfaceC8387d interfaceC8387d = this.f3725a;
        if (interfaceC8387d == null || (stateFlowMo3546j = interfaceC8387d.mo3546j()) == null || (c8399e = (C8399e) stateFlowMo3546j.getValue()) == null) {
            return;
        }
        if (c8399e.m3593d() || c8399e.m3592c() || c8399e.m3595f()) {
            if (z) {
                m3528b();
            } else {
                m3522a();
            }
        }
    }

    public /* synthetic */ C8386c(Context context, AttributeSet attributeSet, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    /* renamed from: b */
    public static final void m3519b(C8386c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC8387d interfaceC8387d = this$0.f3725a;
        if (interfaceC8387d != null) {
            interfaceC8387d.mo3545i();
        }
    }

    /* renamed from: a */
    public final void m3522a() {
        m3521a(new a(1.0f, 0.0f), new a(0.0f, -100.0f), new d()).start();
    }

    /* renamed from: a */
    public final void m3523a(C8201v c8201v) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(C11403R.attr.paylib_native_loading_icon, typedValue, true);
        Drawable drawable = ContextCompat.getDrawable(getContext(), typedValue.resourceId);
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.registerAnimationCallback(new j(animatedVectorDrawable));
        }
        c8201v.f2248e.setCompoundDrawablesWithIntrinsicBounds(animatedVectorDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.start();
        }
    }

    /* renamed from: a */
    public static final void m3515a(C8386c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC8387d interfaceC8387d = this$0.f3725a;
        if (interfaceC8387d != null) {
            interfaceC8387d.mo3542b();
        }
    }

    /* renamed from: a */
    public final void m3524a(InterfaceC8387d viewModel, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f3725a = viewModel;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new f(viewModel, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new g(viewModel, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new h(viewModel, this, null), 3, null);
    }

    /* renamed from: a */
    public final void m3525a(C8395a c8395a) {
        String strM3577b = c8395a != null ? c8395a.m3577b() : null;
        if (strM3577b != null && !StringsKt__StringsJVMKt.isBlank(strM3577b)) {
            getRequestManager().load(c8395a != null ? c8395a.m3577b() : null).placeholder(C11403R.drawable.paylib_native_ic_card_placeholder).priority(Priority.HIGH).into(this.f3728d.f2102e);
        }
        this.f3728d.f2101d.setText(c8395a != null ? c8395a.m3578c() : null);
        this.f3728d.f2103f.setText(c8395a != null ? c8395a.m3576a() : null);
        TextView textView = this.f3728d.f2103f;
        Intrinsics.checkNotNullExpressionValue(textView, "cardBinding.cardSecondLine");
        String strM3576a = c8395a != null ? c8395a.m3576a() : null;
        textView.setVisibility(true ^ (strM3576a == null || StringsKt__StringsJVMKt.isBlank(strM3576a)) ? 0 : 8);
    }

    /* renamed from: a */
    public final void m3526a(C8396b c8396b) {
        if (c8396b != null) {
            this.f3728d.f2104g.setEnabled(c8396b.m3580a());
        }
    }

    /* renamed from: a */
    public final void m3527a(C8399e c8399e) {
        C8201v c8201v = this.f3729e;
        if (c8399e != null) {
            TextView loyaltyLoading = c8201v.f2248e;
            Intrinsics.checkNotNullExpressionValue(loyaltyLoading, "loyaltyLoading");
            int i2 = 8;
            loyaltyLoading.setVisibility(c8399e.m3593d() ? 0 : 8);
            FrameLayout loyaltyInfo = c8201v.f2246c;
            Intrinsics.checkNotNullExpressionValue(loyaltyInfo, "loyaltyInfo");
            loyaltyInfo.setVisibility(c8399e.m3592c() ? 0 : 8);
            TextView loyaltyUnavailable = c8201v.f2250g;
            Intrinsics.checkNotNullExpressionValue(loyaltyUnavailable, "loyaltyUnavailable");
            if (c8399e.m3595f() && c8399e.m3591b() != null) {
                i2 = 0;
            }
            loyaltyUnavailable.setVisibility(i2);
            if (c8399e.m3591b() != null) {
                c8201v.f2250g.setText(c8399e.m3591b().intValue());
            }
            c8201v.f2245b.setChecked(Intrinsics.areEqual(c8399e.m3594e(), Boolean.TRUE));
            c8201v.f2247d.setText(c8399e.m3590a());
            if (c8399e.m3593d()) {
                m3523a(this.f3729e);
            }
        }
    }
}
