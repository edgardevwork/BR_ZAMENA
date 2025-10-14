package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.TuningResetApplyBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TuningDialogResetDetails.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0006\u0010\u0016\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogResetDetails;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/blackhub/bronline/databinding/TuningResetApplyBinding;", "resetClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "ifApply", "", "getResetClickListener", "()Lkotlin/jvm/functions/Function1;", "setResetClickListener", "(Lkotlin/jvm/functions/Function1;)V", "closeDialogReset", "getContentView", "Landroid/view/View;", "initListeners", "showDialogReset", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TuningDialogResetDetails extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final TuningResetApplyBinding binding;
    public Function1<? super Boolean, Unit> resetClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDialogResetDetails(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        TuningResetApplyBinding tuningResetApplyBindingInflate = TuningResetApplyBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(tuningResetApplyBindingInflate, "inflate(...)");
        this.binding = tuningResetApplyBindingInflate;
    }

    @NotNull
    public final Function1<Boolean, Unit> getResetClickListener() {
        Function1 function1 = this.resetClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resetClickListener");
        return null;
    }

    public final void setResetClickListener(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.resetClickListener = function1;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogResetDetails$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TuningDialogResetDetails.initListeners$lambda$0(this.f$0, dialogInterface);
            }
        });
        this.binding.buttonCloseSubmenuApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogResetDetails$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TuningDialogResetDetails.initListeners$lambda$1(this.f$0, view);
            }
        });
        this.binding.buttonApplyResetDetails.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogResetDetails$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TuningDialogResetDetails.initListeners$lambda$2(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$0(TuningDialogResetDetails this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getResetClickListener().invoke(Boolean.FALSE);
    }

    public static final void initListeners$lambda$1(final TuningDialogResetDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogResetDetails$initListeners$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.dismiss();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public static final void initListeners$lambda$2(final TuningDialogResetDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogResetDetails$initListeners$3$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getResetClickListener().invoke(Boolean.TRUE);
                this.this$0.dismiss();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public final void showDialogReset() {
        this.binding.buttonCloseSubmenuApply.setEnabled(true);
        this.binding.buttonApplyResetDetails.setEnabled(true);
        show();
    }

    public final void closeDialogReset() {
        dismiss();
    }
}
