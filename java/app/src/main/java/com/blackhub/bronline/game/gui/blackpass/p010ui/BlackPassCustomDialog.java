package com.blackhub.bronline.game.gui.blackpass.p010ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.databinding.DonateDialogConfirmationBinding;
import com.blackhub.bronline.databinding.DonateDialogResultBinding;
import com.blackhub.bronline.game.common.DialogNoNavBar;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BlackPassCustomDialog.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BlackPassCustomDialog {
    public static final int $stable = 8;

    @NotNull
    public final Context context;

    @NotNull
    public final DialogNoNavBar dialog;
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> dialogClickListener;

    public BlackPassCustomDialog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        DialogNoNavBar dialogNoNavBar = new DialogNoNavBar(context);
        dialogNoNavBar.requestWindowFeature(1);
        Window window = dialogNoNavBar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = dialogNoNavBar.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.4f);
        }
        this.dialog = dialogNoNavBar;
    }

    @NotNull
    public final Function3<Integer, Integer, Integer, Unit> getDialogClickListener() {
        Function3 function3 = this.dialogClickListener;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogClickListener");
        return null;
    }

    public final void setDialogClickListener(@NotNull Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.dialogClickListener = function3;
    }

    public final void showConfirmationPopupDialog(@NotNull final ItemForDialogConfirmation currentData) {
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        cancelDialog();
        Object systemService = this.context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        DonateDialogConfirmationBinding donateDialogConfirmationBindingInflate = DonateDialogConfirmationBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(donateDialogConfirmationBindingInflate, "inflate(...)");
        donateDialogConfirmationBindingInflate.dwInfo.setText(UsefulKt.transformColors(donateDialogConfirmationBindingInflate.getRoot().getContext().getString(R.string.donate_text_info_for_br_popup, currentData.getBodyMessage(), Integer.valueOf(currentData.getPrice()), currentData.getPriceCurrency())));
        donateDialogConfirmationBindingInflate.dwCaption.setText(currentData.getCaption());
        donateDialogConfirmationBindingInflate.dwButtonOk.setText(currentData.getTextForButtonOK());
        donateDialogConfirmationBindingInflate.dwButtonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassCustomDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackPassCustomDialog.showConfirmationPopupDialog$lambda$4$lambda$2(currentData, this, view);
            }
        });
        donateDialogConfirmationBindingInflate.dwButtonCancel.setText(currentData.getTextForButtonCancel());
        donateDialogConfirmationBindingInflate.dwButtonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassCustomDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackPassCustomDialog.showConfirmationPopupDialog$lambda$4$lambda$3(this.f$0, view);
            }
        });
        DialogNoNavBar dialogNoNavBar = this.dialog;
        dialogNoNavBar.setContentView(donateDialogConfirmationBindingInflate.getRoot());
        dialogNoNavBar.show();
        Window window = dialogNoNavBar.getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
    }

    public static final void showConfirmationPopupDialog$lambda$4$lambda$2(ItemForDialogConfirmation currentData, BlackPassCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(currentData, "$currentData");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Integer action = currentData.getAction();
        if (action != null) {
            this$0.getDialogClickListener().invoke(Integer.valueOf(action.intValue()), currentData.getLevels(), currentData.getTaskId());
        }
        this$0.dismissDialog();
    }

    public static final void showConfirmationPopupDialog$lambda$4$lambda$3(BlackPassCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
    }

    public final void showResultDialog(@NotNull ObjForResultDialog currentObject) {
        Intrinsics.checkNotNullParameter(currentObject, "currentObject");
        cancelDialog();
        Object systemService = this.context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        DonateDialogResultBinding donateDialogResultBindingInflate = DonateDialogResultBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(donateDialogResultBindingInflate, "inflate(...)");
        donateDialogResultBindingInflate.dwDefault.setText(UsefulKt.transformColors(currentObject.getMessage()));
        if (currentObject.getSuccess() == 0) {
            donateDialogResultBindingInflate.dwIcon.setBackground(ContextCompat.getDrawable(this.context, R.drawable.checkbox_red));
        }
        donateDialogResultBindingInflate.dwBold.setText(UsefulKt.transformColors(currentObject.getBoldMessage()));
        donateDialogResultBindingInflate.dwCaption.setText(currentObject.getCaption());
        donateDialogResultBindingInflate.dwButtonOk.setText(currentObject.getButtonOK());
        donateDialogResultBindingInflate.dwButtonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassCustomDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackPassCustomDialog.showResultDialog$lambda$8$lambda$6(this.f$0, view);
            }
        });
        donateDialogResultBindingInflate.close.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassCustomDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackPassCustomDialog.showResultDialog$lambda$8$lambda$7(this.f$0, view);
            }
        });
        DialogNoNavBar dialogNoNavBar = this.dialog;
        dialogNoNavBar.setContentView(donateDialogResultBindingInflate.getRoot());
        dialogNoNavBar.show();
        Window window = dialogNoNavBar.getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
    }

    public static final void showResultDialog$lambda$8$lambda$6(BlackPassCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        this$0.getDialogClickListener().invoke(1, null, null);
    }

    public static final void showResultDialog$lambda$8$lambda$7(BlackPassCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
    }

    public final void cancelDialog() {
        this.dialog.cancel();
    }

    public final void dismissDialog() {
        this.dialog.dismiss();
    }
}

