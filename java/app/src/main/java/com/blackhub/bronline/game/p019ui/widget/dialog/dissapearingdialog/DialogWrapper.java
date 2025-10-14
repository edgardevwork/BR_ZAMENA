package com.blackhub.bronline.game.p019ui.widget.dialog.dissapearingdialog;

import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.p003ui.platform.AbstractComposeView;
import androidx.compose.p003ui.platform.ViewRootForInspector;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;

/* compiled from: DisappearingDialog.kt */
/* loaded from: classes8.dex */
public final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {

    @NotNull
    public final View composeView;
    public final int defaultSoftInputMode;

    @NotNull
    public final DialogLayout dialogLayout;

    @NotNull
    public Function0<Unit> onDismissRequest;

    @NotNull
    public DialogProperties properties;

    /* compiled from: DisappearingDialog.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DialogWrapper(Function0 function0, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, dialogProperties, view, layoutDirection, j);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Override // androidx.compose.p003ui.platform.ViewRootForInspector
    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogWrapper(Function0<Unit> onDismissRequest, DialogProperties properties, View composeView, LayoutDirection layoutDirection, long j) {
        super(new ContextThemeWrapper(composeView.getContext(), R.style.FloatingDialogCustomWindowTheme), 0, 2, null);
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.composeView = composeView;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        this.defaultSoftInputMode = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DialogLayout dialogLayout = new DialogLayout(context, window);
        dialogLayout.setClipChildren(false);
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DialogWrapper$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline result) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(result, "result");
                result.setRect(0, 0, view.getWidth(), view.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(dialogLayout, ViewTreeSavedStateRegistryOwner.get(composeView));
        m15085updateParametersKtjjmr4(this.onDismissRequest, this.properties, layoutDirection, j);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DialogWrapper.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OnBackPressedCallback addCallback) {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                    DialogWrapper.this.onDismissRequest.invoke();
                }
            }
        }, 2, null);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return zOnTouchEvent;
    }

    /* renamed from: updateParameters-Ktjjmr4, reason: not valid java name */
    public final void m15085updateParametersKtjjmr4(@NotNull Function0<Unit> onDismissRequest, @NotNull DialogProperties properties, @NotNull LayoutDirection layoutDirection, long intOffset) {
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        setLayoutDirection(layoutDirection);
        if (!properties.getUsePlatformDefaultWidth() || this.dialogLayout.getUsePlatformDefaultWidth()) {
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.setGravity(8388659);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(android.R.color.transparent);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.0f);
        }
        Window window4 = getWindow();
        WindowManager.LayoutParams attributes = window4 != null ? window4.getAttributes() : null;
        if (attributes != null) {
            attributes.x = IntOffset.m13794getXimpl(intOffset) - (this.dialogLayout.getWidth() / 2);
        }
        if (attributes != null) {
            attributes.y = (IntOffset.m13795getYimpl(intOffset) - this.dialogLayout.getHeight()) - 10;
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setAttributes(attributes);
        }
        Window window6 = getWindow();
        if (window6 != null) {
            window6.setLayout(-2, -2);
        }
    }

    public final void setContent(@NotNull CompositionContext parentComposition, @NotNull Function2<? super Composer, ? super Integer, Unit> children) {
        Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
        Intrinsics.checkNotNullParameter(children, "children");
        this.dialogLayout.setContent(parentComposition, children);
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i2);
    }
}

