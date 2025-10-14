package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.databinding.TuningSubmenuApplyBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TuningDialogApply.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0016J\u001e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006!"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/blackhub/bronline/databinding/TuningSubmenuApplyBinding;", "myClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "ifApply", "", "getMyClickListener", "()Lkotlin/jvm/functions/Function1;", "setMyClickListener", "(Lkotlin/jvm/functions/Function1;)V", "closeDialog", "getContentView", "Landroid/view/View;", "initInterfaceForActionBuy", "initInterfaceForActionDiagnostic", "initInterfaceForActionRepair", "initInterfaceWithCurrency", "currentCurrency", "", "currentCost", "initListeners", "showDialogApply", "thisActions", "thisCost", "thisCurrency", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TuningDialogApply extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final TuningSubmenuApplyBinding binding;

    @NotNull
    public final Context context;
    public Function1<? super Boolean, Unit> myClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDialogApply(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        TuningSubmenuApplyBinding tuningSubmenuApplyBindingInflate = TuningSubmenuApplyBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(tuningSubmenuApplyBindingInflate, "inflate(...)");
        this.binding = tuningSubmenuApplyBindingInflate;
    }

    @NotNull
    public final Function1<Boolean, Unit> getMyClickListener() {
        Function1 function1 = this.myClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myClickListener");
        return null;
    }

    public final void setMyClickListener(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.myClickListener = function1;
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
        TuningSubmenuApplyBinding tuningSubmenuApplyBinding = this.binding;
        tuningSubmenuApplyBinding.buttonApplyBuy.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogApply$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TuningDialogApply.initListeners$lambda$2$lambda$0(this.f$0, view);
            }
        });
        tuningSubmenuApplyBinding.buttonCloseSubmenuApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogApply$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TuningDialogApply.initListeners$lambda$2$lambda$1(this.f$0, view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogApply$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TuningDialogApply.initListeners$lambda$3(this.f$0, dialogInterface);
            }
        });
    }

    public static final void initListeners$lambda$2$lambda$0(final TuningDialogApply this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogApply$initListeners$1$1$1
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
                this.this$0.getMyClickListener().invoke(Boolean.TRUE);
                this.this$0.closeDialog();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public static final void initListeners$lambda$2$lambda$1(final TuningDialogApply this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.TuningDialogApply$initListeners$1$2$1
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
                this.this$0.closeDialog();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public static final void initListeners$lambda$3(TuningDialogApply this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMyClickListener().invoke(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showDialogApply(int thisActions, int thisCost, int thisCurrency) {
        if (isShowing()) {
            closeDialog();
        }
        this.binding.buttonApplyBuy.setEnabled(true);
        this.binding.buttonCloseSubmenuApply.setEnabled(true);
        if (thisActions == 0) {
            initInterfaceForActionRepair();
        } else if (thisActions == 1) {
            initInterfaceForActionBuy();
        } else if (thisActions == 2) {
            initInterfaceForActionDiagnostic();
        } else if (thisActions == 4 || thisActions == 6) {
        }
        initInterfaceWithCurrency(thisCurrency, thisCost);
        show();
    }

    public final void initInterfaceForActionRepair() {
        TuningSubmenuApplyBinding tuningSubmenuApplyBinding = this.binding;
        tuningSubmenuApplyBinding.changeTitleSubmenuApply.setText(R.string.tuning_submenu_change_title_repair);
        tuningSubmenuApplyBinding.titlePriceAction.setText(R.string.tuning_submenu_title_repair);
        tuningSubmenuApplyBinding.buttonApplyBuy.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(tuningSubmenuApplyBinding.getRoot().getContext(), R.drawable.tuning_repair), (Drawable) null, (Drawable) null, (Drawable) null);
        tuningSubmenuApplyBinding.buttonApplyBuy.setText(R.string.tuning_submenu_button_repeat);
    }

    public final void initInterfaceForActionBuy() {
        TuningSubmenuApplyBinding tuningSubmenuApplyBinding = this.binding;
        tuningSubmenuApplyBinding.changeTitleSubmenuApply.setText(R.string.tuning_submenu_change_title_buy);
        tuningSubmenuApplyBinding.titlePriceAction.setText(R.string.tuning_submenu_title_buy);
        tuningSubmenuApplyBinding.buttonApplyBuy.setText(R.string.common_buy);
    }

    public final void initInterfaceForActionDiagnostic() {
        TuningSubmenuApplyBinding tuningSubmenuApplyBinding = this.binding;
        tuningSubmenuApplyBinding.changeTitleSubmenuApply.setText(R.string.tuning_submenu_change_title_diagnostic);
        tuningSubmenuApplyBinding.titlePriceAction.setText(R.string.tuning_submenu_title_diagnostic);
        tuningSubmenuApplyBinding.buttonApplyBuy.setText(R.string.common_diagnostic);
    }

    public final void initInterfaceWithCurrency(int currentCurrency, int currentCost) {
        TuningSubmenuApplyBinding tuningSubmenuApplyBinding = this.binding;
        if (currentCurrency == 0) {
            tuningSubmenuApplyBinding.iconMoneyApply.setImageResource(R.drawable.tuning_icon_gold);
            tuningSubmenuApplyBinding.tuningValuePriceApply.setText(this.context.getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
        } else {
            if (currentCurrency != 1) {
                return;
            }
            tuningSubmenuApplyBinding.iconMoneyApply.setImageResource(R.drawable.tuning_icon_black_coin);
            tuningSubmenuApplyBinding.tuningValuePriceApply.setText(this.context.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
        }
    }

    public final void closeDialog() {
        dismiss();
    }
}
