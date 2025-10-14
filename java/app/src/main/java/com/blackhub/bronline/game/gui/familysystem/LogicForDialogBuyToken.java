package com.blackhub.bronline.game.gui.familysystem;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.FamiliesBuyTokenDialogBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: LogicForDialogBuyToken.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class LogicForDialogBuyToken {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJson;

    @Nullable
    public Animation anim;

    @Nullable
    public FamiliesBuyTokenDialogBinding binding;

    @Nullable
    public PopupWindow dialogBuyToken;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;

    public LogicForDialogBuyToken(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.actionsWithJson = actionsWithJSON;
        Object systemService = jNIActivity != null ? jNIActivity.getSystemService("layout_inflater") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        final FamiliesBuyTokenDialogBinding familiesBuyTokenDialogBindingInflate = FamiliesBuyTokenDialogBinding.inflate((LayoutInflater) systemService);
        this.binding = familiesBuyTokenDialogBindingInflate;
        if (familiesBuyTokenDialogBindingInflate != null) {
            this.anim = AnimationUtils.loadAnimation(familiesBuyTokenDialogBindingInflate.getRoot().getContext(), R.anim.button_click);
            PopupWindow popupWindow = new PopupWindow((View) familiesBuyTokenDialogBindingInflate.getRoot(), -1, -1, true);
            this.dialogBuyToken = popupWindow;
            popupWindow.setClippingEnabled(false);
            PopupWindow popupWindow2 = this.dialogBuyToken;
            UsefulKt.hideSystemUI(popupWindow2 != null ? popupWindow2.getContentView() : null);
            PopupWindow popupWindow3 = this.dialogBuyToken;
            if (popupWindow3 != null) {
                popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.familysystem.LogicForDialogBuyToken$$ExternalSyntheticLambda0
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        LogicForDialogBuyToken.lambda$4$lambda$0(this.f$0);
                    }
                });
            }
            familiesBuyTokenDialogBindingInflate.buttonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.LogicForDialogBuyToken$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogicForDialogBuyToken.lambda$4$lambda$1(this.f$0, view);
                }
            });
            familiesBuyTokenDialogBindingInflate.editTextTokenValue.setGUIManager(mainRoot.getGuiManager());
            familiesBuyTokenDialogBindingInflate.buttonBuyToken.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.LogicForDialogBuyToken$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    LogicForDialogBuyToken.lambda$4$lambda$3(familiesBuyTokenDialogBindingInflate, this, view);
                }
            });
        }
    }

    public static final void lambda$4$lambda$0(LogicForDialogBuyToken this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mainRoot.closeAndroidsButtons();
    }

    public static final void lambda$4$lambda$1(LogicForDialogBuyToken this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PopupWindow popupWindow = this$0.dialogBuyToken;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public static final void lambda$4$lambda$3(FamiliesBuyTokenDialogBinding _binding, LogicForDialogBuyToken this$0, View view) throws JSONException {
        ActionsWithJSON actionsWithJSON;
        Intrinsics.checkNotNullParameter(_binding, "$_binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strValueOf = String.valueOf(_binding.editTextTokenValue.getText());
        int i = ((StringsKt__StringsJVMKt.isBlank(strValueOf) ^ true) || strValueOf.length() > 0) ? Integer.parseInt(strValueOf) : 0;
        if (i != 0 && (actionsWithJSON = this$0.actionsWithJson) != null) {
            actionsWithJSON.buyToken(i);
        }
        PopupWindow popupWindow = this$0.dialogBuyToken;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void showDialog() {
        CustomEditText customEditText;
        Editable text;
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity != null) {
            PopupWindow popupWindow = this.dialogBuyToken;
            if (popupWindow != null) {
                popupWindow.showAtLocation(jNIActivity.getParentLayout(), 17, 0, 0);
            }
            FamiliesBuyTokenDialogBinding familiesBuyTokenDialogBinding = this.binding;
            if (familiesBuyTokenDialogBinding != null && (customEditText = familiesBuyTokenDialogBinding.editTextTokenValue) != null && (text = customEditText.getText()) != null) {
                text.clear();
            }
            FamiliesBuyTokenDialogBinding familiesBuyTokenDialogBinding2 = this.binding;
            TextView textView = familiesBuyTokenDialogBinding2 != null ? familiesBuyTokenDialogBinding2.textValueBuyToken : null;
            if (textView == null) {
                return;
            }
            textView.setText(jNIActivity.getString(R.string.common_string_with_bc, "0"));
        }
    }

    public final void updateCostInBC(int newCost) {
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity != null) {
            FamiliesBuyTokenDialogBinding familiesBuyTokenDialogBinding = this.binding;
            TextView textView = familiesBuyTokenDialogBinding != null ? familiesBuyTokenDialogBinding.textValueBuyToken : null;
            if (textView == null) {
                return;
            }
            textView.setText(jNIActivity.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithDot(Integer.valueOf(newCost))));
        }
    }

    public final void closeDialog() {
        PopupWindow popupWindow = this.dialogBuyToken;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void setNullableParameters() {
        closeDialog();
        this.binding = null;
        this.anim = null;
        this.dialogBuyToken = null;
    }
}

