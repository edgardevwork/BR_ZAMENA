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
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000Rc\u0010\u0007\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/ui/BlackPassCustomDialog;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dialog", "Lcom/blackhub/bronline/game/common/DialogNoNavBar;", "dialogClickListener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "currentAction", "levelsToBuy", "taskId", "", "getDialogClickListener", "()Lkotlin/jvm/functions/Function3;", "setDialogClickListener", "(Lkotlin/jvm/functions/Function3;)V", "cancelDialog", "dismissDialog", "showConfirmationPopupDialog", "currentData", "Lcom/blackhub/bronline/game/gui/donate/data/ItemForDialogConfirmation;", "showResultDialog", "currentObject", "Lcom/blackhub/bronline/game/gui/donate/data/ObjForResultDialog;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
