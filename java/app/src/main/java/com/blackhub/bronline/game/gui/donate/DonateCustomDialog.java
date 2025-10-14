package com.blackhub.bronline.game.gui.donate;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.databinding.DonateDialogConfirmationBinding;
import com.blackhub.bronline.databinding.DonateDialogInputBinding;
import com.blackhub.bronline.databinding.DonateDialogResultBinding;
import com.blackhub.bronline.game.common.DialogNoNavBar;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateCustomDialog.kt */
@StabilityInferred(parameters = 0)

public final class DonateCustomDialog {
    public static final int $stable = 8;
    public Function1<? super Integer, Unit> clickListenerInBuyCarDialog;

    @NotNull
    public final Context context;

    @NotNull
    public final DialogNoNavBar dialog;

    @NotNull
    public final CircleProgressDialog progressDialog;
    public Function2<? super Integer, ? super Integer, Unit> resultClickListener;

    public DonateCustomDialog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.progressDialog = new CircleProgressDialog(context);
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
    public final Function1<Integer, Unit> getClickListenerInBuyCarDialog() {
        Function1 function1 = this.clickListenerInBuyCarDialog;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clickListenerInBuyCarDialog");
        return null;
    }

    public final void setClickListenerInBuyCarDialog(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.clickListenerInBuyCarDialog = function1;
    }

    @NotNull
    public final Function2<Integer, Integer, Unit> getResultClickListener() {
        Function2 function2 = this.resultClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resultClickListener");
        return null;
    }

    public final void setResultClickListener(@NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.resultClickListener = function2;
    }

    public final void showConfirmationPopupDialog(@NotNull final ItemForDialogConfirmation currentItem) {
        Intrinsics.checkNotNullParameter(currentItem, "currentItem");
        cancelDialog();
        Object systemService = this.context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        DonateDialogConfirmationBinding donateDialogConfirmationBindingInflate = DonateDialogConfirmationBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(donateDialogConfirmationBindingInflate, "inflate(...)");
        donateDialogConfirmationBindingInflate.dwInfo.setText(UsefulKt.transformColors(donateDialogConfirmationBindingInflate.getRoot().getContext().getString(R.string.donate_text_info_for_br_popup, currentItem.getBodyMessage(), Integer.valueOf(currentItem.getPrice()), currentItem.getPriceCurrency())));
        donateDialogConfirmationBindingInflate.dwCaption.setText(currentItem.getCaption());
        donateDialogConfirmationBindingInflate.dwButtonOk.setText(currentItem.getTextForButtonOK());
        donateDialogConfirmationBindingInflate.dwButtonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DonateCustomDialog.showConfirmationPopupDialog$lambda$3$lambda$1(this.f$0, currentItem, view);
            }
        });
        donateDialogConfirmationBindingInflate.dwButtonCancel.setText(currentItem.getTextForButtonCancel());
        donateDialogConfirmationBindingInflate.dwButtonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DonateCustomDialog.showConfirmationPopupDialog$lambda$3$lambda$2(this.f$0, view);
            }
        });
        DialogNoNavBar dialogNoNavBar = this.dialog;
        dialogNoNavBar.setContentView(donateDialogConfirmationBindingInflate.getRoot());
        dialogNoNavBar.show();
        Window window = dialogNoNavBar.getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
        dialogNoNavBar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DonateCustomDialog.showConfirmationPopupDialog$lambda$5$lambda$4(this.f$0, dialogInterface);
            }
        });
    }

    public static final void showConfirmationPopupDialog$lambda$3$lambda$1(DonateCustomDialog this$0, ItemForDialogConfirmation currentItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentItem, "$currentItem");
        this$0.showProgressDialog();
        if (currentItem.getCarColor() == null) {
            this$0.getResultClickListener().invoke(2, 0);
            return;
        }
        Function1<Integer, Unit> clickListenerInBuyCarDialog = this$0.getClickListenerInBuyCarDialog();
        Integer carColor = currentItem.getCarColor();
        clickListenerInBuyCarDialog.invoke(Integer.valueOf(carColor != null ? carColor.intValue() : 0));
    }

    public static final void showConfirmationPopupDialog$lambda$3$lambda$2(DonateCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
    }

    public static final void showConfirmationPopupDialog$lambda$5$lambda$4(DonateCustomDialog this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.progressDialog.closeProgress();
    }

    public final void showProgressDialog() {
        this.progressDialog.showProgressDialog();
    }

    public final void showResultDialog(@NotNull final ObjForResultDialog currentObject) {
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
        donateDialogResultBindingInflate.dwButtonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DonateCustomDialog.showResultDialog$lambda$9$lambda$6(this.f$0, currentObject, view);
            }
        });
        donateDialogResultBindingInflate.close.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DonateCustomDialog.showResultDialog$lambda$9$lambda$7(this.f$0, view);
            }
        });
        this.dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DonateCustomDialog.showResultDialog$lambda$9$lambda$8(currentObject, this, dialogInterface);
            }
        });
        DialogNoNavBar dialogNoNavBar = this.dialog;
        dialogNoNavBar.setContentView(donateDialogResultBindingInflate.getRoot());
        dialogNoNavBar.show();
        Window window = dialogNoNavBar.getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
    }

    public static final void showResultDialog$lambda$9$lambda$6(DonateCustomDialog this$0, ObjForResultDialog currentObject, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentObject, "$currentObject");
        this$0.getResultClickListener().invoke(Integer.valueOf(currentObject.getCurrentAction()), 0);
    }

    public static final void showResultDialog$lambda$9$lambda$7(DonateCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
    }

    public static final void showResultDialog$lambda$9$lambda$8(ObjForResultDialog currentObject, DonateCustomDialog this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(currentObject, "$currentObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (currentObject.getCurrentAction() == 999) {
            this$0.getResultClickListener().invoke(Integer.valueOf(currentObject.getCurrentAction()), 0);
        }
        this$0.progressDialog.closeProgress();
    }

    public final void showInputCustomValueOfMoneyDialog() {
        cancelDialog();
        Object systemService = this.context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        final DonateDialogInputBinding donateDialogInputBindingInflate = DonateDialogInputBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(donateDialogInputBindingInflate, "inflate(...)");
        donateDialogInputBindingInflate.dwButtonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DonateCustomDialog.showInputCustomValueOfMoneyDialog$lambda$13$lambda$11(this.f$0, view);
            }
        });
        donateDialogInputBindingInflate.dwButtonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DonateCustomDialog.showInputCustomValueOfMoneyDialog$lambda$13$lambda$12(donateDialogInputBindingInflate, this, view);
            }
        });
        donateDialogInputBindingInflate.input.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$showInputCustomValueOfMoneyDialog$1$3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable p0) {
                donateDialogInputBindingInflate.value.setText(this.getFinalCustomValueOfRubles(String.valueOf(p0)));
            }
        });
        DialogNoNavBar dialogNoNavBar = this.dialog;
        dialogNoNavBar.setContentView(donateDialogInputBindingInflate.getRoot());
        dialogNoNavBar.show();
        Window window = dialogNoNavBar.getWindow();
        UsefulKt.hideSystemUI(window != null ? window.getDecorView() : null);
        dialogNoNavBar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.donate.DonateCustomDialog$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DonateCustomDialog.showInputCustomValueOfMoneyDialog$lambda$15$lambda$14(this.f$0, dialogInterface);
            }
        });
    }

    public static final void showInputCustomValueOfMoneyDialog$lambda$13$lambda$11(DonateCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dialog.dismiss();
    }

    public static final void showInputCustomValueOfMoneyDialog$lambda$13$lambda$12(DonateDialogInputBinding this_with, DonateCustomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this_with.input.getEditableText().toString(), "")) {
            return;
        }
        this$0.getResultClickListener().invoke(3, Integer.valueOf(Integer.parseInt(this_with.input.getEditableText().toString())));
    }

    public static final void showInputCustomValueOfMoneyDialog$lambda$15$lambda$14(DonateCustomDialog this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getResultClickListener().invoke(333, 0);
        this$0.progressDialog.closeProgress();
    }

    public final String getFinalCustomValueOfRubles(String strValue) {
        if (strValue.length() > 0 && strValue.charAt(0) != '0') {
            String string = this.context.getString(R.string.donate_final_value_of_rubles, Integer.valueOf(Integer.parseInt(strValue) * 1000));
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = this.context.getString(R.string.donate_final_value_of_rubles, 0);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final void cancelDialog() {
        this.dialog.cancel();
    }

    public final void dismissDialog() {
        this.dialog.dismiss();
    }
}

