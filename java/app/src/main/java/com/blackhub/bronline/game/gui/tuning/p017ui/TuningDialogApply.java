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

